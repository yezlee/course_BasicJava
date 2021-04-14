import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import e_oop.ScanUtil;


public class boardtest {

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String password = "java";
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	
	public static void main(String[] args) {
		
		new boardtest().start(); //이 클래스안에 new는 이거 하나뿐인데, 이게 객체 생성이지. 
		//new를 사용하는건 객체생성, 배열만들때 인데. 객체생성에선 클래스를 만들어 놓고 그걸 실행할 준비를 하는게 new ...; 라고 하는거
	}


	private void start() {
		
		while (true) {						
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select board_no, title, user_id, reg_date from tb_jdbc_board";
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			System.out.println("------------------------------------------");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("------------------------------------------");

			while(rs.next()){
				System.out.println(rs.getInt("board_no") 
						+ "\t" + rs.getString("title") 
						+ "\t" + rs.getString("user_id") 
						+ "\t" + rs.getDate("reg_date"));
			}
			System.out.println("------------------------------------------");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();}catch (Exception e) {}
			if(ps != null) try {ps.close();}catch (Exception e) {}
			if(con != null) try {con.close();}catch (Exception e) {}
		}
		
		System.out.println("1.조회 \t 2.등록 \t 3.종료");
//		int input = 0;
//		ScanUtil.nextInt();
		
		int input = ScanUtil.nextInt();
		
		switch (input) {
		case 1:
			selectBoard();
			break;
		
		case 2:
			insertBoard();
			break;

		case 3:
			System.out.println("종료 되었습니다.");
			System.exit(0);
			break;			
		}
		}	
		
	}


	private void insertBoard() {
		System.out.println("제목을 입력해 주세요.");
		String title = ScanUtil.nextLine();
		
		System.out.println("내용을 입력해 주세요.");
		String content = ScanUtil.nextLine();
		
		System.out.println("작성자를 입력해 주세요.");
		String user_id = ScanUtil.nextLine();
		
		
		/*try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "insert into tb_jdbc_board "
					+ "values((select nvl(max(board_no), 0) + 1 from tb_jdbc_board),"
					+ " ?, ?, ?, sysdate)";
			ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, user_id);
			
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
		*/
		
		
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql2 = "select NVL(MAX(board_no),0)+1 cnt from tb_jdbc_board";
			//근데 제일 높은게 어떻게 null이 될수있어? 라고 생각했는데
			//갑자기 떠오른게, null값이 있을때 max함수 쓰면 null이 제일 큰 값임
			//그래서 널이 있으면 0으로 만들고 그걸 1 더해라
			//만약에 널이 없으면 
			
			
			ps = con.prepareStatement(sql2);
			rs = ps.executeQuery();
			
			int boardNo = 0;
			while(rs.next()){ //resultSet의 결과가 있으면
				boardNo = rs.getInt(1); //그럼 1이라는 정수를 얻어서 boardNo에 대입시켜라???
				//rs.getblah는 sql쿼리가 select문이어서 result가 있을때 쓸수 있는거
				//고로 셀렉문에서 실행한 nvl함수 행이 1이니까 왜냐 널이면 0을 넣고 1을 더하라고 했으니까
				//1아니거나 아 모르겠다
				//"select NVL(MAX(board_no),0)+1 from tb_jdbc_board"; 
				//이걸 실행하면, 그냥 제일 게시물번호가 큰거에서 1더한 값이 행으로 뜨는데
				//그 번호를 0으로 초기화 시키고 다음행이 있을때
				// 저 1을 얻는게 뭐지???????????????????????????
				
				
				// 근데 왜 저 위에 선생님이 쓴것도 
				// 다른 것들은 if문 안돌리고도 다 excuteUpdate잘되는데
				// 왜 저것만 result변수 줘서 if문 돌려야지만 업뎃이 되는거지?
				// hello 클래스 연습할때 그랬음.
			}
			
			String sql = "insert into tb_jdbc_board values(?,?,?,?,sysdate)";
			
			ps = con.prepareStatement(sql);
			ps.setInt(1, boardNo);
			ps.setString(2, title);
			ps.setString(3, content);
			ps.setString(4, user_id);
			
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();}catch (Exception e) {}
			if(ps != null) try {ps.close();}catch (Exception e) {}
			if(con != null) try {con.close();}catch (Exception e) {}
		}
		
		
		
	}


	private void selectBoard() {
		System.out.println("열람할 게시물 번호를 입력해주세요");
		int boardNo = ScanUtil.nextInt();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select board_no, title, content, user_id, reg_date "
					+ "from tb_jdbc_board where board_no = ?";
			
			ps = con.prepareStatement(sql);
			ps.setInt(1, boardNo); //ps에 접근해서 setInt라는 메소드를 호출하고 있는거. -> setInt를 이용해서 1번 물음표 안에다가 boardNO를 넣어주고 있음
			rs = ps.executeQuery();
			
			while(rs.next()){
				System.out.println("------------------------------------------");
				System.out.println("번호 : " + boardNo); //이렇게 해도 되고  rs.getInt("board_no");
				System.out.println("제목 : " + rs.getString("title"));
				System.out.println("내용 : " + rs.getString("content"));
				System.out.println("작성자 : " + rs.getString("user_id"));
				System.out.println("작성일 : " + rs.getDate("reg_date"));
				System.out.println("------------------------------------------");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();}catch (Exception e) {}
			if(ps != null) try {ps.close();}catch (Exception e) {}
			if(con != null) try {con.close();}catch (Exception e) {}
		}
		
		System.out.println("1.수정\t2.삭제\t3.목록");
		int input = ScanUtil.nextInt();
		switch (input) {
		case 1:
			modifyBoard(boardNo);
			break;

		case 2:
			deleteBoard(boardNo);
			break;
		}
	}


	private void deleteBoard(int remove) { //메소드에 파라미터를 만드는이유는 그 매소드 안에서 쓰려고
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "delete tb_jdbc_board where board_no = ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, remove);
			ps.executeUpdate();
			
			System.out.println("삭제가 완료되었습니다.");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();}catch (Exception e) {}
			if(ps != null) try {ps.close();}catch (Exception e) {}
			if(con != null) try {con.close();}catch (Exception e) {}
		}
		
		
	}


	private void modifyBoard(int boardNo2) {
		System.out.println("수정할 제목을 입력하세요.");
		String title = ScanUtil.nextLine();
		System.out.println("수정할 내용을 입력하세요.");
		String content = ScanUtil.nextLine();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "update tb_jdbc_board set title = ?, content = ? "
					+ "where board_no = ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, boardNo2);
			
			ps.executeUpdate();
			System.out.println("수정이 완료 되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();}catch (Exception e) {}
			if(ps != null) try {ps.close();}catch (Exception e) {}
			if(con != null) try {con.close();}catch (Exception e) {}
		}
		
	}

}
