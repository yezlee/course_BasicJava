package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Date;

public class JDBC2 {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "yez";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from cart where cart_member = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, "a001"); //첫번째 있는 물음표에 a001을 넣겠다.
//			ps.setInt(2, 100); //두번째 있는 물음표에 100을 넣겠다.
//			ps.setDate(3, new Date(new java.util.Date().getTime()));
			
			rs = ps.executeQuery();
			
			ResultSetMetaData md = rs.getMetaData(); //메타데이터 : 데이터에 대한 데이터
			
			int columnCount =  md.getColumnCount(); // 조회된 컬럼 수가 몇개인지 리턴해준다.
			
			while(rs.next()){
				for(int i = 1; i <= columnCount; i++){
					Object value = rs.getObject(i); //타입의 상관없이 object는 모든 클래스의 부모 클래스이기때문에
					//System.out.println(value + "\t");
				}
				//System.out.println();
			}
			
			
			//임의의 테이블에 insert 할 수 있는 코드를 작성해주세요.
			
			sql = "insert into dept values(?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, 50);
			ps.setString(2, "TEST");
			ps.setString(3, "TEST2");
			
			
			int result = ps.executeUpdate(); // int타입이야. 그 말은 몇개의 row가 영향을 받았는지 리턴해주는거 
			System.out.println(result + "개의 행이 바뀌었습니다.");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e ){}
			if(ps != null) try { ps.close(); } catch(Exception e ){}
			if(con != null) try { con.close(); } catch(Exception e ){}
		}
	}

	

}
