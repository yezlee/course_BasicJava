package c_statement;

import java.util.Scanner;

public class RepeatitiveStatement {
	
	public static void main(String[] args) {
			
		/*
		 * 반복문
		 * - for문
		 * - while문
		 * - do-while문 : while문의 변형된 형태
		 * 
		 * for문
		 * - for(초기화; 조건식; 증감식){}
		 * - 포함하고 있는 문장들을 정해진 횟수만큼 반복하게 해주는 문장 - 반복하는 횟수가 정확히 정해져 있음. 정해져 있는거에 주로 for문을 많이 사용하지.
		 */
		
		for(int i = 1; i <= 10; i++){
			//초기화 : 조건식과 증감식에 사용할 변수 초기화 ->   int i = 1;
			//조건식 : 연산결과가 true이면 블럭안의 내용을 수행한다. ->   i <= 10;
			//증감식 : 변수를 증가/감소시켜 반복문을 제어한다. ->    i++   - 제어는 빠져나오게 도와준다는 뜻
			System.out.println(i + "번째 반복"); // - i는 for문안에 속해있는 변수 - for문 밖을 벗어나면 더이상 i란 변수는 없는거지
			//초기화한 변수를 블럭안에서 사용할 수 있다.
		}
		
		// 규칙이 있는 문장들을 효율적으로 작성하기 위해 반복문을 사용한다.
		
		int sum = 0; //1부터 10까지 합계를 저장
		
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		System.out.println(sum + ".");
		
		sum = 0; //일단 sum은 다시 0으로 만들어주고 1부터 100까지 더해보자
		for(int i = 1; i <= 100; i++){     //증가하는 반복론
			sum += i;
		}
		System.out.println(sum+ "..");
		
		
		//이번엔 100에서부터 1까지 더해 보자
		sum = 0;
		for(int i = 100; i >= 1; i--){     //감소하는 반복론
			sum += i;
		}		
		System.out.println(sum);
		
		
		//문제1. 1부터 100까지 짝수의 합을 출력해주세요.		
		
		sum = 0;
		
		for(int i = 2 ; i <= 100; i += 2){    //짝수만 더하는거니깐 2부터 시작을 하고 그리고 2씩 증가를 해야하니깐 i++이 아니고 2씩 증가하는 i += 2 를 써주면 되는거
			sum += i;
		}
		System.out.println(sum);
		
		
		//or
		
		sum = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 0){
				sum += i;
			}
		}
		System.out.println(sum);
		
		
		
		//문제2. 1부터 100까지 홀수의 합을 출력해라
		
		sum = 0;
		for(int i = 1; i <= 100; i += 2){
			sum += i;
		}
		System.out.println(sum);
		
		//or
		
		sum = 0;
		for(int i = 1; i <= 100; i++){  //i++ 대신에 i += 2 도 됨. 왜냐, i++하면 1,2,3,4... i += 2는 1,3,5,7,9... 근데 어차피 if문에서 홀수만 걸러짐. 그래서 상관이 음따.
			if(i % 2 == 1){
				sum += i;
			}
		}
		System.out.println(sum);
	
		//구구단 출력
		/*
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * 2 * 4 = 8
		 * ... 
		 * 
		 */
		for(int i = 1; i <= 9; i++){
			System.out.println("2 * " + i + " = " + i * 2 +"test");
		}
			
		for(int i = 1; i <= 9; i++){
			System.out.println("7 * " + i + " = " + i * 7);
		}
		
		// 2단부터 9단까지 한번에 출력해보자 그럼 구구단 한단을 for문으로 또 감싸서
		for(int i = 2; i <= 9; i++){       //구구단이 2단부터 9단까지 반복하도록
			for(int j = 1; j <= 9; j++){   //이건 1,2,3,4..
				System.out.println(i + " * " + j + " = " + i * j);          //for문을 만들고 싶으면 규칙을 찾아!
			}
		}
		
		
		
		
		
		//내가 추가
		//1부터 99까지 숫자 출력하기 for문을 이용해서
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				System.out.println(i + "" + j);
			}			
		}
		
		//위 for문을 실행시키면, 우선 i가 0이지 그래서 i가 10보다 작다는 조건문에 맞음. 
		//그래서 그 안에 있는 for문으로 들어가서 j를 봐. j도 0이야 따라서 10보다 작다는 조건문에 맞네. 그래서 1을 더해
		//그러면 이제 출력을 해야하지. i는 0이고 j도 0. 출력결과는 00
		//아직 안에 있는 for문에서만 루프를 돌아, 아까 j가 0보다 작다는 조건문에 맞아서 j++했지 그래서 보니 j는 이제 1이야. 
		//j는 아직 1이고 10보단 작아서 다시 또 1을 더한 상태로 출력하면 i는 여전히 0이고 j는 1이지. 따라서 출력 결과는 01
		//그걸 계속 반복하면 02, 03, 04...
		//j는 이제 9야. 여전히 조건문에 맞아. 그래서 1을 또 더하고 출력하러 가서 09를 출력해
		//j가 10이 되었어 그랬더니 이제 조건문에 부합하지 않아. 10보다 작지 않아서. 그래서 출력을 못하고 그 for문을 빠져나와서 위로 올라가
		//i는 이제 1이지 0에서 조건문에 부합해서 1을 더했으니. 이제 1이 된 i에서 다시 j=0인거부터 시작.
		
		
		
		
		
		
		
		// 문제3. 구구단 전체를 가로로 출력해주세요.
		/*
		 *  2 * 1 = 2	3 * 1 = 3	4 * 1 = 4	5 * 1 = 5	6 * 1 = 6	7 * 1 = 7	8 * 1 = 8	
		 *  2 * 2 = 4	3 * 2 = 3	4 * 2 = 8	5 * 2 = 10	6 * 2 = 12	7 * 2 = 14	8 * 2 = 16
		 *  .
		 *  .
		 *  탭은 \t 	
		 *  
		 */
		
		/*for(int i = 2; i <= 9; i++){
			for(int j = 1; j <= 9; j++){
				System.out.print(i + " * " + j + " = " + i * j + "\t" );								
			}
			System.out.println("" );
		}*/
		
		//정답
		for(int i = 1; i <= 9; i++){    //한줄에 먼저 2x1=2 3x1=3 4x1=4.. 이걸 먼저 만들어야돼. 변하는애(반복문)가 for문 안에 들어가야지 그래야 걔가 다 돌고 조건식에 안맞아서 위로 다시 돌아갔을때 걔가 바뀌니까
			for(int j = 2; j <= 9; j++){
				System.out.print(j + " * " + i + " = " + i * j + "\t" );								
			}
			System.out.println("" );
		}
		
		
		/*
		 * 
		 * while문
		 * - while(조건식){}
		 * - 포함하고 있는 문장들을 조건식이 만족하는 동안 반복하는 문장
		 * - 반복횟수가 정확하지 않은 경우에 주로 사용한다.
		 * 
		 */
		
		int a = 1;
		//a에 2씩 몇번 곱해야 1000이상이 되는지 알아봅시다.
		int count = 0;
		while(a < 1000){
			a *= 2;
			count++;
			System.out.println(count + " : " + a);
		}
		
		
		/*
		 *  do-while문
		 *  - do{}while(조건식);
		 *  - 최소한 한번의 수행을 보장한다.
		 *  - 조건식의 결과가 false라 하더라도 무조건 한번은 실행한다. 왜? 먼저 {}을 do하라고 했자누 
		 */
				
		
		// nextLine , nextInt 설명!!!!!!!!!!!!!!!!!!
		// nextLine은 데이트를 입력받을때 11 111 이렇게 쓴것도 다 하나의 데이터로 받아들이는데,
		// nextInt는 11 111이렇게 하면 처음에 띄어쓰기 하기전에 11이랑 111 이렇게 두개의 데이터로 받아들이기 때문에
		// 값이 달라질수가 있지
		
		
		
		//숫자 맞추기 게임
		int answer = (int)(Math.random() * 100) + 1; // 1~ 100 랜덤수 - Math.random() 이게 0부터 0.99999까지만 랜덤이래서 100을 곱해주고 그럼 99니까 1을 더해서 100을 만들어준거
		int input = 0;
		Scanner s = new Scanner(System.in);
		do{
			System.out.print("1 ~ 100 사이의 수를 입력해주세요>");
			input = Integer.parseInt(s.nextLine());
			
			if(answer < input){
				System.out.println(input + "보다 작습니다.");
			}else if(input < answer){
				System.out.println(input + "보다 큽니다.");
			}else{
				System.out.println("정답입니다!");
			}
		}while(answer != input);  //do부터 우선 해. 그다음에 답이 아니면 반복해라. 게임을 이어나갈수있게.
		//     input이 answer가 아니면 반복문(while)을 다시 해라 라고 조건문()을 걸은것.
		//사람이 숫자를 입력 할지 안할지 모르니깐. 조건문이 나중에 붙는거지. 우선 입력을 해야 조건문을 실행하던말던 답이 맞는지 안맞는지 알려줄수있으니까
		
		//문제 4
		//구구단 출력할때 사용한 for문을 while문으로 바꿔라
		
		/*int i = 1;       // 이렇게 하면 무한루프 돌아서 렉걸림
		int j = 2;
		while(i <= 9){
			while(j <= 9){
				
				System.out.print(j + " * " + i + " = " + i * j + "\t" );								
			}
			System.out.println("" );
		}
	*/
		
		
		int i = 1;		
		while(i <= 9){
			int j = 2;
			while(j <= 9){				
				System.out.print(j + " * " + i + " = " + i * j + "\t" );
				j++;
			}
			System.out.println("" );
			i++;
		}
	
		
		
		
		// break와 continue의 차이점을 잘 기억을 해둬라!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		//이름붙은 반복문               구구단을 출력하는 거      
		outer : for(i = 2; i <= 9; i++){       //for반복문에 outer라는 이름을 지어준거
			for(int j = 1; j <= 9; j++){
				if(j == 5){
//					break; //가장 가까운 반복문 하나를 빠져나간다.
//					break outer; // outer라는 이름의 반복문을 빠져나간다.
//					continue; // 가장 가까운 반복문의 현재 반복 회차를 빠져나간다.  if(j == 5) 5만 건너뛰고 반복을 한다는 뜻 
					continue outer; // outer라는 이름의 현재 반복회차를 빠져나간다.					
				}
				System.out.println(i + " ** " + j + " = " + i * j);
			}
			System.out.println();
		}
		
		
		
		
		//별을 출력할건데 반복문을 사용해서 출력. 아래처럼 
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		
		for(i = 1; i <= 3; i++){
			for(int j = 1; j <= 5; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//문제5 반복문을 사용해서 아래를 만들어라
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		
		
		/*for(i = 1; i <= 5; i++){
			outer : for(int j = 1; j <= 5; j++){	
				break outer;
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		for(i = 1; i <= 5; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		//문제6 반복문을 사용해서 문제5와 반대되는 역삼각형으로 만들어라
		
		
		for(i = 1; i <= 5; i++){
			for(int j = 5; j >= i; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//답 - 위에서 증가했던걸 i만 바꿔서 감소시키면 됨. 가장 간단함
		for(i = 5; i >= 1; i--){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
