package c_statement;

import java.util.Scanner;
import java.util.Random; //랜덤 임폴트

public class Baseball {

	static int strike = 0; // 스트라이크 - 변수 // 정적 변수 선언 및 값 초기화. (//변수가 사라지지 않게 하려면
							// 정적 변수를 사용해야 합니다. )
	static int ball = 0; // 볼 - 변수

	public static void main(String[] args) {
		// 숫자 야구게임
		// 질문자가를 생각해 세자리 숫자. 그럼 답변자가 맞춰.
		/*
		 * 예를 들어 135 - 그럼 내가 맞춰
		 * 
		 * 누군가가 123 - 1S 1B 1O 자릿수가 똑같아 1S , 3이라는 숫자가 있는데 자릿수가 달라 그럼 1B , 2는 아예
		 * 없어 그럼 원아웃 1O : 123은 내가 입력한 숫자 또다른거 345 - 1S 1B 1O 3은 있지만 자릿수가 달라 1볼,
		 * 4는 없어 1아웃, 5는 있는데 자릿수도 같아 1스트라이크 또다른거 147 - 1S 0B 2O
		 * 
		 * 세자리 숫자 각자 1-9까지 중복되지 않음
		 * 
		 * 1-9까지를 3개 만들어야돼. 근데 중복되지 않게
		 */

		double a1 = (int) (Math.random() * 9) + 1;
		int a2;
		int a3;

		do {
			a2 = (int) (Math.random() * 9) + 1;
		} while (a1 == a2);

		do {
			a3 = (int) (Math.random() * 9) + 1;
		} while (a1 == a3 || a2 == a3);

		Scanner s = new Scanner(System.in);
		int count = 0;
		while (true) {
			System.out.println("3자리의 숫자>");
			int input = Integer.parseInt(s.nextLine());
			int i3 = input % 10;
			input /= 10;
			int i2 = input % 10;
			input /= 10;
			int i1 = input % 10;

			int strike = 0;
			int ball = 0;
			int out = 0;

			if (a1 == i1)
				strike++;
			if (a2 == i2)
				strike++;
			if (a3 == i3)
				strike++;

			if (a1 == i2 || a1 == i3)
				ball++;
			if (a2 == i1 || a2 == i3)
				ball++;
			if (a3 == i1 || a3 == i2)
				ball++;

			out = 3 - strike - ball;

			System.out.println(++count + "차 시도(" + i1 + i2 + i3 + ") : "
					+ strike + "S " + ball + "B " + out + "O");
			System.out.println("----------------------------");
			if (strike == 3) {
				System.out.println("정답입니다!!");
				break;
			}

		}
	}

}
