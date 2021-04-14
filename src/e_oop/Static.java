package e_oop;

public class Static { //클래스변수

	/*
	 * - static을 붙이면 프로그램 실행시 메모리에 올라간다. 객체생성을 하지 않아도.
	 * - 객체 생성을 하지않아도 사용할수 있다.
	 * - static을 붙인 변수는 객체간에 변수의 값을 공유한다.
	 * - static이 붙은 멤버의 명칭 : 클래스 변수, 클래스 메서드
	 * - static이 붙지 않은 멤버의 명칭 : 인스턴스 변수, 인스턴스 메서드
	 */
	
	//값을 공유하기 위해 static을 붙인다. - 변수에 스태틱 붙이는 이유
	static int var;
	
	public static void main(String[] args) {
		//객체생성을 하지않고 사용하기위해 메소드안에 static을 붙인다??
		//메인에서 휴먼 클래스 사용할거
		
		Human 철수 = new Human();
		Human 영희 = new Human();
		
		철수.saveMoney(100000);
		영희.saveMoney(200000);
		
		철수.saveDateMoney(200000);
		영희.saveDateMoney(200000);
		
		
		System.out.println("문자열 입력>");
		//스캐너의 객체를 입력할 필요가 없어
		String str = ScanUtil.nextLine();
		System.out.println(str);
		
		System.out.println("숫자 입력>");
		int num = ScanUtil.nextInt();
		System.out.println(num);
	}
}


class Human{
	
	int account;
	
	void saveMoney(int money){  //저금하는 메소드안에 머니라는 파라미터를 넣고
		account += money;
		System.out.println("통장잔고 : " + account);
	}
	
	static int dateAccount;
	
	void saveDateMoney(int money){
		dateAccount += money;
		System.out.println("데이트 통장 잔고 : " + dateAccount); //출력하면 20만원, 20만원 더해서 40만원 나옴. 변수에 static을 붙여서 객체간의 값을 공유?한다는게 이런말임.
	}
	
}












