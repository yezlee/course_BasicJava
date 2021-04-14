

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import e_oop.ScanUtil;

public class JDBCBoard {

	public static void main(String[] args) {
		/*
		 * 오라클 데이터베이스에 게시판 테이블을 생성하고, 게시판 프로그램을 만들어주세요.
		 * 테이블 : TB_JDBC_BOARD
		 * 컬럼 : BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE
		*/

		while (true) {

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "yez";
			String password = "java";

			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;

			System.out.println("----------------------------------");
			System.out.println("번호\t제목\t내용\t작성자\t작성일");
			System.out.println("----------------------------------");

			try {
				con = DriverManager.getConnection(url, user, password);

				String sql = "select * from TB_JDBC_BOARD ORDER BY BOARD_NO";
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();

				while (rs.next()) {
					int BOARD_NO = rs.getInt(1);
					String TITLE = rs.getString(2);
					String CONTENT = rs.getString(3);
					String USER_ID = rs.getString(4);
					Date REG_DATE = rs.getDate(5);
					System.out.println(BOARD_NO + "\t" + TITLE + "\t" + CONTENT
							+ "\t" + USER_ID + "\t" + REG_DATE);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if(rs != null) try{ rs.close(); } catch(Exception e){}
				if(ps != null) try{ ps.close(); } catch(Exception e){}
				if(con != null) try{ con.close(); } catch(Exception e){}
			}

			System.out.println("----------------------------------");
			System.out.println("1.조회\t2.등록\t3.종료");
			System.out.print("입력>");
			int input = ScanUtil.nextInt();

			switch (input) {
			case 1: // 조회
				read();
				break;

			case 2: // 등록
				insert();
				break;

			case 3: // 종료
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
			}
		}
	}

	private static void insert() {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "yez";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		System.out.println("제목>");
		String title = ScanUtil.nextLine();
		System.out.println("내용>");
		String write = ScanUtil.nextLine();
		System.out.println("이름>");
		String userid = ScanUtil.nextLine();

		try {
			con = DriverManager.getConnection(url, user, password);

			String sql = "insert into TB_JDBC_BOARD values ( (select nvl(max(board_no),0)+1 from tb_jdbc_board) , ?, ?, ?, ?) ";
			ps = con.prepareStatement(sql);

			ps.setString(1, title);
			ps.setString(2, write);
			ps.setString(3, userid);
			ps.setDate(4, new Date(new java.util.Date().getTime()));

			int result = ps.executeUpdate();

			System.out.println(result + "개의 행이 바뀌었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try{ rs.close(); } catch(Exception e){}
			if(ps != null) try{ ps.close(); } catch(Exception e){}
			if(con != null) try{ con.close(); } catch(Exception e){}
		}
	}

	private static void read() {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "yez";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		System.out.print("게시글 번호 입력>");
		int no = ScanUtil.nextInt();

		System.out.println("----------------------------------");
		System.out.println("번호\t제목\t내용\t작성자\t작성일");
		System.out.println("----------------------------------");
		try {
			con = DriverManager.getConnection(url, user, password);

			String sql = "select * from TB_JDBC_BOARD where BOARD_NO IN ? ORDER BY BOARD_NO";
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			rs = ps.executeQuery();

			while (rs.next()) {
				int BOARD_NO = rs.getInt(1);
				String TITLE = rs.getString(2);
				String CONTENT = rs.getString(3);
				String USER_ID = rs.getString(4);
				Date REG_DATE = rs.getDate(5);
				System.out.println(BOARD_NO + "\t" + TITLE + "\t" + CONTENT
						+ "\t" + USER_ID + "\t" + REG_DATE);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try{ rs.close(); } catch(Exception e){}
			if(ps != null) try{ ps.close(); } catch(Exception e){}
			if(con != null) try{ con.close(); } catch(Exception e){}
		}

		System.out.println("--------------------------");
		System.out.println("1.수정\t2.삭제\t3.목록");
		System.out.print("입력>");
		int input = ScanUtil.nextInt();

		switch (input) {
		case 1: // 수정
			update(no);
			break;

		case 2: // 삭제
			delete(no);
			break;

		case 3: // 목록

			break;
		}
	}

	private static void update(int no) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "yez";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String write = ScanUtil.nextLine();
		try {

			con = DriverManager.getConnection(url, user, password);

			String sql = "Update TB_JDBC_BOARD set TITLE = ?, CONTENT = ? where BOARD_NO IN ? ";
			ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, write);
			ps.setInt(3, no);
			int result = ps.executeUpdate();

			System.out.println(result + "개의 행이 바뀌었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try{ rs.close(); } catch(Exception e){}
			if(ps != null) try{ ps.close(); } catch(Exception e){}
			if(con != null) try{ con.close(); } catch(Exception e){}
		}

	}

	private static void delete(int no) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "yez";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "DELETE TB_JDBC_BOARD WHERE BOARD_NO IN ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			int result = ps.executeUpdate();
			
			System.out.println(result + "개의 행이 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try{ rs.close(); } catch(Exception e){}
			if(ps != null) try{ ps.close(); } catch(Exception e){}
			if(con != null) try{ con.close(); } catch(Exception e){}
		}
	}
}
	

