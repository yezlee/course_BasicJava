package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) {
		/*
		 * 메소드에 예외 선언하기
		 * - 메서드 호출시 발생 할 수 있는 예외를 선언해줄 수 있다.
		 * - void method() throws IOException {}
		 * - 메서드의 구현부 끝에 throws 예약어와 예외 클래스명으로 예외를 선언할 수 있다.
		 * - 예외를 선언하면 예외처리를 하지 않고 자신을 호출한 메소드로 예외처리를 넘겨준다.
		 */

		try {
			method();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} //얘는 예외처리를 반드시 해줘야함....... 이런경우가 생성자를 호출한거야. 그 생성자에 예외가 선언이 되어있기떄문에 예외처리 해줘야돼. 저 위에서 메인메소드한테 예외처리 해준것처럼
		
	}

	private static void method() throws IOException { //아래 try로 감싸야하는데 뒤에 메인메소드를 호출해서 메인메소드한테 트라이캐치로 예외처리 해줘야함
				
		throw new IOException();
	}
		

}
