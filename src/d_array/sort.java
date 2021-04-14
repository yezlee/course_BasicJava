package d_array;

import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
		/*
		 * 석차구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		 * 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 * 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		 * 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰 수는 뒤로 밀고 중간에 삽입하는 방식 - 얘는 좀 어려움.....
		 */
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;	//arr이라는 변수에 i 인덱스 값을 랜덤으로 돌리는거지 1부터 100까지 	
		}
		System.out.println(Arrays.toString(arr));
		
 		printRank(arr); // 석차구하기  - 컴파일에러 뜰때 ctrl + 1 하면 아래 메소드등장(메소드가 만들어짐)    - 구했으니까 주석처리
//		selectSort(arr); // 선택정렬
//		bubbleSort(arr); // 버블정렬
//		insertSort(arr); // 삽입정렬
		
		//다행히도 이런 정렬을 실제로 할일은 없어 메소드가 있거든
		Arrays.sort(arr); // ctrl + shifr + o 해서 메소드 불러와서 쓰면됨 //얘는 quick sort를 사용한거
		System.out.println(Arrays.toString(arr));
		//위에거 아님 퀵정렬 써줌됨
		
	}
	
	// 문제4 삽입
	// 삽입정렬
	private static void insertSort(int[] arr) {	
		/*
		 * i,j
		 * 1,0        
		 * 2,1    2,0
		 * 3,2    3,1    3,0
		 * 4,3    4,2    4,1    4,0    
		 * 5,4    5,3    5,2    5,1    5,0
		 * 6,5    6,4    6,3    6,2    6,1    6,0
		 * 7,6    7,5    7,4    7,3    7,2    7,1    7,0
		 * 8,7    8,6    8,5    8,4    8,3    8,2    8,1    8,0
		 * 9,8    9,7    9,6    9,5    9,4    9,3    9,2    9,1    9,0
		 * 
		 * i가 일부터 시작하고 i가 증가할때 j도 증가함 - j는 i보다 1이 작아
		 * 
		 * 
		 */
		
		for(int i = 1; i < arr.length; i++){
			int temp = arr[i];
			int j = 0;
			for(j = i - 1; j >=0; j--){  //j는 i에서 1을 뺀거고 마지막이 0이 되니깐 0과 같거나 라고도 써줘야함
				if(temp < arr[j]){
					arr[j + 1] = arr[j]; 
				}else{
					break;
				}				
			}
			arr[j + 1] = temp;
		}
		
		
		
	}
	
	//문제3 
	//버블정렬
	private static void bubbleSort(int[] arr) {		
		/*
		 * 0,1    1,2    2,3    3,4    4,5    5,6    6,7    7,8    8,9  
		 * 0,1    1,2    2,3    3,4    4,5    5,6    6,7    7,8
		 * 0,1    1,2    2,3    3,4    4,5    5,6    6,7
		 * 0,1    1,2    2,3    3,4    4,5    5,6
		 * 0,1    1,2    2,3    3,4    4,5
		 * 0,1    1,2    2,3    3,4
		 * 0,1    1,2    2,3
		 * 0,1    1,2    
		 * 0,1   
		 *  
		 */
		for(int i = 0; i < arr.length - 1; i++){ //i한테 -1을 해준 이유는 10을 돌면 flase가 되니까. 인덱스는 0부터 9까지만 있으니깐
			boolean changed = false;
			for(int j  = 0; j < arr.length - 1 - i; j++){ //어차피 8까지 가면 9랑 비교하니깐 그 이후는없어 9랑 비교하면 10이랑이자나
				// i는 for문이 도는 횟수야. 도는 횟수가 계속 줄어들자나 그래서 i를 빼준거야 그럼 9번돌고 8번돌고 7번돌고..이렇게 줄어드니까
				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					changed = true;
				}
			}
			if(!changed){ //바뀌지 않았다. 바뀌지 않은경우에 break하겠다. // if(changed == false) 랑 같은 말(이건 changed가 false일때)
				break;
			}
		}
		System.out.println(Arrays.toString(arr));		
	}
		
		
//다른뻘짓. 이건 버블이 아니고 선택과 다를게 없는거		
		/*for(int i = 0; i < arr.length; i++){            //선택정렬은 한번에 다 찾아서 한번에 바꿔준거야
			int big = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[j] < arr[big]){
					big = j;					
				}
			}
			int temp = arr[i];
			arr[i] = arr[big];
			arr[big] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}*/

	//문제2
	//선택정렬 - 제일 작은 수를 앞에다 놓는 식(오름차순) - 0번 인덱스와 1번 인덱스를 비교해서 작은 애를 앞에다 놓는식
	private static void selectSort(int[] arr) {		
		
		for(int i = 0; i < arr.length - 1; i++){ //첫번째부터 마지막까지 갔을때 마지막 인덱스는 비교대상이 없어. 그래서 배열 크기에 -1
			int min = i; //가장 작은 값을 찾는게 아니고 위치를 찾는거라서 이걸 설정
			for(int j = i + 1; j < arr.length; j++){ //i가 첫번째 인덱스 j는 두번째 인덱스로 서로 비교하는 거니깐 j는 i+1
				if(arr[j] < arr[min]){
					min = j;					
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	// 석차구하기
	// 그 코드를 아래 안에다가 작성
	// 문제1
	private static void printRank(int[] arr) {
		//석차를 저장할 배열을 생성한다.
		int[] rank = new int[arr.length]; //위에다가 arr이라는 int에 new int[10]이라고 배열크기를 정해줌. 근데 그 10랜덤으로 뽑는 10개의 원소
		//p.74 처음에 배열 초기화 시켜준거랑 같은애
		
		
		//석차를 저장할 배열의 모든 인덱스를 1로 초기화 한다.
		for (int i = 0; i < rank.length; i++){ //for문 안에서만 도니까 계속 i라는 변수를 적어줄수 있는것
			rank[i] = 1;
		}
		
		//점수를 비교해 작은 점수의 석차를 증가시킨다.
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(arr[i] < arr[j]){
					rank[i]++;
				}
			}
		}
		System.out.println(Arrays.toString(rank) + ".");
			
/*내 삽질
 * 		int ran[]= {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}; 
		
		for(int i = 0; ran[0] > ran[1]; i++ ){
			for(int i2 = 0; ran[0] > ran[2]; i++){
				for(int i3 = 0; ran[0] > ran[3]; i++){
					
				}
			}
			
		}
		System.out.println(Arrays.toString(ran));
*/	}

}
