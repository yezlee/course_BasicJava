package c_statement;

import java.util.Scanner;

public class ConditionalStatement {
	
	public static void main(String[] args) {
		
		/*
		 * 조건문 
		 * - if문
		 * - switch문
		 * 
		 * if문
		 * - if(조건식){} : 조건식의 결과가 true이면 블럭안의 문장을 수행한다.  {} -> 블럭
		 * - else if(조건식){} : 다수의 조건이 필요할 때 if 뒤에 추가한다.
		 * - else{} : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 *  
		 */
		
		
		int a = 1;  //변수를 만들고
		
		// 정렬 : Ctrl + Shift + f 블럭치고 이 단축키 사용하면 자동으로 정렬된다!
		if(a == 1){
			System.out.println("조건식의 연산결과가 true이면 수행된다.");			
		}
		
		if(a == 0){                     // if끼리는 각개전투야 다 따로따로. if끼리는 별개의 조건식이기 때문에.       
			System.out.println("조건식의 연산결과가 false면 수행되지 않는다."); //수행되지않고 바로 그냥 종료가 됨. 왜냐 거짓이니까.
		}
		
		if(a == 1){                     // if와 else if는 한 세트(둘중에 하나만 쓰여 무조건 세트니까)로 쓰지. if 처음에 참이면 걍 끝. 빠져나가 아래거 검사안하고. 근데 거짓이면 if else를 검사하겠지.
			System.out.println("a가 1인 경우에 하고싶은 것");
		}else if(a == 2){ 				// 필요에 의해서 else if는 계속 추가할 수 있음
			System.out.println("a가 2인 경우에 하고싶은 것");
		}else if(a == 3){
			System.out.println("a가 3인 경우에 하고싶은 것");
		}else{
			System.out.println("이외의 경우에 하고싶은 것");
		}
		
		
		
		//시험점수가 60점 이상이면 합격 그렇지 않으면 불합격
		int score = 70; //라는 변수를 만들고
		
		if(60 <= score){
			System.out.println("합격");
		}else{
			System.out.println("불합격");
		}
		
		
		//성적에 등급을 부여하는 프로그램을 작성해주세요.
		score = 55;
		String grade = null; // '값이 없다'라는 뜻으로 null을 적어줌 - 이렇게 해준 이유는. 초기화를 해줘야 하니깐. 초기화를 해주지않으면 변수를 사용할수가 없어서! 뭐라도 해줘야하니깐 null을 해준거야.
							 //  null 대신에 그냥 "" 요렇게 넣어도 무방.
		
		/* 내가 만든식. 더 간결하게 만들수가 있음. 아래 참고 
		  
		if(90 <= score){
			System.out.println("A");
		}else if(80 <= score && 89 >= score){
			System.out.println("B");
		}else if(70 <= score && 79 >= score){
			System.out.println("C");
		}else if(60 <= score && 69 >= score){
			System.out.println("D");
		}else{
			System.out.println("F");
		}*/
		
		
		if(90 <= score){
			grade = "A";
		}else if(80 <= score){
			grade = "B";
		}else if(70 <= score){
			grade = "C";
		}else if(60 <= score){
			grade = "D";
		}else{
			grade = "F";
		}			
		System.out.println(score + "점에 대한 등급은 " + grade + "입니다." );
		
		
		//참고 앞에서 배운 arithmetic
		//result = result + 10;
		//result += 10;
		
		// 점수등급 줄건데 A+, A, A- 로 더 세분화해서 나눠줄거야
		
		score = 100; // score를 100으로 우선 다시 초기화 해주고
		grade = null;
		
		if(90 <= score){
			grade = "A";
			if(97 <= score){
				grade += "+";
			}else if(score <= 93){
				grade += "-";
			}
		}else if(80 <= score){
			grade = "B";
			if(87 <= score){
				grade += "+";
			}else if(score <= 83){
				grade += "=";
			}
		}else if(70 <= score){
			grade = "C";
			if(77 <= score){
				grade += "+";
			}else if(score <= 73){
				grade += "-";
			}
		}else if(60 <= score){
			grade ="D";
			if(67 <= score){
				grade += "+";
			}else if(score <= 63){
				grade += "-";
			} 
		}else{
			grade = "F";
		}	
		System.out.println(score + "점에 대한 등급은 " + grade + "입니다." );
		
		
		
		/*
		 *  switch문
		 *  - switch(int/String){ case 1: break; }  - switch 다음에 조건식이 오는데 크고작고 이런게 아니고 int나 String을 사용해서 조건식이 온다.
		 *  - 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다.
		 *  - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 *  
		 *  switch는 조건이 굉장히 제한적임. 그래서 잘 사용안하고 if를 훨씬 더 많이 사용한다. 사용하긴하는데 그래도 if보단 덜.
		 *  
		 */
		
		a = 1; // 위에 int a = 1;이라고 선언해줌
		switch(a){     //괄호안에 조건식이 온다 a가 int이기 때문에 케이스에 1,2,3이 오는거
		case 1:
			System.out.println("a가 1인 경우에 하고싶은 것");
			break; //브레이크 만날때까지 위에 계속 실행함 만약 브레이크가 없다. 케이스 1면을 만나서 그 이후의 문장을 실행하게 되는데 2번문장도 실행을 하고 그 후의 브레이크에서 빠져나오게 된다. 케이스 1의 브레이크가 없으면 브레이크가 나올때까지 브레이크가 있는 케이스2까지 계속 실행해서 문장을 출력해냄 
		case 2:
			System.out.println("a가 2인 경우에 하고싶은 것");
			break;
		case 3:
			System.out.println("a가 3인 경우에 하고싶은 것");
			break;
		default:  //if의 else 역할을 하는게 디폴트
			System.out.println("a가 1,2,3이 아닌 경우에 하고싶은 것");
		}
		
		
		//위에는 정수를 사용한거 아래는 문자열을 사용한거
		String b = "a";
		switch(b){
		case "a":
			System.out.println("b가 \"a\"인 경우에 하고싶은 것");   //   \를 "앞에 적어주면 그게 하는 일을 없애주나? 원래 ""이거는 문자를 넣을때 하는거잖아 근데 &amp 이런건가?
			break;
		case "b":
			System.out.println("b가 \"b\"인 경우에 하고싶은 것");
			break;
		default:
			System.out.println("그 외의 경우에 하고싶은 것");
			break;  // 디폴트에는 이거 넣어도 되고 안넣어도 되고
		}
		
		
		//주어진 월에 해당하는 계절을 출력해봅시다.
		int month = 3;  //int 타입에 변수가 하나 있는데
		String season = null;
		switch(month){     // switch 에는 month 가 조건으로 들어와있고
		case 3:
		case 4:					
		case 5:				// case 3,4,5 사이에 브레이크가 없어서 season까지 실행되는거											
			season = "봄";
			break;
		case 6: case 7: case 8:   //case를 옆으로 이렇게 나열해도 돼
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		case 12: case 1: case 2:
			season = "겨울";
			break;
		}
		System.out.println(month + "월은 " + season + "입니다.");
			
		
		
		//a가 90-100 b는 80-99 케이스는 크고작고를 쓸수가 없어 그래서 10을 나눠서 case를 몇개만 만들어준거 그거 아니면 case를 엄청 많이 만들어야겠지. 이래 스위치가 복잡하니깐 if문을 쓰는거야
		score = 70;
		grade = null;
		switch(score / 10){
		case 9: case 10: grade = "A"; break;
		case 8:	grade = "B"; break;
		case 7:	grade = "C"; break;
		case 6:	grade = "D"; break;
		default: grade = "F";
		}
		System.out.println(score + "점에 대한 등급은 " + grade + "입니다.");
		
		
		
		

		
		/*
		//문제1 - 숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
		int test = 1;
		String test_t = "0이 아니다";
		switch(test){
		case 0: test_t = "0이다."; break;
		default: test_t = 
		}
		System.out.println(test);*/
		
		
		
		
		//nextLine , nextInt 설명!!!!!!!!!!!!!!!!!!
		//nextLine은 데이트를 입력받을때 11 111 이렇게 쓴것도 다 하나의 데이터로 받아들이는데, 
		//nextInt는 11 111이렇게 하면 처음에 띄어쓰기 하기전에 11이랑 111 이렇게 두개의 데이터로 받아들이기 때문에 
		//값이 달라질수가 있지
		
		
		
		
		// 문제2  - 숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		
		Scanner sc_2 = new Scanner(System.in); 
		System.out.println("숫자를 입력해주세요>");
		int num2 = Integer.parseInt(sc_2.nextLine());   
		//int num2 = sc_2.nextInt(); 어차피 숫자니깐 이거를 써도 무방. 그러면 parse안써도 됨
		
		if(1 == num2 % 2){
			System.out.println("홀수");
		}
		else{
			System.out.println("짝수");
		}		
		
		
		
		// 문제3 -  점수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
		
		//내가푼거 선생님 답은 아직 안적음
		double score_1 = 0;
		double score_2 = 0;
		double score_3 = 0;
	
		Scanner sc_3 = new Scanner(System.in); 
		System.out.println("점수 3개를 입력해주세요>");
		
	
		score_1 = Double.parseDouble(sc_3.nextLine());
		score_2 = Double.parseDouble(sc_3.nextLine());
		score_3 = Double.parseDouble(sc_3.nextLine());
		
		double total = score_1 + score_2 + score_3;
		double avg = total / 3;
		
		String grade_2 = null;
		if(avg >= 90 && avg <= 100){
			grade_2 = "A";			
		}else if(avg >= 80){
			grade_2 = "B";
		}else if(avg >= 70){
			grade_2 = "C";
		}else if(avg >= 60){
			grade_2 = "D";
		}else{
			grade_2 = "F";
		}		
		System.out.println("총점은 " + total + "이고, 평균은 " + avg + "이고, 등급은 " + grade_2 + "입니다." );	
		
		
		//문제3 선생님 답
		
		// 스캐너는 한번만 불러오면 또 안해도돼. 스캐너 불러올때 썼던 클래스를 nextLine이나 nextInt쓸때 사용하면 오키. 어차피 문법을 그냥 불러온거니깐 한번만 불러오면 되지		
		Scanner s = new Scanner(System.in); 
		System.out.print("국어>");
		int kor = Integer.parseInt(s.nextLine());
		System.out.print("영어>");
		int eng = Integer.parseInt(s.nextLine());
		System.out.print("수학>");
		int math = Integer.parseInt(s.nextLine());
		
		int sum = kor + eng + math;
		double avrg = sum / 3.0;
		
		if(90 <= avrg){
			grade = "A";
			if(97 <= avrg){
				grade += "+";
			}else if(avrg <= 93){
				grade += "-";
			}
		}else if(80 <= avrg){
			grade = "B";
			if(87 <= avrg){
				grade += "+";
			}else if(avrg <= 83){
				grade += "=";
			}
		}else if(70 <= avrg){
			grade = "C";
			if(77 <= avrg){
				grade += "+";
			}else if(avrg <= 73){
				grade += "-";
			}
		}else if(60 <= avrg){
			grade ="D";
			if(67 <= avrg){
				grade += "+";
			}else if(avrg <= 63){
				grade += "-";
			} 
		}else{
			grade = "F";
		}	
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avrg);		
		System.out.println("등급 : " + grade);
		
		
		
		// 문제 4 - 숫자 3개를 입력받아 오름차순으로 출력해주세요 최소값, 최대값 구하는거
		
		//Scanner s = new Scanner(System.in);  위에서 해줘서 또 안써줘도 돼.
		System.out.println("숫자1>");
		int x = Integer.parseInt(s.nextLine());
		
		System.out.println("숫자2>");
		int y = Integer.parseInt(s.nextLine());
		
		System.out.println("숫자3>");
		int z = Integer.parseInt(s.nextLine());
		
		if(x > y){
			int t;
			t = x;
			x = y; // x가 y보다 작아 그래서 둘의 위치를 바꿔줘야해 그러면 y값이 사라지니깐 그 사라진 값을 t로 해서 x에 집어넣는다???? t임시로 보관하기 위해 만든거 
			y = t; // t는 if문 안에 있는것이기 때문에 그 밖을 벗어나면 안돼			
		}
		
		if(x > z){ //z가  더 작을경우에
			int t = x;
			x = z;
			z = t;
		}
		
		if(y > z){
			int t = y;
			y = z;
			z = t;			
		}
		System.out.println(x + ", " + y + ", " + z);  // 무조건 x를 작은 숫자로 만들고 z를 제일 큰 숫자로 만들게끔 한 공식
		
			
	}
	
	
}

