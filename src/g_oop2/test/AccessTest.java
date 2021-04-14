package g_oop2.test;

import g_oop2.AccessModifier;

public class AccessTest extends AccessModifier{

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
//		System.out.println(am.protectedVar); //같은 패키지 혹은 상속 받아야 접근가능
//		am.protectedMethod();
		
		//위에처럼 하면 안되고 직접 받은거라서 다시 객체 생성 해주고
		
		AccessTest at = new AccessTest();
		
		System.out.println(at.protectedVar);
		at.protectedMethod();
		
//		System.out.println(at.defaultVar); // 얘네들은 상속을 받아도. 다른 패키지라서  안됨.
//		System.out.println(at.privateVar); 
		

	}

}
