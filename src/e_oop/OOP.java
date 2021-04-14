package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * 객체지향 프로그래밍 (Object Oriented Programming) - 코드를 분리해서 사용하는것을 객체지향 프로그래밍이라한다. - 어떤 대상을 기준으로 코드를 작성한다????????
		 * - 프로그래밍을 단순히 코드의 연속을 보는것이 아니라 객체간의 상호작용으로 보는것.
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 */
		//어제한건 여러가지 다른 타입을 하나로 묶어서 새로운 타입으로 만들수있단걸 알아본거
		/*
		 * 메소드
		 * 장점 
		 * : 
		 * 
		 */
		
		//객체생성 해보자. 샘플에서만든걸 가져올거야
		//new SampleClass(); - 이걸 아래처럼
		SampleClass sc = new SampleClass();
		
		System.out.println(sc.field); //우리가 만든 전역변수. 이걸 불러옴
		//출력하면 0이라는 값이 나옴. 왜냐 우리가 초기화를 해주지 않아서. 기본값인 0이나옴
		
		sc.method1(); //이렇게 호출함. 
		
		//sc.method2(5); //파라미터가 인트 타입이란걸 알수있어. 치다보면 뜨는 그 자동완성칸에서
		String returnValue = sc.method2(5);
		System.out.println(returnValue);  // 우리가 넘긴 5라는 값을 넘기고 스트링타입을 줄력. 
		//출력하면 : 5 를 받아 명령을 수행하고 결과물을 리턴하는 메소드		
		System.out.println(sc.method2(10)); // 이렇게 해도 결과는 똑같아. 값만 달라지고

		
		
		sc.flowTest1();
		
		
		
		//ClassMaker에서 방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요
		//객체가 저장된 변수를 통해 메소드를 호출해주세요
		//파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주시고,
		//리턴타입이 있는 메서더는 리턴받은 값을 출력해주세요.
		
		ClassMaker cm = new ClassMaker();
		cm.method_test1();
		System.out.println(cm.method_test2()); //인트타입이라 출력해줘?
		cm.method_test3("abc"); //abc가 테스트3으로 가서 스트링변수 p에 들어갔고, 그아래 출력하래 p를. 그 p에는 abc가 들어있지. 그래서 출력하면 abc가 나옴.
		System.out.println(cm.method_test4(55, 12));
		
		
		
		
		//계산기 클래스 
		Calculator cal = new Calculator();
		
		double ans1 = cal.sum(123456, 654321);
		System.out.println(ans1);
		
		double ans2 = cal.multi(ans1, 123456);		
		System.out.println(ans2);
		
		double ans3 = cal.devide(ans2, 123456);
		System.out.println(ans3);
		
		double ans4 = cal.minus(ans3, 654321);
		System.out.println(ans4);
		
		double ans5 = cal.rest(ans4, 123456);
		System.out.println(ans5);
		
		
		double result = cal.sum(123456, 654321);
		result = cal.multi(ans1, 123456);	
		result = cal.devide(ans2, 123456); 
		result = cal.minus(ans3, 654321);
		result = cal.rest(ans4, 123456);
		System.out.println(result);
		
		
		
		
		
		
		
		/* 
		 * 식당 예제와 같은 어떤 대상을 잡아 클래스를 구성해주세요.
		 * 사장님과 알바의 관계같은 명령을 주고 받는 관계가 있는 대상이 적합합니다. 
		 * 메서드의 내용은 구체적이지 않아도 괜찮습니다.
		 * 파라미터와 리턴타입의 위주로 만들어주세요.
		 * 클래스에 메소드를 만들어보면서 파라미터와 리턴타입을 생각해보는것이 중요합니다.
		 * 만들어진 클래스를 main메서드에서 사용해주세요.
		 * 
		 * +클래스안에 클래스가 하는일을 메서드로 만드는데 그 파라미터와 리턴타입을 생각하면서 만드는게 중요.
		 * 메소드안에 내용은 중요하지않음.
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
