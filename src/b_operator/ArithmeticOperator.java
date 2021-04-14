package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * 산술 연산자
		 * - 사칙연산 : +, -, *, /, %(나머지) - 나누기하고 남은 나머지가 %
		 * - 복합연산자 : +=, -=, *=, /=, %= 
		 * - 증감연산자 : ++, --
		 */

		int result = 10 + 20 - 30 * 40 / 50 % 60; // 얘한테 뭔짓을 해도 아래 결과가 바뀌진 않는다. 그냥 int result = 0; 을해도 int result = 4;를 해도 그냥 변수에다가 데이터를 넣어준것이기 때문에 		
		//곱하기와 나누기가 더하기 빼기보다 우선순위가 높다.
		
		//나머지 연산
		result = 10 % 3; //답은 1
		System.out.println(result);
		
		
		//5개의 산술연산자를 사용해 5개의 연산을 수행 후 출력해주세요.
		
		result = 1 + 1; //양쪽에 피연산자가 있는데 양쪽에 있는걸 이항연산자 - 양쪽에 있는 데이터(같은 타입. int면 int끼리 long도 안됨)가 같아야만 연산을 할 수 있다. 
		System.out.println(result);
		
		result = 2 - 1;
		System.out.println(result);
		
		result = 2 * 10;
		System.out.println(result);
		
		result = 10 / 2;
		System.out.println(result);
		
		result = 10 % 4;
		System.out.println(result);
		
		//복합연산자
		//변수에 저장되어 있는 값에 연산을 수행할 때 수행할 연산자와 대입연산자를 결합해 사용할 수 있다.
		result = result + 3;
		System.out.println(result);
		
		//복합연산자를 사용해 좀 더 간단하게 만든게 아래
		result += 3;
		System.out.println(result);
		
		//위 두 문장은 같은 문장인거
		
		
		
		result -= 5;
		System.out.println(result);
		
		result *= 2;
		System.out.println(result);
		
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		//result = result + 10;
		result += 10;
		System.out.println(result);
		
		//result = result - 2 * 3;
		result -= 2 * 3;
		System.out.println(result);
		
		//result = result % 5;
		result %= 5;
		System.out.println(result);
		
		
		
		//증감연산자
		//증가연산자(++) : 변수의 값을 1 증가시킨다.
		//감소연산자(--) : 변수의 값을 1 감소시킨다.
		int i = 0;
		
		++i; //전위형 : 변수의 값을 읽어오기 전에 1 증가된다. - i를 먼저 1 증가 시킨 후 그 값을 사용
		i++; //후위형 : 변수의 값을 읽어온 후에 1 증가된다. - i 값을 먼저 사용한 후에 1 증가.
		
		
		--i; // 감소형도 마찬가지로 전위형은 변수의 값을 읽어오기 전에 1 감소된다. - i를 먼저 1 감소시킨 후 그 값을  사용
		i--; // 얘는 변수의 값을 읽어온 후에 1 감소된다. - i 값을 먼저 사용하고 나서 1 감소. - 그러니깐 i가 0이면 0을 먼저 사용하고 나서 1을 감소시키는거지 
		
		i = 5;
		System.out.println("++i = " + ++i);
		
		i = 5;
		System.out.println("i++ = " + i++);
		System.out.println(i);
		
				
		
		//피연산자의 타입이 서로 같아야만 연산이 가능하다.
		int _int = 10;
		double _double = 3.14;
		double result2 = _int + _double; //표현범위가 더 큰 타입으로 형변환된다. 형변환이 저절로 된거 = 저절로 되서 생략된거.		
		System.out.println(result2);
		 
		byte _byte = 5;
		short _short = 10;
		int result3 = _byte + _short; //int보다 작은 타입은 int로 형변환된다. int result3 = (int)_byte + (int)_short;  <- 이렇게 된거지
		System.out.println(result3);
		
		//오퍼플로우, 언더플로우
		//표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		byte b = 127; // -128 ~ 127 byte가 표현할수 있는 값
		b++;
		//b = (byte)(b + 1);// 만약에 2를 더하면 -127이됨
		// 숫자 1은 int이기 때문에 더했을때 자동으로 int가 되어서 더한값은 int가 됐는데 그걸 byte인 b에 넣으려고 하니 에러가 뜨지.
		// byte로 만들고 싶으면 형변환을 해줘야함.
		System.out.println(b);
		b--; //-129가 되어야하는데 안되니깐  반대쪽 제일 끝으로 가서 127이 됨
		System.out.println(b);
		
		//타입을 선택할 때는 연산의 범위를 고려해야한다.
		
		
		//문제 - 다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456	
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123465
		
		
/*		int result1 = 0;				
		result1 = 123465 + 654321; 
		result1 *= 123465;
		result1 /= 123456;
		result1 -= 654321;
		result1 %= 123465;
		System.out.println(result1);   이거는 에러	*/
		
		double res = 123456 + 654321; 		
		res = res * 123456;
		res /= 123456;
		res -= 654321;
		res %= 123456;
		System.out.println(res);
		
		
		
		
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		
		int num1 = 15;
		int num2 = 34;
		int num3 = 49;
		int sum = num1 + num2 + num3; // 그냥 sum이라고 이름을 지어준거지!!!
		/*double avg = sum / 3;  // 이렇게 하면 둘다(다 더한 결과값도 int이고 3도 int이고) int 라서 소수점을 나타낼수가 없음*/
		double avg = sum / 3.0; // 이렇게 해줘야함
		System.out.println("합계: " + sum + " / 평균: " + avg);
		
//		//반올림 해주는 메소드
//		avg = Math.round(avg); // 이걸 안하면 위 답은 32.666666666666664  이 메소드를 사용하면 33.0
//		System.out.println(avg);
//		
		/* avg = Math.round(avg * 10) / 10; 값은 나오는데 곱하기 10 나누기 10 하기전의 값이랑 똑같다. 이렇게 하면 둘다 int 라서 소수점을 나타낼수가 없음*/
		avg = Math.round(avg * 10) / 10.0; // 이렇게 소수점을 만들어주면 됨
		//만약 소수점 둘째자리까지 만들고 싶으면 위에 곱하기 10이 아니고 곱하기 100을 하고 다시 100.0을 나눠주면 됨
		System.out.println(avg);
		
		
		//랜덤
		System.out.println((int)(Math.random() * 100) + 1); // 1에서 부터 100까지 랜덤 수를 발생시키는것 - Math.random() -> 이 메소드는 0 에서부터 0.999999999...까지 랜덤수를 발생(0~1미만)
	 // int를 형변환 해줬고 100을 곱했으니깐 소수점이 사라지고 1부터 99까지의 랜덤인데 1을 더했으니깐 100이 되는거지
		
		

		//나혼자연습
		double a = 15.5546 + 20.89;
		System.out.println(a);
		a = Math.round(a);
		System.out.println(a);
		
		double a2 = 15.5546 + 20.89;
		System.out.println(a2);
		a2 = Math.round(a2*10) / 10.0;
		System.out.println(a2);
	}

}
