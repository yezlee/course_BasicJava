package g_oop2;

public class AccessModifier {

	public String publicVar = "public : 접근제한이 없음"; //어디서든 누구든 퍼블릭에 접근할 수 있음. 
	protected String protectedVar = "protected : 같은 패키지 + 상속받은 클래스에서 접근 가능"; //상속받으면 다른 패키지에서도 접근할수있어
	String defaultVar = "default : 같은 패키지에서만 접근 가능"; //반드시 생략을 해야만 접근 가능. 생략했을때 디폴트임. 
	private String privateVar = "private : 클래스 내에서만 접근 가능"; //다른 클래스에서는 접근이 불가능!
	
	public void publicMethod(){
//		System.out.println(publicVar);
	}
	
	protected void protectedMethod(){
//		System.out.println(protectedVar);
	}
	
	void defaultMethod(){
//		System.out.println(defaultVar);
	}
	
	private void privateMethod(){
//		System.out.println(privateVar);
	}
	
	public static void main(String[] args){		
		AccessModifier am = new AccessModifier(); // 객체생성을 해줘야지
		
//		System.out.println(am.publicVar);
		am.publicMethod(); //어디서나 접근 가능해서 당연히 클래스 안에서도 접근 가능
		
//		System.out.println(am.protectedVar);
		am.protectedMethod();
		
//		System.out.println(am.defaultVar); // 같은 패키지 안에 있는것만 가능. 메인메소드는 같은 클래스 안에있는거라 당연히 접근 가능
		am.defaultMethod(); 
		
//		System.out.println(am.privateVar);
		am.protectedMethod();	
		
		
		/*
		 *  접근제어자를 사용하는 이유
		 *  - 데이터를 보호하기 위해
		 *  - 불필요한 멤버를 감추기 위해
		 *  
		 *  
		 *  
		 *  
		 */
		
		Time t = new Time();
		
//		t.hour = 9;
//		t.minute = 390;
//		t.second = -50; //이런 시간은 존재하지않아. 잘못된 데이터야.
		//개발자가 원하는 식으로 시간을 입력해줬음 좋겠는데 사용자는 상상초월의 답을 입력할때가 있어 그래서
		//변수한테 직접 접근하지 못하게 프라이빗을 붙이는거지!!
		
		t.setHour(9);
		t.setMinute(390);
		t.setSecond(-50);
//		System.out.println(t.getTime());
		//아직까진 데이터가 보호되지 않았어. 보호하려면 다시 time 클래스한테 가서
		
		
		t.clock();
		
		
	}
	
}

