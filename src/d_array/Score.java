package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 *  우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 *  0 ~ 100까지 랜덤으로 생성해주시고, 아래와 같이 출력해주세요. 
		 *  
		 *  		국어		영어		수학		사회		과학		Oracle	Java   	합계		평균		석차
		 *  홍길동	90		90		90		90		90		90		90		630		90.00	1			
		 *  홍길동	90		90		90		90		90		90		90		630		90.00	1		
		 *  홍길동	90		90		90		90		90		90		90		630		90.00	1			
		 *  홍길동	90		90		90		90		90		90		90		630		90.00	1			
		 *  홍길동	90		90		90		90		90		90		90		630		90.00	1			
		 *  홍길동	90		90		90		90		90		90		90		630		90.00	1			
		 *  과목합계   450		450		450		450     450 	450		450		
		 *  과목평균   90.00	90.00	90.00	90.00   90.00	90.00   90.00 	
		 */  

		
		int[][] scores = new int[5][7]; //int[학생수][과목수]
		String[] name = {"김경찬" , "김우성" , "김형석" , "안용현" , "유승종"}; 
		String[] subject = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java", "합계", "평균", "석차"};
		int[] sum = new int[scores.length]; 		
		double[] avg = new double[scores.length];
		//평균 - 학생 각각 과목 합계(7개) 평균(7개)
		System.out.println(Arrays.toString(subject));
		
		
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				scores[i][j] = (int)(Math.random() * 101);
				sum[i] += scores[i][j];	
				avg[i] = (double)sum[i] / scores[i].length; 
			}
			System.out.println("김경찬" + Arrays.toString(scores[i]) + "  "+  sum[i] + "  " + avg[i]);
		}
		
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){   //우선 이거 2개 써놓고. 우선 인덱스에 접근해야하니까. 모든인덱스르 다 돌게 만든거야. 이게. 
				sum[i] += scores[i][j];					
			}			
		}
		
		
	}

}
