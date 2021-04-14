package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {

	public static void main(String[] args) {
		/*
		 * finally 
		 * - 필요에 따라 try-catch 뒤에 finally를 추가할 수 있다. 
		 * - finally는 예외의 발생여부와 상관 없이 가장 마지막에 수행된다.
		 *  꼭 사용해야하는 곳에다가 쓴다. 앞에서 출력하지 못한 38줄 같은거 ....
		 *  
		 * 자동 자원 반환 
		 * - try(변수선언;변수선언) {} catch(Exception e) {} 
		 * - 사용 후 반환이 필요한 객체를 try의 ()안에서 선언하면 try블럭 종료시 자동으로 반환된다.
		 */

		FileInputStream fis = null; //파일읽기
		
		try {
			fis = new FileInputStream("d:/file.txt");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				fis.close(); //사용하고 나서 꼭 클로즈라는 메소드를 이용해서 닫아야돼.
			} catch (Exception e) {				
				e.printStackTrace();
			} 
		} 
		
		
		//예외 발생 : try -> catch -> finally
		//예외 미발생 : try -> finally
		
		//자동 자원 반환(JDK1.7)
		try(FileOutputStream fos = new FileOutputStream("d:/file.txt")){
			String str ="아무내용이나 써보자...";
			
			byte[] bytes = str.getBytes();
			
			for(int i = 0; i < bytes.length; i++){
				fos.write(bytes[i]);
			}					
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}

}
