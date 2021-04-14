package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		/*
		 * 비트 연산자(잘 사용안함. 실무에 거의 쓰이지 않음. 그냥 이런게 있구나 라고만 알고 넘어가자)
		 * - | , & , ^ , ~ , << , >>
		 * - 비트 단위로 연산한다.
		 * 
		 * 기타 연산자
		 * - .(참조연산자) : 특정 범위 내에 속해 있는 멤버를 지칭할 때 사용한다. system이라는 클래스 안에 out이라는 변수를 가리킬때 system.out 이렇게 사용한다.
		 * - (type) : 형변환
		 * - ?:(삼항연산자 - ? 와 : 으로 이루어져 있음) : 조건식 ? 조건식이 참일 경우 : 조건식이 거짓일 경우 - 참이면 두번째 거짓이면 세번째 거를 사용한다. ?????????????????????????
		 */

		// 1byte : 01010101  - 각각 하나하나를 비트라고 한다. 0, 1 이런 비트 단위로 연산을 하는것을 비트 연산자라고 함.
		System.out.println(10 | 15 ); // 둘다 0인경우 0 그외 1
		System.out.println(1 | 0 );
		//10 : 00001010
		//15 : 00001111
		//	 : 00001111 / 위 아래를 비교해서 나온 결과 그래서 출력결과는 15
		
		
		
		
		//삼항연산자는 중요
		int x = 10;
		int y = 20;
		int result = (x < y) ? x : y; //참이면 두번째 거짓이면 세번째 거를 사용한다.
		System.out.println(result + ".");
		
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자
		int regNo = 5; // 여기에 1을 적으면 출력결과는 남자, 2를 적으면 여자로 출력됨.
		String gender = (regNo == 1) ? "남자" : "여자"; //(regNo == 1) 라고 해놨기 때문에 1외에 다른 숫자를 넣으면 다 여자가 됨. 참이 아니면 세번째거 사용이니깐 5를 넣어도 여자로 뜸 
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		//위에 생긴 문제를 해결 하기위해 2만 넣었을때 여자가 뜨게 하고 싶으면 삼항연산자를 두번 써주면 됨
		gender = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : "확인불가"); // 첫번째 문장을 했을때 1이 아니면 세번째 문장이 실행되는데 거기에 삼항연산자가 들어가있으니깐 그걸 사용하면 답이 뜸.
		System.out.println("당신의 성별은 " + gender + " 입니다.");
		
		
		
		//2개의 숫자를 입력하고, 둘 중 더 큰 숫자를 출력해주세요.
		
		Scanner sc = new Scanner(System.in); 	// Integer.parseInt(sc.nextLine()); 얘를 써야지  //Scanner는 뭔가를 입력할때 쓰는거, 입력받기 위한 클래스 (악???)
		
		
	
		/*System.out.println("첫번째 숫자를 입력해주세요>");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("두번째 숫자를 입력해주세요>");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println((a > b) ? a : b);	*/	

		
		
		
	//============================================================
		//앞에 변수 배울때 한내용
				/*Scanner sc = new Scanner(System.in); //입력받기 위한 클래스  / System.in은 입력한 값을 바이트 단위로 읽는 것을 뜻한다. 
				//import 단축키 : Ctrl + Shift + o  클래스를 지정해주지 않았을때 단축키를 사용하면 자동으로 클래스를 지정해줌 import해줌
				System.out.println("아무거나 입력해주세요>");
				String str2 = sc.nextLine(); //사용자한테 입력을 받을수있음 - 사용자가 입력을 하고 엔터를 치면 다시 실행이됨. 뭔가를 입력할때까지 기다려. 실행이 멈춰. //string은 문자
				System.out.println("입력받은 내용 : " + str2); //실행을 했는데 뭔가 입력해달라고 기다리고 있는거*/
				
				
		
		
		
		//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4명 여자를 출력해주세요.
		// 그 외의 숫자를 입력하면 확인불가를 출력해주세요.
		System.out.println("숫자>"); //(숫자 라고) 입력할 말을 적어서 출력해주고 
		int num1 = Integer.parseInt(sc.nextLine()); //int를 해주는 이유는, 숫자를 적을거니까. 
		gender = num1 == 1 || num1 == 3 ? "남자" : (num1 == 2 || num1 == 4 ? "여자" : "확인불가");
		System.out.println(gender);
				
				
				
	/*	System.out.println("숫자를 입력해주세요>");
		int c = Integer.parseInt(sc.nextLine());
		String gender2 = (c == 1 || 3 ) ? "남자" : (c == 2 || 4 ? "여자" : "확인불가");
				
		System.out.println((c  );*/
		
		
		
		
	}

}
