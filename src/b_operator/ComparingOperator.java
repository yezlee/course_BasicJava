package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		/*
		 * 비교연산자
		 * - < , > , <= , >= , == , != (같지 않다. 다르다. !는 부정의 의미를 가지고 있음)
		 * - 문자열비교 : equals()
		 */
		boolean b = 10 < 20; //비교연산자의 연산결과는 boolean이다.
		System.out.println(b);
		b = 10 <= 20 - 15; //산술연산 후 비교연산을 수행한다. 산술연산이 우선 순위가 더 높다.
		System.out.println(b);
		
		String str1 = "abc";
		String str2 = "abc";
		b = str1 == str2; //문자열의 내용이 아닌 주소를 비교한 것이다. 스트링은 참조형변수. 일반 데이터타입은 그안에 변수를 저장을 하는데 참조형은 주소를? 불러와. 문자열이 저장되어 있는 변수가 그 주소안에 들어가있는것 
		System.out.println(b);
		
		
		// 그리하여 주소를 불러와서 주소를 비교하는게 아니고 문자열 자체를 비교하고 싶으면
		// String의 내용을 비교하기 위해서는 equals()메소드를 사용한다.
		b = str1.equals(str2); //equals가 두개의 문자열을 비교해주는 역할을 한다
		System.out.println(b);
		b = !str1.equals(str2); // !느낌표가 부정을 뜻하니깐 같은데 같지않다라고 부정을 해주니 결과를 출력하면 false가 나오겠지.
		System.out.println(b + ".");
		
		
		//나혼자연습
		boolean c = 25 < 20; 
		System.out.println(c);
		String str3 = "123" ;
		String str4 = "123";
		c = str3 == str4; 		
		System.out.println(c + "..");
		
		c = str3.equals(str4);
		System.out.println(c);
		
		
		//int타입의 x와 y변수를 만들고, 다음의 문장들을 코드로 작성해주세요.
		
		int x = 5;
		int y = 10;
		
		//1. x가 y보다 크다.			
		System.out.println(x > y);		
		
		//2. x + 5와 y는 같다.
		System.out.println(x + 5 == y);
		
		//3. y는 홀수이다.
		System.out.println(y % 2 == 1);
		
		//4. "변수"와 "데이터"는 같다.
		System.out.println("변수". equals("데이터"));		
		
	}

}
