package e_oop.score;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 성적처리를 만들거야 이번엔 클래스를 이용해서
		 * 학생이 여러명 필요하니까 배열을 만들거야
		 */
		Student[] students = new Student[10]; //학생 한명을 저장할수 있는 배열을 만들어줘. 그걸 10개 만들수있게 크기가 10 배열로 만듦 
		// students라는 이름의 배열을 만들어준거고 Student인거는 클래스명이라서 타입이 int이면 int라고 적어야 하는것처럼
		//같은 패키지에 있는 student야. userdefined에서 만든거랑. 
		//import를 해주지 않았다는건 student 클래스는 같은거란 소리야 	
	
		
		
		for(int i = 0; i < students.length; i++){ //기본값으로 저장되어 있는데 그건 null이야
			Student student = new Student(); // 객체를 하나 만들어서 배열에 저장을 할거야 
			//이건 Student라는 클래스에 (Student라는 타입인거지) student라고 변수 이름을 정해준거고
			//주의해야할점은 객체 생성을 for문 안에 만들어야한다는거!!!!!!!!!
			//밖에 있으면 똑같은 애가 10명의 정보가 저장이 되어있는거 포문돌면서 새로운 객체가 만들어지고. 그 변수가 배열에 저장이 되는거
			
			student.name = "학생" + (i + 1); //요렇게 해주면 학생1, 학생2 이렇게 이름이 들어감
			student.rank = 1; //기본적으로 1등이라 들어가
			student.kor = (int)(Math.random() * 101); // 랜덤으로 점수 만들어 줄거야
			student.eng = (int)(Math.random() * 101);
			student.math = (int)(Math.random() * 101);
						
			students[i] = student; //객체를 만들어서 배열에 저장을 하게되면 배열에 이제 차례차례 들어가겠지
			// 이 i에 student 클래스에 만들어준 전부가 들어가는거
			
			//여기까지 하면 기본적인 정보가 다 입력이 된거지
			//이제 합계 석차 평균 구해줌 돼			
			
			
			} // 정보를 담은 for문
		
		// 성적 관리 프로그램을 완성해주세요.
		
		
		
		for (int i = 0; i < students.length; i++) {
			students[i].sum = students[i].kor + students[i].eng + students[i].math; 
			//몇번째 students의 정보인지 알기위해 [i] 인덱스를 붙여주는거야.
			//students[i].avg = students[i].sum / 3;	
			students[i].avg = (int)Math.round(students[i].sum / 3.0 * 100) / 100.0;
		}

		for(int i = 0; i < students.length; i++){
			//students[i].rank = 1; 다시 선언 안해줘도돼
			for(int j = 0; j < students.length; j++){
				if(students[i].sum < students[j].sum){
					students[i].rank++;
				}
			}//System.out.println(students[i].name + " 점수 합계 : " + students[i].sum + " 평균 : " + students[i].avg + " 석차 : " + students[i].rank);
		}//System.out.println();
		
		
		
	/*	//삽입정렬 추가  - 이걸로 해도되는데 어려우니까 선택정렬로 하자
		for(int i = 1; i < students.length; i++){
			Student temp = students[i];
			int j = 0;
			for(j = i - 1; j >=0; j--){  //j는 i에서 1을 뺀거고 마지막이 0이 되니깐 0과 같거나 라고도 써줘야함
				if(temp.rank < students[j].rank){
					students[j + 1] = students[j]; 
				}else{
					break;
				}				
			}
			students[j + 1] = temp;
		}
		*/
		
		//선택정렬을 이용한 이걸로. 해주면 이제 정렬까지 준비가 됐어 		
				for(int i = 0; i < students.length - 1; i++){ //첫번째부터 마지막까지 갔을때 마지막 인덱스는 비교대상이 없어. 그래서 배열 크기에 -1
					int min = i; //가장 작은 값을 찾는게 아니고 위치를 찾는거라서 이걸 설정
					for(int j = i + 1; j < students.length; j++){ //i가 첫번째 인덱스 j는 두번째 인덱스로 서로 비교하는 거니깐 j는 i+1
						if(students[j].rank < students[min].rank){
							min = j;					
						}
					}
					Student temp = students[i];
					students[i] = students[min];
					students[min] = temp;
				}
			
		
		
		
	/*	System.out.println("\t국어\t영어\t수학\t합계\t평균\t석차");
		for(int i = 0; i < students.length; i++){			
			System.out.print(students[i].name + "\t");
			System.out.print(students[i].kor + "\t");
			System.out.print(students[i].eng + "\t");
			System.out.print(students[i].math + "\t");
			System.out.print(students[i].sum + "\t");
			System.out.print(students[i].avg + "\t");
			System.out.println(students[i].rank + "\t");			
		}
	*/
				
		System.out.println("\t국어\t영어\t수학\t합계\t평균\t석차");
		for(int i = 0; i < students.length; i++){			
			System.out.println(students[i].name + "\t" 
					+ students[i].kor + "\t" 
					+ students[i].eng + "\t"
					+ students[i].math + "\t"
					+ students[i].sum + "\t"
					+ students[i].avg + "\t"
					+ students[i].rank + "\t");			
		}		
		
		
		int[] sums = new int[3]; //과목 합계 구할때 그냥 이렇게 배열 선언해주는구나
		for(int i = 0; i < students.length; i++){
			sums[0] += students[i].kor;
			sums[1] += students[i].eng;
			sums[2] += students[i].math;
		}
		
		
		double[] avgs = new double[sums.length]; //sums의 길이도 3이니까 그냥 똑같이 불러와서
		for(int i = 0; i < avgs.length; i++){
			avgs[i] = (int)Math.round(sums[i] / (double)students.length * 100) / 100.0;
		}
		
		System.out.print("과목합계"); //과목 합계라고 제목 써주고, 옆으로 나열해서 써야 하니까 ln 빼고
		for(int i = 0; i < sums.length; i++){
			System.out.print("\t" + sums[i]);
		}
		System.out.println();
		System.out.print("과목평균");
		for(int i = 0; i < avgs.length; i++){
			System.out.print("\t" + avgs[i]);
		}
		
		
		
		
		
		
		
	}

}
