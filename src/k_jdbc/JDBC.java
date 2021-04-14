package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {
		/*
		 * JDBC(Java Database Connectivity) - 자바와 데이터베이스를 연결해주는 라이브러리 - ojdbc :
		 * 오라클 JDBC
		 * 
		 * JDBC 작성단계 1. Connection 생성 2. Statement 생성(쿼리) 3. Query 실행 4.
		 * ResultSet에서 결과 추출(select인 경우) 5. ResultSet, Statement, Connection 닫기
		 */

		// 데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "yez";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// DriverManager : 데이터베이스에 접속하기 위한 드라이버를 관리해주는 클래스
			con = DriverManager.getConnection(url, user, password); // 서로 다른것들끼리 연결해주는 것을 도와주는게 드라이버임.
			// getConnection에서 드라이버 자동 로드 - 옛날에는 코드를 일일히 입력했었음. 지금은 user하면 자동으로
			// 선택해줌.

			
			// ojdbc6.jar 이걸 연결 해줘야 함. 이건 오라클 사이트에서 구할 수 있음.
			// https://www.oracle.com/database/technologies/jdbcdriver-ucp-downloads.html
			
			
			//쿼리 만드는거 시작점
			String sql = "select * from member";
			ps = con.prepareStatement(sql);

			// select
			rs = ps.executeQuery();

			// insert, update, delete
			// int result = ps.executeUpdate(); // 지금 select 하고 있는 중이니까 주석처리

			while (rs.next()) { // next가 있으면 아무것도 안하고 있다가 다음줄을 바라보는거야. 다음줄이
								// 없을때까지. 다음줄이 없으면 false가 오게되면서 while문이 종료가 됨.
				// 몇개의 row가 있는지. 그 수만큼 실행이 되는것.
				// 처음에 셋팅되면 rs가 첫번째줄을 바라봄.
				String memId = rs.getString(1); // 첫번째 행에 있는 값을 가져옴. varchar면
												// getString, 날짜면 getDate,
												// number면 getInt
				String memPass = rs.getString("MEM_PASS");
				System.out.println("MEM_ID : " + memId + " / MEM_PASS : " + memPass);
				
//				rs.getInt(1);
//				rs.getDate(1);
				
			}
			// 닫을때는 아까 갖고온? 순서 반대로 아래 finally 안에다가

			
			// 임의의 테이블 하나를 조회해서 테이블의 모든 내용을 출력해주세요.
			
			sql = "select * from emp";
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while (rs.next()){
				int empno = rs.getInt(1);
				String ename = rs.getString("ename");
				String job = rs.getString(3);
				int sal = rs.getInt(6);
				System.out.println("empno : " + empno + " / ename : " + ename + " / job : " + job +" / sal : "+ sal);
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e ){}
			if(ps != null) try { ps.close(); } catch(Exception e ){}
			if(con != null) try { con.close(); } catch(Exception e ){}
		}
	}
}
