package k_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class JDBCBoard2 {

	public static void main(String[] args) {
		JDBCBoard2 board = new JDBCBoard2();
		
		ArrayList<HashMap<String, Object>> boardList = board.getList();
		System.out.println("BOARD_NO    TITLE    CONTENT    USER_ID    REG_DATE");
		for(int i=0; i<boardList.size(); i++){
			HashMap<String, Object> dataMap = boardList.get(i);
//			for(String colName : dataMap.keySet()){
//				System.out.print(dataMap.get(colName) + "\t");
//			}
			System.out.print(dataMap.get("BOARD_NO") + "\t");
			System.out.print(dataMap.get("TITLE") + "\t");
			System.out.print(dataMap.get("CONTENT") + "\t");
			System.out.print(dataMap.get("USER_ID") + "\t");
			System.out.print(dataMap.get("REG_DATE"));
			System.out.println();
		}
		
		
	}
	
	public void insertBoard(){
		Scanner s = new Scanner(System.in);
		/*
		 * 오라클 데이터베이스에 게시판 테이블을 생성하고, 게시판 프로그램을 만들어주세요.
		 * 테이블 : TB_JDBC_BOARD
		 * 컬럼 : BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE
		 */
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "yez";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		System.out.println("제목 : ");
		String title = s.nextLine();
		
		System.out.println("내용 : ");
		String cont = s.nextLine();
		
		System.out.println("작성자 : ");
		String name = s.nextLine();
		
		try {
			con = DriverManager.getConnection(url,user,password);
			
			String sql = "insert into TB_JDBC_BOARD (BOARD_NO,TITLE,CONTENT,USER_ID,REG_DATE)"
					+ " values ( (select nvl(max(board_no),0)+1 from tb_jdbc_board) , ?, ?, ?, sysdate)";
			ps = con.prepareStatement(sql);
			
//			ps2.setInt(1, num++);
			ps.setString(1, title);
			ps.setString(2, cont);
			ps.setString(3, name);
			//ps.setDate(5, new Date(new java.util.Date().getTime()));
			
			int result = ps.executeUpdate(); // 행의 개수
			System.out.println(result + "개의 행이 바뀌었습니다.");
			
		} catch (SQLException e) {		
			e.printStackTrace();
		} finally { //닫을 때는 역순으로 닫아줌
			if(rs != null) try{ rs.close();} catch(Exception e) {}
			if(ps != null) try{ ps.close();} catch(Exception e) {}
			if(con != null) try{ con.close();} catch(Exception e) {}
		}
	}

	public ArrayList<HashMap<String, Object>> getList(){
		//데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "yez";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		ArrayList<HashMap<String, Object>> boardList = new ArrayList<>();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from tb_jdbc_board"; // 값을 따로 지정할 수 있다
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			ResultSetMetaData md = rs.getMetaData(); //메타데이터 : 데이터에 대한 데이터
			
			int columnCount = md.getColumnCount(); //컬럼 수 
			
			
			while(rs.next()){ // for문을 돌면서 값을 받음
				HashMap<String, Object> dataMap = new HashMap<>();
				for ( int i = 1; i  <= columnCount; i++){
					String colName = md.getColumnName(i);
					Object value = rs.getObject(i);
					dataMap.put(colName, value);
					//System.out.print(value + "\t");
				}
				//System.out.println();
				boardList.add(dataMap);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { //닫을 때는 역순으로 닫아줌
			if(rs != null) try{ rs.close();} catch(Exception e) {}
			if(ps != null) try{ ps.close();} catch(Exception e) {}
			if(con != null) try{ con.close();} catch(Exception e) {}
		}
		return boardList;
	}
}
