package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil {

	//게시판에서 뭔가 반복을 너무 많이해서 그걸 좀 줄이기 위해 이 수업중
	//싱글톤 패턴으로 만들거임
	//싱글톤 패턴 : 인스턴스(객체)의 생성을 제한하여 하나의 인스턴스만 사용하는 디자인 패턴
	//객체를 여러개 생성 하면 각자의 값을 고유하게 갖고있지만 그럴필요가 없는 경우
	
	private JDBCUtil(){ //이렇게 생성자 만들어주고
		
	}
	
	//다른클래스에서 생성자 만들지 못하니까 이 클래스에서 생성자 만들어야돼. 그걸 보관할걸 만들자
	
	//인스턴스를 보관할 변수
	private static JDBCUtil instance;
	
	//인스턴스를 빌려주는 메소드
	public static JDBCUtil getInstance() {
		if(instance == null){
			instance = new JDBCUtil();
		}
		return instance;		
	}
	
	//위에 이것만 있음 싱글톤 만들수 있어
	
	
	
	//다른클래스에서 아래 내용들을 알 필요가 없으니까 프라이빗 붙여줘
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "yez";
	private String password = "java";

	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	

	/*
	 * Map<String, Object> selectOne(String sql)  --row하나만 선택하겠다. where절 같은 역할. 딱 한줄만 조회하겠다.
	 * 쿼리만 넘기고 그 안에 값대신 물음표로 하잖아. 이건 물음표가 없는경우
	 * Map<String, Object> selectOne(String sql, List<object> param) 
	 * 이건 물음표가 있는 경우. 리스트타입의 파라미터에 값을 넣어주는거야. 물음표에 넣을값들을 파라미터에 넘겨주는거. 얘는 하나만 조회하기때문에 맵이고
	 * List<Map<String, Object>> selectList(String sql) 얘는 리스트안에 맵이 있는거지
	 * List<Map<String, Object>> selectList(String sql, List<Object> param)
	 * int update(String sql) 몇개의 행이 영향을 받았는지 리턴해주는거
	 * int update(String sql, List<Object> param)
	 */
	
	//이렇게 6개를 만들어야함.
	
	//위에있는 6개중 하나. 제일 어려운거. 물음표가 있고. 리스트이고.
	public List<Map<String, Object>> selectList(String sql, List<Object> param){
		   List<Map<String, Object>> list = new ArrayList<>(); //얘는 리턴을 해줘야하기 때문에 트라이 안에서 만들수 없어
		 
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			
			for(int i = 0; i < param.size(); i++){
				ps.setObject(i + 1, param.get(i));
			}
			
			rs = ps.executeQuery(); 
			
		    ResultSetMetaData md = rs.getMetaData(); //몇개가 있는지. 데이터들이 몇개있는지 알수있으니까
		    
		    int columnCount = md.getColumnCount();
		    
		    
		    
		  //얘넬 다 한곳에 담아서 리턴해 줘야하는데 그게 이 리스트. List<Map<String, Object>> 이걸 리턴해줘야해
		    //그럴려면 변수를 만들어야해. 바로 위에 for문에서 돌고있는애를 담아줄 변수가 필요해. 그게 저 위에 list		    
		    while(rs.next()){
		        Map<String, Object> row = new HashMap<>(); //이 위치도 중요함. 이 WHILE문이 한번 돌때마다 한줄이 나오는거지. 
		        //그래서 한줄 돌때마다 이 해쉬맵 안에다 담아주는거지. 꼭 이위치 여야함. WHILE문 안에 있어야해.
		    	for(int i = 1; i <= columnCount; i++){
		    		String key = md.getColumnName(i);
		    		Object value = rs.getObject(i);
		    		row.put(key, value);		    		
		    	}
		    	list.add(row);
		    	
		    } 
		    
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try{ rs.close(); } catch(Exception e){}
			if(ps != null) try{ ps.close(); } catch(Exception e){}
			if(con != null) try{ con.close(); } catch(Exception e){}
		}
		
		return list;   //여기까지 하면 selectlist 메소드 하나 끝난거.
	}
	
	
	/*public Map<String, Object> selectOne(String sql){
		Map<String,Object> row = new HashMap<>();
		
		try{
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	*/
	
	
}

