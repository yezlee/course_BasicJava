package I_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 *  정규표현식: 문자열의 패턴을 검사하는 표현식
		 *  
		 *  ^  	  뒷문자로 시작  - ^a
		 *  $	  앞문자로 종료  - a$
		 *  .	  임의의 문자(줄바꿈 제외) - ????????? 
		 *  *	  앞 문자가 0개 이상  - a* : a가 몇개인지. 아예 없을수도 3개일수도
		 *  +	  앞 문자가 1개 이상 - a+ : a가 최소한하나 이상?
		 *  ?	  앞 문자가 없거나 1개  - a?
		 *  []	  문자의 집합이나 범위( [a-z] : a부터 z까지, [^a-z] : a부터 z가 아닌것)
		 *  {}	  앞 문자의 개수( {2} : 2개, {2,4} : 2개 이상 4개 이하 )
		 *  ()	  그룹화(1개의 문자처럼 인식) - 여러개의 문자를 한개처럼 인식
		 *  |	 OR 연산
		 *  \s	  공백, 탭, 줄바꿈
		 *  \S	  공백, 탭, 줄바꿈이 아닌 문자(나머지) - 위와 반대. 
		 *  \w	  알파벳이나 숫자
		 *  \W	  알파벳이나 숫자가 아닌 문자
		 *  \d	  숫자
		 *  \D	  숫자가 아닌 문자
		 *  (?i) 뒷 문자의 대소문자 구분 안함
		 *  \	  정규 표현식에서 사용되는 특수 문자 표현
		 *  
		 *   이외의 수많은 정규표현식이 있음. 이건 매우 기본적인것.
		 */

		String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}"; // 먼저 알파벳오고 숫자온다. - 순서도 중요!!
//		String regex = "[a-z0-9]+"; //갯수를 지정해주지 않으면 무조건 1개가 온다는 뜻. +를 해주면 1개이상 온다는 뜻
//		String regex = "\\w*";	
		String regex = ".*"; // 어떤 문자이건 상관없어 0개 이상 문자가 온다. - 범위가 매우 넓은거
		
		//정규표현식을 만들때는 넓은 범위의 표현보다는 좁은 범위의 표현, 내가 딱 원하는 값을 알수있는 정확한 표현이 더 좋다.
		
		//Pattern.compile(regex); // 이걸로 정규표현식을 해석해.
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
//		System.out.println(m.matches()); //패턴이 일치하기 떄문에 결과값 true가 나옴
		
		
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요.
		
		String str_id = "hee__m-ong_9";
//내가	String id = "[a-z0-9_-]{5,20}";
		String id = "[a-z0-9_-|!]{5,20}";
		
		String str_digits = "011-1234-1234";
//내가	String digits = "(010|011|016)-[0-9]{4}-[0-9]{4}";
		String digits = "^0\\d{1,3}-\\d{3,4}-\\d{4}";
		
		String str_email = "hdfsdg454gfdg@gmail.com";
//		String email = "[a-z0-9]+@[a-z]+(.com|.net|.kr)";
		String email = "[a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))";
		
		Pattern p2 = Pattern.compile(id);
		Matcher m2 = p2.matcher(str_id);
		System.out.println(m2.matches());
		
		Pattern p3 = Pattern.compile(digits);
		Matcher m3 = p3.matcher(str_digits);
		System.out.println(m3.matches());
		
		Pattern p4 = Pattern.compile(email);
		Matcher m4 = p4.matcher(str_email);
		System.out.println(m4.matches());
	}

}
