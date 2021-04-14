package f_game;

public class Main {

	public static void main(String[] args) {
		//클래스이름 클래스변수이름 = new 생성자
		Study st1 = new Study("김", 10, 30);
		Study st2 = new Study("이", 20, 10);
		//앞에 스터디는 클래스 이름이고, 뒤에 스터디는 생성자 이름

		System.out.println(st1.name+st1.a+st1.b);
		System.out.println(st2.name+st2.a+st2.b);
	}
}
