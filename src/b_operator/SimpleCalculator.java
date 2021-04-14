package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// 두개의 숫자와 연산자(+-*/)를 입력받아 연산 결과를 알려주는 프로그램을 만들어주세요. 
		// 계산기를 만드는거야. 

		/*System.out.println("두개의 숫자를 입력해 주세요.>");
		
		Scanner sc = new Scanner(System.in); 
		
		int num1 = Integer.parseInt(sc.nextLine());
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("연산자를 입력해주세요. >");
		
		
		String str = sc.next(); //next를 써도 되고 nextline을 써도 되고 next를 쓰는이유는 공백을 이용해서 한번에 여러개를 하기 위해서 
		
		
		// 상항연산자 조건식 ? 참 : 거짓
		
		System.out.println("결과값 : " + 
				(str.equals("+") ? num1 + num2 : str.equals("-") ? num1 - num2 : str.equals("*") ? num1 * num2 : str.equals("/") ? num1 / num2 : "확인불가")
				);
		*/
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 숫자>");
		double x = Double.parseDouble(s.nextLine());
		System.out.print("연산자>");
		String op = s.nextLine();
		System.out.print("두번째 숫자>");
		double y = Double.parseDouble(s.nextLine());
		
		double result = op.equals("+") ? x + y
				: op.equals("-") ? x - y
				: op.equals("*") ? x * y	
				: op.equals("/") ? x / y		
				: x % y;
		
	/*	System.out.println(x + " " + op + + " " + y + " = ");*/
		
		
		
		
		
		
		
	}

}
