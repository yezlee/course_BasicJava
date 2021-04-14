package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
//		quiz1();  // 이렇게 메소드 만들고나서 ctrl + 1 눌러주면 아래 그냥 메소드?가 만들어짐  	이거 -> private static void quiz1() {}		
//		quiz2();  // 그래프 그리기
//		quiz3();  // 같은 숫자는 싫어
	    quiz4();  // 나누어 떨어지는 숫자 배열
		
	}

	private static void quiz4() {  //이건 걍 추가문제...
		int[] arr = new int[100];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1; //100개짜리 배열에 1부터 100까지의 랜덤한 수가 나와
		}
		/*
		 *  2~5 사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이루어진 배열을 정렬하여 출력해주세요.  //따로 배열하면 정렬된상태가 아니겠지? 그걸 정렬까지 해야함
		 *  5 - 이게 랜덤한수야
		 *  [5, 10, 15, 15, 20, 25]
		 */
		
		int[] temp = new int[100]; //넉넉하게 100개짜리 배열을 만들어 얼마나 필요한지 정확히 몰라서
		int n = (int)(Math.random() * 4) + 2;
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % n == 0){
				temp[count++] = arr[i];
			}
		}
		
		arr = new int[count];   //원래 숫자가 들어있던 배열을 초기화 시키면, 원래 있던 숫자는 사라지고 새로 넣어준 배열이 값을 갖게 되는것
		for(int i = 0; i < arr.length; i++){
			arr[i] = temp[i];
		}
		
		for(int i = 0; i <arr.length - 1; i++){
			int min = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[j] < arr[min]){
					min = j;
				}					
			}
			int tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
		}
		System.out.println("n : " + n);
		System.out.println(Arrays.toString(arr));
	}

	
	
	
	//문제3
	private static void quiz3() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 5) + 1; // arr[i] = 5
		}
	System.out.println(Arrays.toString(arr));
	
	/*
	 *  1~5 사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
	 *  [1, 3, 3, 2, 1 ,4, 5, 5, 1, 3]
	 *  [1, 3, 2, 4, 5] -배열의 길이는 5일수도 4 혹은 3이 될수도있지.
	 *  
	 *  1-5사이의 랜덤 값  - 위에 i가 그 랜덤값을 만들어내지.
	 *  10개 저장된 배열
	 *  중복된값을 제거
	 *  다시 배열
	 *  
	 */
		/*int[] array = new int[5];  //배열 초기화시 기본값이 저장된다. int는 기본값이 0. boolean이면 false. 참조형(배열,string)이면 null.
		for(int i = 0; i <= 5; i++){
		}	
		*/
		
		int[] temp = new int[5]; //중복되지 않는 값을 채워넣을거다. 임시로 
		//값을 하나하나 확인하기 위해 for문을 돈다
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			boolean flag = false;
			for(int j = 0; j < temp.length; j++){ //이제 값이 같은지 안같은지. 중복된 숫자가 있지만 같지 ㅇ낳은 경우도 있지. 근데 같은건 무조건 1번.
				if(arr[i] == temp[j]){ // 싹 돌았을때 같은데 하나라도 있는지없는지 확인
					flag = true;
				}
			}
			if(!flag){
				temp[count++] = arr[i]; // 문제는 몇번 인덱스를 사용해야하는지 몰러 그래서 또다른 변수를 하나 만들어줘 . count라고
			}	
		}
		System.out.println(Arrays.toString(temp)); //이러면 5개가 나올때 하나도 안나온게 그냥 0으로 뜸 그래서 새로운 배열을 하나 만들어줘
		//temp까지만 하면 빈칸이 생길수가 있어. 그래서 새로운 배열을 만들어서 결과만 딱 뜰수있게
		
		int[] result = new int[count];
		for(int i = 0; i < result.length; i++){
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result)); // 이랬을때 숫자가 없어서 안나오면 아무것도 안뜸. 
		
	
	}

	//문제2	
	private static void quiz2() {
		int[] arr = new int[20];                    //arr배열안에 20개의 원소가 들어있음 
		for(int i = 0; i < arr.length; i++){        //i가 arr배열의 크기 직전까지 반복하라는 반복문
			arr[i] = (int)(Math.random() * 5) + 1;  //1부터5까지의 랜덤 수를 만들어서 i에 넣어라
		}
		System.out.println(Arrays.toString(arr));
        //랜덤으로 뽑아서 i에 넣은 그 랜덤 숫자, 20개가 될때까지 반복한 그 숫자를 프린트해라.
		//값을 저장할수 있는 공간은 arr[0]부터 arr[19]까지 총 20개
		//i가 0일때 한번돌기 시작하니까 20전, 19까지 도는거. 그래서 총 20번
		
		/*
		 * 1~5의 숫자가 발생된 만큼 *을 사용해 그래프를 그려주세요.
		 * 
		 *  1 : *** 3
		 *  2 : **** 4
		 *  3 : ** 2
		 *  4 : ***** 5
		 *  5 : * 1
		 */
	    
		//배열을 하나 만들어서 카운트를 셀거다
		//배열을 돌면서 카운터를 세는거지 - 엊그제에도 카운트세는거 문제로 나옴
		int[] count = new int[5];
		for(int i = 0; i < arr.length; i++){
			count[arr[i] - 1]++; // 0번인덱스를 만들때 쓰는거 count[0]일때 1을 하나 더해라
		}		
		
		//그다음에 이렇게 해줌됨
		//일단 이렇게 갯수를 셀수있게
		for(int i = 0; i < count.length; i++){
			System.out.println(i + 1 + ":");
			for(int j = 0; j < count[i]; j++){
				System.out.print("*");
			}//이제 갯수를 세는거........???????????
			System.out.println(" " + count[i]);
		}
		
	}
			
	
	//문제1
	private static void quiz1() {
		int money = (int)(Math.random() * 500) * 10;  //0부터 499까지, -> 10을 곱했으니까 -> 0부터 4990 499.9999 일때 int로 형변환해줘서 499가 되고 거기다가 10을 곱했으니 4990
		int[] coin = {500, 100, 50, 10}; //10을 곱했으니까 10단위로 끊어져 나오는거
		System.out.println("거스름돈 : " + money);
		/*
		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
		 * 
		 * 거스름돈 : 2860원
		 * 500원 : 5개
		 * 100원 : 3개
		 * 50원 : 1개
		 * 10원 : 1개
		 */
		
		/*int count = money / coin[0]; // 5개 = 2860원 / 500원
		System.out.println(coin[0] + "원 : " + count + "개" );
		
		money = money % coin[0]; // 360원 = 2860원 % 500원
		count = money / coin[1]; // 3개 = 360원 / 100원
		System.out.println(coin[1] + "원 : " + count + "개");
		
		money = money & coin[1];
		count = money / coin[2];
		System.out.println(coin[2] + "원 : " + count + "개");
		
		count = money / coin[3];
		money = money & coin[4];
		System.out.println(coin[3] + "원 : " + count + "개");*/
		
		
		
		
		//내가 노가다로 만든거
		/*int won_500 = (money/500);
		int rest000 =(money%500);
		
		int won_100 = (rest000/100);
		int rest00 =(rest000%100);
		
		int won_50 = (rest00/50);
		int rest0 =(rest00%50);
		
		int won_10 = (rest0/10);
		int rest =(rest0%10);			
		
				
		System.out.println("500원 : " + won_500);
		System.out.println("100원 : " + won_100);
		System.out.println("50원 : " + won_50);
		System.out.println("10원 : " + won_10);				
		*/
	}

}
