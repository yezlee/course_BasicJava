package g_oop2;

public abstract class Animal {

	void run(){
		System.out.println("달려간다~~~~~");
	}
	
	abstract void sound(); //달려가는건 똑같은데 소리내는게 다 달라. 그래서 어차피 내용을 적어줄 이유가 없어.
	
}

class Dog extends Animal{

	@Override
	void sound() {
		System.out.println("멍멍!!");
		
	} //추상클래스를 상속받았기때문에 추상클래스를 구현?해서 
	
}


class Tiger extends Animal{
	
	@Override
	void sound(){
		System.out.println("어흥!");
	}
}


class Cow extends Animal{
	
	@Override
	void sound(){
		System.out.println("음메~");
	}
}

