package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import e_oop.ScanUtil;

public class JDBCBoard { //선생님답

	public static void main(String[] args) {
		/*
		 * 오라클 데이터베이스에 게시판 테이블을 생성하고, 게시판 프로그램을 만들어주세요.
		 * 테이블 : TB_JDBC_BOARD
		 * 컬럼 : BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE
		 */
		
		new JDBCBoard().start();
	}
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "yez";
	String password = "java";
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	private void start() {
		while(true){
			try {
				con = DriverManager.getConnection(url, user, password);
				
				String sql = "select board_no, title, content, user_id, reg_date from tb_jdbc_board order by board_no";
				ps = con.prepareStatement(sql);
				
				rs = ps.executeQuery();
				
				System.out.println("----------------------------------");
				System.out.println("번호\t제목\t작성자\t작성일");
				System.out.println("----------------------------------");
				while(rs.next()){
					System.out.println(rs.getInt("board_no") + "\t"
							+ rs.getString("title") + "\t"
							+ rs.getString("user_id") + "\t"
							+ rs.getDate("reg_date"));
				}
				System.out.println("----------------------------------");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if(rs != null) try { rs.close(); } catch(Exception e) {}
				if(ps != null) try { ps.close(); } catch(Exception e) {}
				if(con != null) try { con.close(); } catch(Exception e) {}
			}
			
			System.out.println("1.조회\t2.등록\t3.종료");
			System.out.print("입력>");
			int input = ScanUtil.nextInt();
			
			switch (input) {
			case 1: //조회
				selectBoard();
				break;
				
			case 2: //등록
				insertBoard();
				break;
				
			case 3: //종료
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			}
		}
	}

	private void selectBoard() {
		System.out.print("조회할 게시물 번호>");
		int boardNo = ScanUtil.nextInt();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select board_no, title, content, user_id, reg_date "
					+ "from tb_jdbc_board "
					+ "where board_no = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, boardNo);
			
			rs = ps.executeQuery();
			
			while(rs.next()){
				System.out.println("번호\t : " + rs.getInt("board_no"));
				System.out.println("작성자\t : " + rs.getString("user_id"));
				System.out.println("작성일\t : " + rs.getString("reg_date"));
				System.out.println("제목\t : " + rs.getString("title"));
				System.out.println("내용\t : " + rs.getString("content"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		System.out.println("1.수정\t2.삭제\t3.목록");
		System.out.print("입력>");
		int input = ScanUtil.nextInt();
		
		switch (input) {
		case 1: //수정
			updateBoard(boardNo);
			break;
			
		case 2: //삭제
			deleteBoard(boardNo);
			break;
		}
	}

	private void updateBoard(int boardNo) {
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "update tb_jdbc_board "
					+ "set title = ? "
					+ ", content = ? "
					+ "where board_no = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, boardNo);
			
			int result = ps.executeUpdate();
			if(0 < result){
				System.out.println("수정이 완료되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
	}

	private void deleteBoard(int boardNo) {
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "delete from tb_jdbc_board "
					+ "where board_no = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, boardNo);
			
			int result = ps.executeUpdate();
			if(0 < result){
				System.out.println("삭제가 완료되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
	}

	private void insertBoard() {
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		System.out.print("작성자>");
		String userId = ScanUtil.nextLine();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "insert into tb_jdbc_board values("
					+ "(select nvl(max(board_no), 0) + 1 from tb_jdbc_board)"
					+ ", ?, ?, ?, sysdate"
					+ ")";
			ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, userId);
			
			int result = ps.executeUpdate();
			if(0 < result){
				System.out.println("등록이 완료되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
	}

}










