package e_oop.restaurant;

public class Errand {

	//메소드는 : 할일
	//파라미터 : 할일을 하기 위해 필요한것
	//리턴타입 : 할일을 끝마친 후에 결과물을(?) 돌려주는것
	
	
	
	//심부름 시킬때? 없음. 말만 하는거. 심부름 해라
	//심부름 할때 줄것? 심부름 목록 리턴있음
	String[] list(){ // 그래서 오더 안에 파라미터가 없음
		System.out.println("심부름 좀 다녀올래?");
		return new String[]{"콩나물", "두부"};
	}
	

	
	//심부름 다녀 오기 위해 필요한건? 돈 (파라미터 유)
	//심부름 갈때? 
	void errand(String[] money){
		System.out.println("심부름 돈 여기있어.");		
	}
	
	
	//심부름 후 ? 엄만 할거 없지
	//받을건? 사온거
	void items(String[] list){
		System.out.println("잘 다녀왔니?");		
	}
	

}	


	

