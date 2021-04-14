package g_oop2;

public abstract class SampleAbstractParent {  //추상클래스도 클래스는 클래스인데 조금 변형이된거

	//추상 메소드를 하나라도 가지고 있는게 추상클래스이다.
	//그럼 추상 메소드가 뭐냐?
	
	void method(){ //일반적인 메소드는이렇게 만들지.
		
	}
	
	//추상메소드 : 선언부만 있고 구현부는 없는 메소드  -> void method : 선언부 / {} : 구현부
	abstract void abstractMethod(); //선언은 되어있는데 구현부가 없어. 내용이 없어! {}이렇게 해서 내용을 적어야하는데
	//이런거 하나라도 가지고 있으면 추상클래스!!!인거
	
	//추상클래스는 부모클래스의 역할만 한다.공통된 내용이 있을때 부모클래스를 만들잖아. 그럴때 추상클래스를 이용해
	//만드는 이유는 메소드는 똑같은데 안에 들어가는 내용이 다르기때문에. 기능이 다르니까
	// 어차피 상속받고 안에 내용 바꾸잖아. 그럴바에야 추상으로 만들고 자식클래스한테서 내용을 쓰는거지.
	
	
}


class SampleAbstractChild extends SampleAbstractParent { // 추상클래스는 상속받으면 컴파일 에러뜸. 
	// -> abstract를 붙여서 추상클래스를 만들어주던지 혹은 추상클래스한테 내용을 만들어주거나 오버라이딩을 이용해서.
	
	@Override
	void abstractMethod(){
		
	}
	
}