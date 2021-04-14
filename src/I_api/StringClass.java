package I_api;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
		/*
		 * String
		 * - 여러개의 문자를 사용하기 쉽게 만들어 놓은 클래스
		 * 
		 * String의 주요 메소드
		 * - equals() : 문자열의 내용이 같은지 반환한다.
		 * - length() : 문자열의 길이를 반환한다.
		 * - chatAt() : 특정 인덱스에 위치한 문자를 반환한다.
		 * - substring() : 문자열의 특정 부분을 잘라서 반환한다.
		 * - indexOf() : 문자열 내의 특정 문자의 인덱스를 반환한다.
		 * - contains() : 문자열이 특정 문자열을 포함하고 있는지 반환한다.- boolean 타입으로 반환한다.
		 * - split(): 문자열을 특정 문자를 기준으로 나누어 배열 형태로 반환한다.
		 * - trim() : 문자열 앞뒤의 공백을 제거해 반환한다.
		 * - valueOf() : 다른 타입의 데이터를 문자열로 변경해 반환한다. - int를 string으로 바꿔주는 메소드
		 * - replace() : 문자열 내의 특정 문자를 다른 문자로 변경한다.
		 * 
		 */

		boolean equals = "문자열".equals("문자열"); //앞에있는 문자열 안에서 equals를 찾는것이기 때문에, 앞문자열 안에는 null이 있으면 안됨. 뒤 문자열은 널이어도 상관없다.
		System.out.println(equals);
		
		String str1 = "문자열";
		String str2 = null;
		System.out.println(str1.equals(str2));
//		System.out.println(str2.equals(str1)); //2번을참고해서 1을 비교하고 있어. 
		//null이 있을 수 있는 변수를 앞에 두지 않는다. null이 있을수 있는 변수는 뒤에 둬야 함. 그럼 에러안뜸.
		
		String str = "12345";
		int length = str.length(); //문자열의 길이를 반환해준다.
		for(int i = 0; i < length; i++){
			char charAt = str.charAt(i); // i가 0번째일때 1증가, 1번째 일때 1또 증가해서 2가 되고...
			System.out.println(charAt);
		}
		
		
		//문자열 뒤집기
		String rev = "";
		for(int i = str.length() -1; 0 <= i; i--){
			rev += str.charAt(i);
		}
			System.out.println(rev);
		
		str = "0123456789";
		String sub1 = str.substring(3); //3번 인덱스부터 잘라서 반환한다.
		System.out.println(sub1);
		String sub2 = str.substring(5,8); //5번 인덱스부터 8번 인덱스 전까지 잘라서 반환한다. 5번(포함)부터 8번(미포함)전까지!
		System.out.println(sub2);
		
		str = "수박 오렌지 귤 블루베리";
		int index = str.indexOf("오렌지"); //오렌지의 시작 인덱스를 반환한다. 오렌지가 어디서 시작되는지를 알려주는. 숫자로 알려주니까 int.
		System.out.println(index);
		
		//위에 substring이랑 index는 같이 사용하는 경우가 많다.
		//substring과 indexOf를 조합해서 문자열 자르기
		String[] menu = {
				"수박 20000원",
				"오렌지 100000원",
				"귤 500원",
				"블루베리 3000원"
		};
		
		for(int i = 0; i < menu.length; i++){ //배열이니까 for문을 돌려야지
			String name = menu[i].substring(0, menu[i].indexOf(" "));
			System.out.println(name);
		}
		
						
		for(int i = 0; i < menu.length; i++){ 
			String price = menu[i].substring(menu[i].indexOf(" ")+1, menu[i].indexOf("원") );
			int num = Integer.parseInt(price);
			System.out.println(num);
		}
		
		str = "abcd";
		boolean contains = str.contains("c");
		System.out.println(contains); //이렇게 포함 여부를 알려준다
		
		
		//오렌지가 메뉴의 몇번 인덱스에 있는지 찾기
		for(int i = 0; i < menu.length; i++){
			if(menu[i].contains("수박")){
				System.out.println("수박은 " + i + "번 인덱스에 있습니다.");
			}
		}
		
		
		str = "a/b/c"; 
//		str.split("/"); //이렇게 나눠준걸 string타입의 배열로 반환한다. 
		String[] split = str.split("/"); 
		System.out.println(Arrays.toString(split));
		
		//메뉴명과 가격 나누기
		for(int i = 0; i < menu.length; i++){
			String[] m = menu[i].split(" ");
			System.out.println("메뉴명 : " + m[0] + "  - 가격 : " + m[1]); //이름은 0번인덱스가 되고 가격은 1번 인덱스가 된다.
		}
		
		
		
		str = " 문자열 "; //문자열 앞뒤에 공백이있어. 그걸 제거해주는거
		String trim = str.trim();
		System.out.println("[" + str + "]" + "[" + trim + "]");
		
		//사용자가 입력할때 실수하는걸 방지해주는게 trim!
		//사용자의 실수로 아이디나 비밀번호 앞뒤에 공백이 들어가는 것을 방지하기 위해 사용할 수 있다.
		String id = " myid";
		String password = "mypassword "; //실수로 이렇게 공백이 들어가면 로그인이 안돼...
		System.out.println(id);
		System.out.println(password);
		System.out.println(id.trim()); //요렇게만 해줌 되네! 간단하구만
		System.out.println(password.trim());
		
		
		
		int number = 10;
//		number + ""; 이렇게 하면 얘는 string이 된대... 꼼수긴한데 이렇게 하기도 함. 
		str = number + "";
		//그치만 더 좋은건 메소드를 쓰는것이지. 아래처럼
		str = String.valueOf(number);
		
		
		
		str = "123456789";
		str = str.replace("3", "짝");
		System.out.println(str);
		str = str.replace("6", "짝");
		str = str.replace("9", "짝");
		System.out.println(str);
		
		str = "banana";
		str = str.replace("a", "u");
		System.out.println(str);
				
	}

}
