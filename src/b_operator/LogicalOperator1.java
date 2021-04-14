package b_operator;

public class LogicalOperator1 {

	public static void main(String[] args) {
		/*
		 * 논리연산자
		 * - &&(AND), ||(OR), !(NOT)
		 * - 피연산자로 boolean만 허용한다.
		 * 
		 * */
		boolean b = 5 < 20 && 15 % 2 == 0 || 0 >= 5;   // 비교연산은 연결해주는 역할을 한다. 비교연산이 먼저 연산된다 논리연산보다. &&는 양쪽연산이 같아야 트루나오고 ||는 둘중 하나만 참이어도 참. 
		// ||보다 &&의 우선 순위가 높다.
		
		b = !(10 > 20); //조건식의 결과를 반대로 저장한다.
		System.out.println(b);
		
		
		//효율적 연산
		b = true && true; //true
		b = true && false; //false
		b = false && true; //false -> 노란줄은 경고의 의미임. 문제가 있을수 있다. 왜 생기냐면 &&는 둘중하나만 거짓이어도 거짓이라 뒤를 읽지를 않고 수행을 함. 그래서 이미 거짓이라 뒤에 필요없다고 노란줄 뜨는거
		b = false && false; //false
		
		b = true || true; //true
		b = true || false; //true
		b = false || true; //true
		b = false || false; //false
		
		
		int a = 10;
		b = a < 5 && 0 < a++;
		System.out.println(a); // 오른쪽을 수행하지 않기때문에 답이 10임. 오른쪽을 수행하면 답이 11이 되겠지. &&는 처음부터 하는데 어차피 처음이 a가 10이고 5보다 작다라고 했지만 그건 거짓. 그래서 실행을 안해. 안해서 a++이 나와도 실행 안하고 10이 됨.
		/*System.out.println(b); 이건 false로 뜸 */
		
		
				
		//int타입의 x와 y의 변수를 만들고, 다음의 문장들을 코드로 작성해라
		int x = 1;
		int y = 2;
				
		// 1. x가 y보다 크고, x가 10보다 작다.
		System.out.println(x > y && x < 10);
		
		// 2. x가 3의 배수이거나, x가 5의 배수이다.
		System.out.println(x % 3 == 0 || x % 5 == 0);
		
		
	}

}
