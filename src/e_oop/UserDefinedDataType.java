package e_oop;

public class UserDefinedDataType {

	public static void main(String[] args) {
		/*
		 * 사용자 정의 데이터 타입
		 * - 데이터의 최종 진화 형태이다. (변수 -> 배열 -> 클래스)
		 * - 서로 다른 타입의 데이터를 묶어서 사용하는것이다. (변수의 불편함이 같은 타입의 데이터만 묶을수 있는거였으니까)
		 * - 변수와 메소드로 구성할 수 있다. 
		 */

		//변수만 사용을 할 때는,
		//변수(1개의 변수에는 1개의 데이터만 저장)
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		String name;
		//데이터만 사용할땐 변수의 양이 많아짐.
		
		// 배열사용하게되면 좀 줄어듬
		//배열(같은 타입의 데이터를 여러개 저장)
		int[] scores; //국영수를 하나의 배열로 묶었지
		int sum2;
		double avg2;
		String name2; 
		//데이터 사용할때보단 조금은 줄일수 있었어
		
		//student 클래스를 사용하려면 타입을 가진 변수를 만들면 된다
		Student student; // Student라는 타입을 가진 변수를 만든거. 참조형타입. 기본값은 null. 초기화 하기 위해서 타입에 맞는 값을 넣어줘야 하잖아
		student = new Student(); // 객체 생성(인스턴스화) // student타입의 변수를 만든것(클래스를 타입으로 만든) ()이게 오는건 메소드. 라고 함. 하나의 생성?????? - 나중에
		
		//얘를 사용하기 위해선. 클래스 안에 있는 변수를 사용하고 싶어. 어떤 범위 안에 들어갈떄는 참조연산자인 점 . 을 찍어준다. 점을 찍어주게 되면 팝업이 하나뜨는데 내가 만든 변수들이 쭉 떠. 그중에 하나를 선택.
		//package를 만들때도 .을 찍어주면 하위 패키지를 생성할 수 있어.
//		student.kor // 클래스 안에있는 kor라는 변수를 가져온거
		student.kor = 80; // 변수안에 값을 저장한거
		student.eng = 90;
		student.math = 60; //값을 넣어줄때 래스를 통해 만든 변수를 통해서 접근하면 돼.
		student.sum = student.kor +student.eng + student.math;
		student.avg = student.sum / 3.0;
		student.name = "홍길동";
		
		System.out.println(student.name);
		System.out.println(student.avg);
		
	}

}


//클래스를 만들면 더 줄일수도있다!
// 이건 설계도야. 설계도를 바탕으로 물건을 만들지. 이 내용을 메모리에 올리는걸 객체 생성이라함. 혹은 인스턴스화. 
class Student{
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	String name;
	
	
	
}