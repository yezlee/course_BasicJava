package h_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		/*
		 예외 발생시키기
		 - throw new Exception();
		 - throw 예약어와 예외 클래스의 객체로 예외를 고의로 발생 시킬 수 있다.
		 */

		IOException ioe = new IOException(); // 사용할 일은 거의 없을것
		//예외가 발생하는 상황을 테스트 해야할 때 사용할 수가 있다.ㄴ
		
		try {
			throw ioe; //이위치에서 무조건 예외가 발생하게됨. 그래서 예외처리 해줘야함.
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}                           

}
