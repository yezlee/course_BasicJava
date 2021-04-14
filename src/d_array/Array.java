package d_array;

import java.util.Arrays;

public class Array {
	
	public static void main(String[] args){
		/*
		 * 배열 
		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 * - 참조형 타입니다. 기본형이 아니야. 값을 따로 저장한 그 주소를 변수에 저장하는것이 참조형.
		 * - 인덱스 값을 구분한다. 인덱스는 숫자가 0부터 시작을함 - 컴퓨터의 숫자는 0부터 시작하는 특징을 갖고있음. a[0] <- a라는 변수에 0번째 인덱스. 그말인즉슨 첫번째 데이터라는 거
		 * - 길이를 변경 할 수 없다. 4개짜리 배열을 만들었으면 변경 못함. 만약 10개자리 만들고 싶으면 그냥 처음만든거 버리고 10까지 새로 만들고 그 주소를 변수한테 다시 주어야함
		 * - [] <- 이걸 인덱스index라고 함 한국어로는 색인. 책에 있는거. - 책볼때 내가 원하는 정보를 빠르게 찾을수있는 그런 색인.
		 */
		int[] array; // 배열의 주소를 저장할 공간이 만들어진다. - 참조형타입의 크기는 4바이트! 
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다.  int 5개를 저장할 수 있는 공간이 생성되는거 그 주소가 변수  array에 저장이 되는것. [] -> 인덱스 지정 , 크기를 지정할때도 사용
		//0이 5개가 들어가있는 상태가 만들어진거
		
		//배열 초기화시 기본값이 저장된다. int의 경우엔 기본값이 0. ??????????? 사실 기본화타입의....기본값이 거의 다 0 - 숫자형은. Boolean은 기본값은 false. Char는..역시 기본값이 0이라고볼수있는데, 문자는 숫자하나랑 문자하나를 매치시킴. 문자를 표현하기위해 숫자를 쓰고 보여줄때만 문자를씀 
		//참조형값은 기본형이 null(공백?!)
		//boolean : false
        //char : ' ' (공백)	
		//참조형타입(배열, String) : null
		
		
		//배열을 만드는 다른방법2
		array = new int[]{1, 2, 3, 4, 5}; //위에처럼 대괄호안에 몇개인지 알려줄수도 있고, 중괄호를 써서 직접 적어줄수도 있음   -초기화할때부터 값을 넣고 초기화하고싶다할때 사용
		 
		//1, 2, 3... 이 각각의 값을 원소라고 한다. element.
		
		//배열을 만드는 다른방법3
//		array = {1, 2, 3, 4, 5}; 이렇게만 하면 컴파일에러뜸
		//따라서 선언과 초기화를 동시에 해야한다.
		int[] array2 = {1, 2, 3, 4, 5}; // 요렇게
		
		//값을 구분을할때는 인덱스로 구분을함
		System.out.println(array[0]); // -0번인덱스의 값을 출력을 하는것임 -첫번째인덱스
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		
		//다시 인덱스 값을 저장해줌
		array[0] = 10;  //0번 인덱스 값을 저장할때. 첫번째 인덱스값에 10이라고 저장한것.
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		//규칙이 있기 때문에 반복문과 함께 사용한다
		
		System.out.println(array[0]); // -0번인덱스의 값을 출력을 하는것임 -첫번째인덱스
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		
		
		//추가 length
		//String[] classGroup = {"최진혁", "최유빈", "한이람", "이고잉"}; - 이건 한번에 배열을 나타낸거고
		String[] classGroup = new String[4];   //이방법은 위와 결과는 같지만 분할해서 나타낸거
		// 위에 클래스그룹을 실행했을때는, 클래스그룹안에 어떤 값도 저장되어있지 않은 상태. 다만, 클래스그룹에 담겨있는 배열은 문자열이고 4개의 값을 가질수 있다. 라고만 지정을 한거.
		classGroup[0] = "최진혁"; // 배열에 있는 첫번째 원소 - 이건 최진혁이라는 값 하나만 담겨있는 상태.
		System.out.println(classGroup.length); //위에서 최진혁이라는 하나의 값만 넣어준 상황에서 length를 출력을 하면 1이 될거같지만 4!!!야. 
		// length라고 하는것은  현재 클래스그룹이라는 변수에 담겨있는 값이 몇개있느냐를 알려주는게 아니고 클래스그룹이라는 변수에 담겨있는 배열은 몇개의 값을 수용할수 있느냐를 알려주는 값이다.
		classGroup[1] = "최유빈";
		System.out.println(classGroup.length); //따라서 이값도 4
		classGroup[2] = "한이람";
		System.out.println(classGroup.length); // 이값도 4
		classGroup[3] = "이고잉";
		System.out.println(classGroup.length); // 이값도 4가 나온다.
		 
		//따라서 classGroup이라는 요 변수에 담겨있는 배열은 어떤 구조를 갖고 있냐면,
		//0번째 인덱스에는 최진혁이라는 값을 갖고 있고
		//1번째 인덱스에는 최유빈이라는 값을 갖고있고.....
		//그 각각의 값을 element라고 한다. 그 element를 내가 찾을수 있는 식별자는 [0],[1]..인덱스이지.
		//이 배열, classGroup이라는 이 배열에 담을수 있는 최대 데이터의 크기는 length라는 classGroup뒤에 .을 붙이고 length를 쓰면 얻어올수 있는데(classGroup.length) 그 값은 항상 4를 리턴한다. - 처음에 정했으니까
		
		
		
		
		
		int sum = 0;
		for(int i = 0; i < array.length; i++){ //length 배열의 길이(크기)를 정해주는 하나의 변수. 만약 배열의 길이가 5다. 그럼 5는 표현이 안되기때문에 그것보다 작다. 그럼 i가 돌면서 더하는거지
			sum += array[i];						
		}
		System.out.println("합계 : " +sum);

		//질문?  그럼 배열의 크기가 갯수로 따지는게 아니고 인덱스 크기로 따지는건가????????????????
		
			
		//자동완성 : Ctrl + Spacebar		
		//한줄복사 : Ctrl + Alt + 방향키
		//한줄이동 : Alt + 방향키
		//한줄삭제 : Ctrl + d
		
		
		//문제1: 10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요
		int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
	
		//문제2 : 배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요.
		/*array3[0] = (int)(Math.random() * 100) + 1; 
		array3[1] = (int)(Math.random() * 100) + 1;
		array3[2] = (int)(Math.random() * 100) + 1;
		array3[3] = (int)(Math.random() * 100) + 1;
		array3[4] = (int)(Math.random() * 100) + 1;
		array3[5] = (int)(Math.random() * 100) + 1; 
		array3[6] = (int)(Math.random() * 100) + 1;
		array3[7] = (int)(Math.random() * 100) + 1;
		array3[8] = (int)(Math.random() * 100) + 1;
		array3[9] = (int)(Math.random() * 100) + 1;*/
		
		//or
		
		for(int i = 0; i < array3.length; i++){		
			array3[i] = (int)(Math.random() * 100) + 1;
		}
		
		//문제3 배열에 저장된 모든 값의 합계과 평균을 구해라
		
		sum = 0;
		for(int i = 0; i < array3.length; i++){	
			sum += array3[i];
		}
		double avg = sum / array3.length;
		System.out.println("합계 : " + sum + " / 평균 : " + avg);
		
		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요
		
				
		
		int min = array3[0];
		int max = array3[0];
		
		for(int i = 0; i < array3.length; i++){		
			if(max < array3[i]) {
				//max의 값보다 array3[i]이 크면 max = array3[i]
				max = array3[i];
			    }
			
			if(min > array3[i]) {
				//min의 값보다 array3[i]이 작으면 min = array3[i]
				min = array3[i];
			    }
		}
		
		System.out.println("-최대값 : "+ max);
		System.out.println("-최소값 : "+ min);		
	
		
		
		
		
		//shuffle을 배워보자		
		int[] shuffle = new int[10];
		for(int i = 0; i < shuffle.length; i++){
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle)); //배열에 있는값을 한번에 보여주는 메소드
		
				
		//문제 . 배열의 값을 섞어주세요.
		
		//랜덤한 인덱스값을 발생시켜서 그걸 0번에 있는 인덱스랑 자리를 바꿔주고 그걸 반복하다보면 배열이 섞이게 된다.
		//0부터 9까지의 인덱스값을 발생시켜서
	
		//위내용을 반복한다.	
	
		//정답 ----풀이과정 -----
		
		// 2. 반복문을 만들고
		for(int i = 0; i < shuffle.length; i++){
		
		// 1. 이걸먼저 만들어주고
		int random = (int)(Math.random() * shuffle.length);
		int temp = shuffle[0];
		shuffle[0] = shuffle[random];
		shuffle[random] = temp;		
		}
		
		System.out.println(Arrays.toString(shuffle));
		
		
		
		
		//문제 . 1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
	//2. 10개 짜리 배열을 만들자
		int[] count = new int[10];
	//1. for문을 500번 돌려야하니깐 그걸 적자  
		for(int i = 0; i < 500; i++){
			int ran =  (int)(Math.random() * 10) + 1;
			count[ran - 1]++;   //이렇게하면 숫자를 다 센거래. 뭔말이야 뻑뻑뻑뻒뻒뻒ㅂ껍껍껍ㄲ꺼			
		}
		System.out.println(Arrays.toString(count));
		
		
		

//		int[] a = new int[10];
//		int count = 0;
//		
//		for(int i = 0; i < 500; i++){
//			int random =  (int)(Math.random() * shuffle.length);
//		}
//		
//		
		
		
		
		
	}	
}
