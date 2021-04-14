package e_oop;

import java.util.Scanner; // 이거 만들어준 이유가  Integer.parseInt(s.nextLine());이거 불러오려고

public class ScanUtil {
	
	private static Scanner s = new Scanner(System.in);
	
//  유틸리티 성향의 메서드인 경우 static을 붙인다. 메서드에 스태틱을 붙이는 이유는 유틸성향이라?
//  유틸리티(컴퓨터 이용에 도움이 되는 각종 소프트웨어)	
	//- 자주 사용되고 많이 사용되는 기능들. 쉽게 사용할수있게....?
//	객체가 아니라 클래스를 통해서 불러온거고???
	public static String nextLine(){ //넥스트 라인이라는 메서드를 만들어주고
		return s.nextLine(); // 그걸 호출시킨거
	}
	
	public static int nextInt(){
//		Math.random{}
//		Math.round(a) - 이런애들이 다 스태틱이 붙어있는 애들
		return Integer.parseInt(s.nextLine()); //유틸성메소드를 만들어봄
	}

	public static double nextDouble() {
		
		return Double.parseDouble(s.nextLine());
	}
	
	
}
