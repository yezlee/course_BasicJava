package c_statement;

import java.util.Scanner;

public class selfTest {

	public static void main(String[] args) {
		
		// 탄수화물 중독 자가질문 테스트
		
		Scanner sc = new Scanner(System.in);
		System.out.println("탄수화물 중독 테스트입니다. 맞으면 1 틀리면 0을 입력해주세요. 아침을 배불리 먹은 후 점심시간 전에 배가 고프다.");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다.");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다.");
		int c = Integer.parseInt(sc.nextLine());
		
		System.out.println("정말 배고프지 않더라도 먹을 때가 있다.");
		int d = Integer.parseInt(sc.nextLine());
		
		System.out.println("저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다.");
		int e = Integer.parseInt(sc.nextLine());
		
		System.out.println("스트레스를 받으면 자꾸 먹고 싶어진다.");
		int f = Integer.parseInt(sc.nextLine());
		
		System.out.println("책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다.");
		int g = Integer.parseInt(sc.nextLine());
		
		System.out.println("오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다.");
		int h = Integer.parseInt(sc.nextLine());
		
		System.out.println("과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다.");
		int i = Integer.parseInt(sc.nextLine());
		
		System.out.println("다이어트를 위해 식이조절을 하는데 3일도 못 간다.");
		int j = Integer.parseInt(sc.nextLine());
		
		int sum = a + b + c + d + e + f + g + h + i + j;  //총 10개
		
		String result = null;
		
		if(sum <= 3){
			result = "1~3개 : 주의! 위험한 수준은 아니지만 관리 필요함.";
		}else if(sum >= 4 && sum <= 6){
			result = "4~6개 : 위험! 탄수화물 섭취 줄이기 위한 식습관 개선이 필요함.";
		}else{
			result = "7개 이상 : 중독! 전문의 상담이 필요함.";
		}
		
		System.out.println(result);
		
	}	
	
}
