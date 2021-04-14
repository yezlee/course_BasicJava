import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import e_oop.ScanUtil;


public class Hello {
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String password = "java";
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	
	public static void main(String[] args) {
		new Hello().start();
	}


	private void start() {
		
		while(true){			
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select board_no, title, user_id, reg_date from tb_jdbc_board";
			
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			System.out.println("--------------------------------------------");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("--------------------------------------------");
			
			while(rs.next()){ //다음행의 resultSet의 결과가 나오면 while문을 실행해라
				//뭐를 프린트할건지를 써줘야지. select문을 쿼리에 작성했고 그래서 rs라는 변수?를 지정해줬고.
				//그걸 이용해서 불러와야지. rs는 excuteQuery!
				//rs.get해서 내가 select문에서 result로 가져올수 있는걸 get하는거지
				//근데 그게 string이잖아. 그래서 getString
				//또 string이잖아. 불러올때 ""안에 넣어줘야해. 문자열 이니까
				//rs.getString()에 하나씩만 불러올수 있음. 
				//+써서 여러개 쓰면 에러뜸. "부적합한 열 이름" 
				//에러나는게 생각해보면 당연한게 while문으로 돌려서 열마다 하나씩 꺼내서 println으로 써주는건데
				//그걸 한번에 쓰면 안되지.
				System.out.println(rs.getString("board_no") + "\t" + rs.getString("title")
						+ "\t" + rs.getString("user_id") + "\t" + rs.getString("reg_date")); 				
			}
			System.out.println("--------------------------------------------");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();}catch (Exception e) {}
			if(ps != null) try {ps.close();}catch (Exception e) {}
			if(con != null) try {con.close();}catch (Exception e) {}
		}
		
		
		System.out.println("< 1.조회\t2.등록\t3.종료 >");
		
		
		int input = ScanUtil.nextInt();
		
		switch(input){
		case 1: 
			selectBoard();
			break;
			
		case 2:
			insertBoard();
			break;
		
		case 3:
			System.out.println("종료 되었습니다.");
			System.exit(0);
			//exit() 메소드는 현재 실행하고 있는 프로세스를 강제 종료시키는 역할을 합니다.
			//exit() 메소드는 int 매개값을 지정하도록 되어 있습니다. 이 값을 종료 상태값이라고 합니다. 
			//일반적으로 정상 종료일 경우 0으로 지정하고 비정상 종료일 경우 0이외의 다른값을 줍니다.
		}
		}
	}

	
	private void selectBoard() {
		System.out.println("조회할 게시물 번호를 입력해 주세요.");
		int boardNo = ScanUtil.nextInt();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select board_no, title, content, user_id, reg_date "
					+ "from tb_jdbc_board where board_no = ?";
			
			ps = con.prepareStatement(sql);
			ps.setInt(1, boardNo);
			rs = ps.executeQuery();
			
			while(rs.next()){
				System.out.println("--------------------------------------------");
				System.out.println("번호 : " + boardNo);
				System.out.println("제목 : " + rs.getString("title"));
				System.out.println("내용 : " + rs.getString("content"));
				System.out.println("작성자 : " + rs.getString("user_id"));
				System.out.println("작성일 : " + rs.getDate("reg_date"));
			}
			System.out.println("--------------------------------------------");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();}catch (Exception e) {}
			if(ps != null) try {ps.close();}catch (Exception e) {}
			if(con != null) try {con.close();}catch (Exception e) {}
		}
		
		
		System.out.println("<1.수정\t2.삭제\t3.목록>");
		int input = ScanUtil.nextInt();
		switch(input){
			case 1: 
				modifyBoard(boardNo);//그 번호의 게시물을 수정하는거니까. 선택의 여지가 없어. 
				break;
			
			case 2:
				deleteBoard(boardNo);
				break;
			
			case 3:
				break;
		}		
	}


	
	

	private void insertBoard() {
		//등록하는거잖아. 등록하라고 말을해야지. 그리고 입력한 값을 받아야지
		System.out.println("제목을 입력해주세요.");
		//제목을 입력받을 변수랑 메소드를 써야지
		String title_v = ScanUtil.nextLine();
		
		System.out.println("내용을 입력해주세요");
		String content_v = ScanUtil.nextLine();
		
		System.out.println("작성자를 입력해주세요.");
		String userid_v = ScanUtil.nextLine();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			String sql = "insert into tb_jdbc_board values((select nvl(max(board_no),0)+1 from tb_jdbc_board),?,?,?,sysdate)";
		
			ps = con.prepareStatement(sql);
			ps.setString(1, title_v);
			ps.setString(2, content_v);
			ps.setString(3, userid_v);
			
			int result = ps.executeUpdate();
			if(0 < result){
				System.out.println("등록이 완료 되었습니다.");
			}						
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();}catch (Exception e) {}
			if(ps != null) try {ps.close();}catch (Exception e) {}
			if(con != null) try {con.close();}catch (Exception e) {}
		}		
	}
	
	
	private void modifyBoard(int boardNo) {
		
		System.out.println("변경할 제목을 입력해주세요.");
		String title = ScanUtil.nextLine();
		System.out.println("변경할 내용을 입력해주세요.");
		String content = ScanUtil.nextLine();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "update tb_jdbc_board set title = ? , content= ? where board_no = ?";
			
			ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, boardNo);
			
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
	
	

	private void deleteBoard(int boardNo) {
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "delete tb_jdbc_board where board_no = ?";
			
			ps = con.prepareStatement(sql);			
			ps.setInt(1, boardNo);
			ps.executeUpdate();			
			
			System.out.println("삭제가 완료 되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();}catch (Exception e) {}
			if(ps != null) try {ps.close();}catch (Exception e) {}
			if(con != null) try {con.close();}catch (Exception e) {}
		}
		
		
	}


	
}
