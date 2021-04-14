package g_oop2;

public interface SampleInterface { //얘는 일반적인 메소드는 갖지못해. 추상메소드랑 상수만 가질수 있어. 추상클래스는 추상메소드랑 일반메소드도 가질수 있었는데.

	//얘는 관계 없는 애들끼리 관계를 만들어 줄수도 있어.
	
	//인터페이스의 모든 멤버변수는 public static final 제어자를 사용해야한다.
	public static final int NUM1 = 1; //final int가 붙었으니 상수지.
	
	//모든 멤버변수의 제어자가 같이 때문에 생략이 가능하다.
	int NUM = 2;
	
	//인터페이스의 모든 메서드는 public abstract 제어자를 사용해야한다.
	public abstract void method1();
	
	//모든 메소드의 제어자가 같이 떄문에 생략이 가능하다.
	void mehtod2();
	
	//요렇게 위의 두가지만 가질수 있는게 인터페이스임.
}


class SampleImplement implements SampleInterface, SampleInterface2{ //얘도 오버라이딩해줘야함. ctrl + 1
	//인터페이스의 특징은 다중상속이 가능하다!! 여러개의 인터페이스를 상속 받을 수 있어. 방법은 콤마를 찍어서 써줌돼.

	@Override
	public void method1() {
		
	}

	@Override
	public void mehtod2() {
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	} 
	
}


interface SampleInterface2{ 
	void method1(); // 이렇게 중복되는 메소드를 만들면 오버라이딩 할때  중복은 그냥 생략하고 새로운 것만 만들어. 
	void method3();
}





