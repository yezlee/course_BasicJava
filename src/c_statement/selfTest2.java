package c_statement;

import java.util.Scanner;

public class selfTest2 {

	public static void main(String[] args) {
		
		int sum = 0;
		// String ans1 = null; 이걸 해줄 필요가 없고
		Scanner sc = new Scanner(System.in);
		
		System.out.println("탄수화물 중독 테스트입니다. 맞으면 o 틀리면 x를 입력해주세요.");
		System.out.println("1. 아침을 배불리 먹은 후 점심시간 전에 배가 고프다. >");
		String ans1 = sc.nextLine();
		switch(ans1){
		case "o":
			++sum;
			break;
//		default : sum = sum;
		}
		
		System.out.println("2. 밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다. o , x > ");
		String ans2 = sc.nextLine();
		switch(ans2){
		case "o":
			++sum;
			break;
//		default : sum = sum;
		}
		
		System.out.println("3. 음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다. o , x > ");
		String ans3 = sc.nextLine();
		switch(ans3){
		case "o":
			++sum;
			break;
//		default : sum = sum;
		}
		
		System.out.println("4. 정말 배고프지 않더라도 먹을 때가 있다. o , x > ");
		String ans4 = sc.nextLine();
		switch(ans4){
		case "o":
			++sum;
			break;
//		default : sum = sum;
		}
				
		System.out.println("5. 저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다. o , x");
		String ans5 =sc.nextLine();
		switch(ans5){
		case "o" :
			++sum;
			break;
//		default : sum = sum;
		}
				
		System.out.println("6. 스트레스를 받으면 자꾸 먹고 싶어진다. o , x");
		String ans6 = sc.nextLine();
		switch(ans6){
		case "o" :
			++sum;
			break;
//		default : sum = sum;
		}
		
		System.out.println("7. 책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다. o , x");
		String ans7 = sc.nextLine();
		switch(ans7){
		case "o" :
			++sum;
			break;
//		default : sum = sum;
		}
		
		System.out.println("8. 오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다. o , x");
		String ans8 = sc.nextLine();
		switch(ans8){
		case "o" :
			++sum;
			break;
//		default : sum = sum;
		}
		
		System.out.println("9. 과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다. o , x");
		String ans9 = sc.nextLine();
		switch(ans9){
		case "o" :
			++sum;
			break;
//		default : sum = sum;
		}
		
		System.out.println("다이어트를 위해 식이조절을 하는데 3일도 못 간다. o , x");
		String ans10 = sc.nextLine();
		switch(ans10){
		case "o":
			++sum;
			break;
//		default : sum = sum;	
		}
		
		if(sum <= 3){
			System.out.println(sum + "개 : 주의! 위험한 수준은 아니지만 관리 필요함.");
		}else if(sum >= 4 && sum <= 7){
			System.out.println(sum + "개 : 주의! 위험한 수준은 아니지만 관리 필요함.");
		}else{
			System.out.println(sum + "7개 이상 : 중독! 전문의 상담이 필요함.");
		}		
		
	}

}
