package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 * 다차원 배열
		 * - 배열안에 배열이 저장되어 있는 형태이다.
		 */
		
		//2차원
		int[][] array2; //대괄호가 두개 붙은게 2차원. 2번째 []까지 접근을 해야 실제 값이 있는거.
	
		//3차원
		int[][][] array3;
		//3차원 이상은 잘 사용하지 않음.
		
		
		//2차원 배열 만드는 방법1.
		int[][] arr = new int[2][3]; //2칸짜리 배열안에 각 칸마다 3칸짜리 배열이 생성된다.
		//3칸짜리가 2개있으니깐 총 6개 배열을 만들수 있는거
		
		//방법2.
		int arr2[][] = new int[][]{ {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }; //값의 개수로 배열의 길이가 정해진다.
		
		//방법3.
		int[] arr3[] = {  {1, 2, 3}
						, {4, 5, 6}
						, {7, 8, 9} }; //선언과 초기화를 동시에 해야한다.
		
		//방법4. - 자주 사용은 안해..
		int[][] arr4 = new int[3][]; //가변 배열. 1차원만 만들고 2차원은 null이지.
		//1차원만 배열크기 전해주고 2차원은 맘대로 할수 있는거야
		arr4[0] = new int[3]; //0번 인덱스에 3크기의 배열을 초기화 해주는거지
		arr4[1] = new int[4];
		arr4[2] = new int[10]; //3개의 1차원 인덱스 안에 맘대로 배열크기 만드는게 가변배열
		
		//2차원 인덱스까지 접근해야 사용할수있어.
		//2차원인덱스에 접근하기 위해선
		System.out.println(arr2[0][1]+"."); //2개 지정을 해줘야 사용할수있어. [1]만 출력못해 [0]걸 출력해야 [1]인걸 알지. [0]안에 있는 [1]인걸 알지.
		
//		arr[0] = 10; //당연한 얘기인데. 1차원에는 값을 저장할순 없고 배열을 저장할수있어. 이건 컴파일에러.
		arr[0] = new int[5];
		arr[0][0] = 10; //2차원에는 값을 저장할 수 있다.
		arr[0][1] = 20;//또다른인덱스에 접근을 해서 값을 저장해보자
		arr[1][0] = 100;
		//이거 이해안가
		
		
		
		
		//이제 for문 사용해보자
		System.out.println(arr.length); //1차원 배열의 길이
		System.out.println(arr[0].length + "."); //1차원배열의 길이에 접근을해서 가져오는게 2차원 배열의 길이
		
		for(int i = 0; i < arr.length; i++){
			//1차원 먼저 접근하고 2차원 접근해야하지
			for(int j = 0; j < arr[i].length; j++){ 
				System.out.println(arr[i][j]); //이거랑 아래랑 같은말
				System.out.println("arr[" + i + "][" + j + "] : " + arr[i][j]);
			}//이렇게 해야 모든 인덱스에 접근을 할수가있어
		
		}
			
			//문제
			int[][] scores = new int[3][5]; //int[학생수][과목수]  
			int[] sum = new int[scores.length]; // 
			double[] avg = new double[scores.length];
			//평균 - 학생 각각 과목 합계(3개) 평균(3개)
			
			for(int i = 0; i < scores.length; i++){
				for(int j = 0; j < scores[i].length; j++){
					scores[i][j] = (int)(Math.random() * 101);
				}
				System.out.println(Arrays.toString(scores[i]));
			}
			
			//합계와 평균을 구해라
			

			//int 배열 2개 만들어줘서 첫번째 배열크기는 3 - 학생수 , 두번째 배열크기는 5 - 과목수.
			// 1차원 배열 이름 sum에 점수라는 배열 크기를 지정해주고 (new int 하고 초기화할때 배열로 지정해준거지. 크기를 직접 정해준게 아니고)
			
		
			for(int i = 0; i < scores.length; i++){
				for(int j = 0; j < scores[i].length; j++){   //우선 이거 2개 써놓고. 우선 인덱스에 접근해야하니까. 모든인덱스르 다 돌게 만든거야. 이게. 
					sum[i] += scores[i][j];					
				}
				//avg[i] = sum[i] / scores[i].length; // 합계를 구하는건 for문이 끝나는시점이니까 여기다가
				avg[i] = (double)sum[i] / scores[i].length; // 소수점이 안나오니깐 scores나 sum이나 둘중 하나한테 형변환해줘
				System.out.println("합계 : " + sum[i] + " 평균 : " + avg[i]);
			}
			System.out.println(Arrays.toString(sum));
			
	}

}
