package e_oop.restaurant;

public class Alba {
	
	//메소드 : 알바가 할 일(보스가 알바에게 시킨 일)
	//파라미터 : 일을 하기 위해 필요한 것(보스가 알바에게 주는 것)
	//리턴타입 : 일을 하고 난 후에 돌려주는 것(알바가 보스에게 주는것)
	
	//주문 받기 위해 필요한 것?  없음. 그냥 주문받아라 라고 말만 하니까
	//주문 받은 후 보스에게 줄 것?(리턴타입) 주문서
	String[] order(){
		System.out.println("주문 하시겠습니까?");
		return new String[]{"짜장면", "탕수육"};
	}
	
	//서빙하기 위해 필요한 것? 완성된 음식. 
	//서빙 후 보스에게 줄 것?(리턴타입) 없음.   - 결정됐으니까 메소드 만들어보자
	void serve(String[] foods){
		System.out.println("맛있게 드세요.");
	}
	
	//계산하기 위해 필요한 것? 계산서
	//계산 후에 보스에게 줄 것?(리턴타입) 없음. 돈은 돈통에 넣음 되니까
	void pay(String[] order){
		System.out.println("2만원입니다. 안녕히가세요.");
	}
	
}
