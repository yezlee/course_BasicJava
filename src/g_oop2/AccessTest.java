package g_oop2;

public class AccessTest {

	public static void main(String[] args) {

		//같은패키지 안에 있는 다른클래스
		AccessModifier am = new AccessModifier(); // 이렇게 역시나 객체 생성 해주고
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
//		System.out.println(am.privateVar); // 같은 클래스 안에 있는애만 가능하기 때문에 컴파일 에러 뜬다. 
//		am.privateMethod();
		
		
		
		

	}

}
