package e_oop;

public class ClassMaker {

	//1. 전역변수 하나를 선언 및 초기화 해주세요.

	int field_test = 10;
	
	//2. 리턴타입과 파라미터가 없는 메소드를 하나 만들어주세요.
	//메소드 안에서 전역변수를 출력해주세요.
	
	void method_test1(){
		System.out.println(field_test);
	}

	
	//3. 전역변수와 동일한 타입의 리턴타입이 있고 파라미터는 없는 메소드 하나를 만들어주세요. 
	//메소드 안에서 전역변수를 리턴해주세요
	
	int method_test2(){
		return field_test;
	}//리턴타입이 있는 메소드에서 리턴타입 안만들어주면 컴파일에러뜸
	
	
	//4. 리턴타입은 없고  파라미터가 있는 메소드 하나를 만들어주세요. 
	//메소드 안에서 파라미터를 리턴해주세요

	void method_test3(String p){
		System.out.println(p);
	}
	
	
	//5. int타입의 리턴타입과 int타입의 파라미터 두개가 있는 메서드 하나를 만들어 주세요
	//메소드 안에서두 파라미터를 곱한 결과를 리턴해주세요
	
	
	int method_test4(int a, int b){
		return a * b;		
	}
	
	
	
	
	
	
	
	
	
	
}
