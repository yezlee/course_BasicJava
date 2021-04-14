package I_api;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		/*
		 *  Wrapper 클래스 : 기본형 타입을 객체로 사용해야 할때 대신 사용하는 클래스 (혼코딩 498)
		 *  - boolean : Boolean
		 *  - char : Character
		 *  - byte : Byte
		 *  - short : Short
		 *  - int : Integer
		 *  - long : Long
		 *  - float : Float
		 *  - double : Double
		 */

		Integer iw = new Integer(20);
		
		System.out.println(Integer.TYPE + "/" + Integer.SIZE + "bit");
		
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		
		int parseInt = Integer.parseInt("20"); // 반드시 숫자로만 이루어진 문자열 이어야 한다. 
		
		ArrayList<Integer> list = new ArrayList<>(); // 내일 자세히 배울 예정. 배열인데 사용하기 조금 편한 배열. 
		//배열하고 생긴건 똑같이 생겼는데, 얘는 저장을 한만큼 배열의 길이가 늘어나.  배열은 직접 길이를 저장해줘야했는데
		//대신 얘는 객체를 저장해줘야돼. array안에 어떤 데이터 타입을 저장할것인가 정해서 <>안에 써줌. 
				
		//형변환이 가능하다. 
		list.add(new Integer(10)); 
		list.add(10); //그냥 인트도 저장가능 사실은 인트를 인티저 객체로 바꿔서 저장한거야. 그게 생략되서 그냥 바로 인트로 저장된것처럼 보이는데. 그건 아니고 자동으로 되어서 생략한거. 그걸 오토박싱이라함(저절로 형변환된거).
		//오토박싱 : 기본형타입이 wrapper클래스로 자동 변환
				
		//반대의 경우도 있음
		Integer integer = list.get(0); // array list에서 하나 꺼낸걸 저장할때 //0번 인덱스에 있는걸 가져와라 라는 뜻
		int i = list.get(0); //언박싱 : wrapper 클래스가 기본형 타입으로 자동 변환
		
	}

}
