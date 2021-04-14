package e_oop.restaurant;

import java.util.Arrays;

public class Boss {

	public static void main(String[] args) {
		
		Alba alba = new Alba();
		//알바 클래스를 불러오는거지
		
		
		String[] order = alba.order(); 
		//데이터 타입이 있으면, 데이터타입 string이라고 적어주고(배열을쓸거야) 뒤에 order라는 변수 이름을 적고
		//위에 Alba라는 타입의 변수 이름이 alba임. 그걸 써서. alba.order라고 적고.
		
		System.out.println(Arrays.toString(order)); //자장면 탕수육이라는 결과를 받아서
		//order라는 배열을 출력. 
		
		
		System.out.println("요리 만드는 중... 완성!");
		String[] foods = {"완성된 짜장면", "완성된 탕수육"};
		//스트링 데이터 타입의 배열을 적고 foods라는 변수 이름을 적어주고
		//배열안에 배열적을때 {}이거 쓰잖아 그래서 안에다가 스트링 타입의 뭐시기 적어주고
		
		alba.serve(foods);
		//alba라는 데이터타입의 serve
		//alba 클래스에서 썼던 서브를 불러오는거지
		
		
		alba.pay(order);
	}

}
