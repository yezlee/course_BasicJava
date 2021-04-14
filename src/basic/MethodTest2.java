package basic;

public class MethodTest2 {

	public static void main(String[] args) { //반환값, 메소드이름, 출력값
		/*
		 * 문제 ) 
		 * 1. 정수데이터 1개를 매개변수(파라미터변수)로 받아서 해당 숫자에 맞는 구구단을 출력하는 메서드를 작성하시오
		 * 2. 정수 2개를 매개변수로 받아서 큰값과 작은값을 구분해서 출력하는 메소드를 작성하시오
		 * 3. 정수 1개를 매개변수로 받아서 1부터 그 값 사이의 홀수의 합계를 반환하는메서드를 작성하시오
		 * 4. 정수 2개를 매개변수로 받아서 작은수부터 큰수까지의 합계를  반환하는 메서드를 작성하시오
		 */	
		//multi(2);
		//sort(15, 23);
		int result = oddSum(10);
		//oddSum(10); 이렇게만 해주면  값을 담을 곳이 없어져 그냥 사라져. 변수를 만들어줘야해
		System.out.println(result);
		
		int result2 = sumNum(1,10);
		System.out.println(result2);
		
		int result3 = sumNum(10,1);
		System.out.println(result2);
		
		
	}
	
	// 1. 정수데이터 1개를 매개변수(파라미터변수)로 받아서 해당 숫자에 맞는 구구단을 출력하는 메서드를 작성하시오
	public static void multi(int a) {	
		System.out.println(a + "단");
		for (int i = 1; i <= 9; i++) {
			System.out.println(a + "*" + i + "=" + i * a);
		}
	}
	
	// 2. 정수 2개를 매개변수로 받아서 큰값과 작은값을 구분해서 출력하는 메소드를 작성하시오
	public static void sort(int a, int b) {
		if (a > b) {
			System.out.println("큰값 : " + a + " 작은값 : " + b);
		}else if(a < b){
			System.out.println("큰값 : " + b + " 작은값 : " + a);
		}else{
			System.out.println(a + ", " + b + "는 같다." );
		}
	}
	
	
	//3. 정수 1개를 매개변수로 받아서 1부터 그 값 사이의 홀수의 합계를 반환하는메서드를 작성하시오
	public static int oddSum(int a){
		
	/*	int sum = 0;		
		for (int i = 1; i <= a; i++) {
			sum += i; //이건 전체합계
		}// return sum; 		
		
		for (int i = 1; i <= a; i++) {
			if (i % 2 == 1) {
				sum += i; //sum = sum + i
			}
		} return sum; // 이걸 어디로 돌려주지?
*/		
		
		//방법2
		int sum = 0;
		for(int i = 1; i <= a; i += 2){
			sum += i;  // sum = sum + i;
		}
		
		return sum;	
		
		
	}
	
	
	//4. 정수 2개를 매개변수로 받아서 작은수부터 큰수까지의 합계를  반환하는 메서드를 작성하시오
	
	public static int sumNum(int a, int b){
	/* 풀이 1단계
	 * 	int sum = 0;
		for(int i = 작은값; i <= 큰값; i++){
			sum += i;
		}return sum; */
		
		
		int sum = 0;
		int min; 
		int max;
		
		if(a>b){
			max = a;
			min = b;
		}else{
			max = b;
			min = a;
		}
		
		for(int i = min; i <= max; i++){
			sum += i;
		}return sum;
		
	}
	
	
	
	
	
	
}