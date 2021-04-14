package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 에러 
		 - 컴파일에러 : 컴파일 시에 발생되는 에러(빨간줄)
		 - 논리적에러 : 실행은 되지만, 의도와 다르게 동작하는 것(버그)
		 - 런타임 에러 : 실행시에 발생되는 에러
		 
		 런타임 에러
		 - 런타임 에러 발생시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		 - 에러 : 프로그램 코드에 의해 수습 될 수 없는 심각한 오류(처리불가)
		 - 예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류(처리가능)
		 
		 예외
		 - 모든 예외는 Exception 클래스의 자식클래스이다.
		 - RuntimeException 클래스와 그 자식들은 예외처리가 강제되지 않는다. - 런타임 자식들은 예외처리 해도되고 안해도되고 옵션이야. 
		 - [RuntimeException 클래스와 그 자식들을 제외한] Exception 클래스의 자식들은 예외처리가 강제된다. - 무조건 예외처리해줘야해
		 
		 예외처리(try-catch)
		 - 예외처리를 통해 프로그램이 비정삭적으로 종료되는 것을 방지할 수 있다.
		 - try {} catch(Exception e){}
		 - try 블럭안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
		 - catch의 ()안에는 처리할 예외를 지정해줄 수 있다.
		 - 여러종류의 예외를 처리할 수 있도록 catch는 하나 이상 올 수 있다.
		 - 발생한 예외와 일치하는 catch 블럭안의 내용이 수행된 후 try-catch를 빠져나간다.
		 - 발생한 예외와 일치하는 catch가 없을 경우 예외는 처리된지 않는다.
		 
		 */

		 try{
			 int result = 10 / 0; //나누기는 0으로 나눌수 없음.
			 System.out.println(result);
			 System.out.println(1);
		 }catch(ArithmeticException | IndexOutOfBoundsException e){ // 타입이 2개. 저 변수(e)는 둘중의 하나의 타입이 되는것임. 
			 //여기에 아무것도 하지 않아도 예외가 처리된다 = 정상적으로 동작한다. try로 감싸주기만 해도 된다는거지
			 //근데 이러면 38번줄 출력문이 아예 실행되지가 않아. 그래서 여기 안에다가도 똑같이 예외메시지를? 출력해줘
			 //순서는 37 -> 예외발생했네 39으로 바로감. 그후에 예외처리되고 끝. 그래서 38스킵.
			 
			 e.printStackTrace(); //예외메시지를 출력한다.	 -> 이게 에러발생한걸 해결해줄게! 이게 아니고. 그냥 여기에 에러가 있다고 메시지를 출력해주면서 에러가 있지만 프로그램 실행하게 해줄게. 이런거.
			 System.out.println(2);
		 }catch(NullPointerException e){
			 String str = null; //이렇게 문자열 대신에 널을 넣어주면 에러발생 
					 System.out.println(str.length());
					 System.out.println(3);
		 }catch(Exception e){ //모든 예외의 부모클래스. 얘만 해줘도 모든 예외처리가 가능한것임!
			 System.out.println(4);
		 }
		 
		 test1();
		 
		 /*
		    JVM
		    - Method Area
		    - Call Stack : 현재 호출되어 있는 메서드
		    - Heap
		  */
		 
	}

	private static void test1() {
		test2();
		
	}

	private static void test2() {
//		System.out.println(10 / 0);
		
		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) { //이건 내가 만들지 않은거야. 그래서 에러메시지창에서 이걸 가리켜서 여길 와도 뭘 할수가 없지. 내가 한게 아니니까. 
											//근데 내가 위에서 뭔가 잘못했으니깐 이게 뜨는거야. 그걸 찾으로 위로 올라가야해.
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}



















