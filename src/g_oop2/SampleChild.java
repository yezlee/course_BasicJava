package g_oop2;

public class SampleChild extends SampleParent {

	void childMethod(){
		//상속받은 변수와 메소드를 사용할 수 있다.
		System.out.println(var); //상속받은 변수
		System.out.println(method(7,13)); //상속받은 메소드
	}
	
	//1. 오버라이딩 - 부모한테 상속받은 메서드가 맘에 안들때 오버라이딩. 
	
	//2. super, super() - 괄호 붙은애, 안붙은애 이렇게 두개. 
	// - this랑 비슷. 전역변수랑 지역변수랑 이름이 같을때 구분하기 위해서 사용 - 이거랑 비슷한역할을 하는데 
	// - 부모클래스변수와 자식클래스 변수의 이름이 같을때 그걸 구분하기 위해서 수퍼를 사용.
	// - 괄호붙은 this는 생성자
	// - 생성자에서 부모클래스를 호출하는게 괄호붙은 수퍼
	
	//3. 다형성 - 클래스엔 동일한 타입의 변수를 했었지. 다형성은 객체타입과 변수 타입을 다르게 사용할때. 원래 두개의 타입이 같아야 하는것임.
	// - 클래스 타입이 동일했어야지 클래스 타입이 이렇게 -> ABC a = new ABC(); 근데 다형성은 DEF a = new ABC(); 이렇게. 
	// - 근데 아무거나 막 갖다쓰는건 아니고 부모 자식간의 관계여야함.
	
	//1- 오버라이딩 : 상속받은 메서드의 내용을 재정의 하는것.
	@Override //어노테이션Annotation(주석): 클래스, 변수, 메소드 등에 표시해 놓는것 - 만약 ㅡmethod를 methad로 오타를 냈어. 그럼 오버라이딩한데 아니게 되는데, 그걸 방지하기위에 어노테이션을 붙임.
	int method(int a, int b){
		return a * b; // 앞에 부모는 더했어. 근데 자식은 곱하고 싶어. 이게 오버라이딩
	}
	// int method(int a, int b){ - 리턴타입의 메서드명 파라미터 모두 같아야한다. -  ()괄호안에 있는걸 선언부라함. 
	// 	retutn a * b    
	// }
	// 선언부는 같은데 그 안에 내용을 바꾸고 싶을때 메소드안에 내용을 변경하고 싶을때 바꾸는게 오바라이딩
	//
	
	//2- super, super() - ()괄호 붙은애는, 부모클래스의 생성사를 호출하는데. 생성자안에 있는걸호출
	int var;
	
	void test(double var){
		System.out.println(var); // 얘는 지역변수. 바로 위에 있는 double var 이걸 사용한거지
		System.out.println(this.var); // 얘가 위에 있는거 쓰는거지. 인스턴스 변수
		System.out.println(super.var); //이것이 이제 부모클래스에 있는걸 가져다 쓰는, 부모클래스의 인스턴스 변수. 인거지!
		//super : 부모클래스의 멤버(변수, 메소드를 포함하는거)와 자식클래스의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용한다.
		
		System.out.println(this.method(10, 20)); // 저 위에 있는 메소드란 변수
		System.out.println(super.method(10, 20)); // 부모클래스에 있는 메소드란 변수
	}
	
	
	SampleChild(){
		super(); // 부모클래스의 생성자 호출 , 자식클래스의 생성자는 부모클래스의 생성자를 무조건 호출해야한다. 부모클래스한테서 물려받은 변수를 초기화 시켜야하니까
		//안그럼 변수값 그냥 다 남아있어서 안돼. 어차피 안하면 자동으로 해준다네?
		//super()를 통해 부모클래스의 생성자를 호출하고 부모클래스의 인스턴스 변수도 초기화한다.
		//super()가 없으면 컴파일러가 자동으로 super()를 넣어준다.
	}
	
	//생성자와 초기화블럭은 상속되지 않는다. 클래스 위에 extends를 붙이면 상속을 하는거지
	
	
	
	
	
	//3- 다형성 - 객체랑 변수의 타입을 다르게 하는게 다형성인데 주로 부모타입의 변수로 자식타입의 객체를 사용.
	//차일드 멤버가 아무리 많아도 부모거에 있는 거만 쓸수 있는게 중요한 특징!!!!!!
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		SampleParent sp = new SampleChild(); // 상속을 받음으로써 자식타입의 객체를 생성자로 사용하고 앞에 변수를 부모타입으로 저렇게 둘이 다를수있어
		//부모타입의 변수로 자식타입의 객채를 사용하는것이 다형성이다.
		
		
		
		//부모와 자식간에는 서로간의 형변환이 가능한다.
		sc = (SampleChild)sp;
		sp = (SampleParent)sc;
		//자식타입 -> 부모타입 형변화은 생략할 수 있다. 두번째거. sp = sc; 이래도 됨..... 첫번째는 안되고.
		
		//위에 부모타입을 자식으로 형변환 했는데 에러가 안난건, 저 sp자체가 어차피 자식 생성자로 만든거라??????
		
		SampleChild sc2 = (SampleChild) new SampleParent(); //옆에 에러 바로 안뜨지만 출력해보면 에러뜸.
		//SampleParent는 2개의 멤버를 가지고 있다.
		//SampleChild는 5개의 멤버를 가지고 있따.
		//SampleChild 타입의 변수는 5개의 멤버를 사용할 수 있어야 하는데 
		//SampleParent 객체는 2개의 멤버만 가지고 있다.
		//그러므로 부모타입의 객체를 자식타입으로 형변환 하는것은 에러를 발생시킨다.
		
		//SampleParent 타입의 변수로는 SampleChild 객체를 가지고도 2개의 멤버만 사용할 수 있다.
		SampleParent sp3 = new SampleChild(); //자식클래스의 객체를 부모타입의 변수안에 넣는/ 객체는 자기타입이고 변수가 2개만 사용가능 부모타입이니까
		System.out.println(sp3.var); // 이거랑 아래. 두개만 사용가능
		System.out.println(sp3.method(10, 20)); 
//		sp3.childMethod(); //사용불가
//		sp3.test(); //사용불가
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

