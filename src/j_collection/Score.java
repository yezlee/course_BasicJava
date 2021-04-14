package j_collection;

import java.util.ArrayList;

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
		 *  과목합계     450		450		450		450     450 	450		450		
		 *  과목평균   90.00	    90.00	90.00	90.00   90.00	90.00   90.00 	
		 */  
		
		ArrayList<ArrayList<Integer>> score = new ArrayList<>();
		
		ArrayList<String> name = new ArrayList<>();
		name.add("김경찬");
		name.add("김우성");
		name.add("김형석");
		name.add("안용현");
		name.add("유승종");
				
		ArrayList<String> subject = new ArrayList<>();
		subject.add("국어");
		subject.add("영어");
		subject.add("수학");
		subject.add("사회");
		subject.add("과학");
		subject.add("Oracle");
		subject.add("Java");
		subject.add("합계");
		subject.add("평균");
		subject.add("석차");
		
		ArrayList<Integer> sum = new ArrayList<>();			
		ArrayList<Double> avg = new ArrayList<>();
		
		ArrayList<Integer> sub_score = new ArrayList<>();	
		
		
		for(int i = 0; i < score.size(); i++){
			sub_score = score.get(i);
			for(int j = 0; j < sum.size(); j++){
				sub_score.add((int)(Math.random() * 100) + 1);
				
				
				
				System.out.println(sum.get(j));
			}
		}
		
		
	}
}
