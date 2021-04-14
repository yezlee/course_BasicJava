package basic;

// class는 객체의 설계도라고 생각할 수 있다.
// class에는 멤버변수를 선언하고 메서드들을 구현해 놓는다.
public class Tv {
	static int test;
	int num;
    //멤버변수선언
	String color;  //티비색상  - 초기화 상태 null
	boolean power; //전원상태 - 초기화 false
	int channel;   //채널 - 초기화 0
	
	
	//생성자 - 메소드인데 반환값이 아예 없어. 그렇다고 보이드를 쓰는건 아냐 그냥 표현자체를 안해
	//클래스명이랑 메소드 명이랑 같어
	//==> 반환값자료형이 없고, 메소드 이름이 class 이름과 같다.
	public Tv(){
		channel = 6;
		test++;
		num++;
	}
	
	
	
	//메서드 선언 및 구현
	
	//전원 of/off기능 ==> 전원 상태를 현재의 반대 상태가 되게 한다.
	//구현할때 이게 어떤 기능을 해야하지? 라고 생각을 하고 위처럼. 그 후에 만드는것.
	public void powerOnOff(){
	/*	if(power == true){  
			power = false; // 초기값이 false니까
		}else{
			power = true;
		}*/
		
		power = !power;  // 위에 값을 한줄로 표현한게 이거임. 서로의 반대값을 넣어주니까	
	}
	
	public void  ChannelUp(){ //채널을 올린다. 
		int temp = 1;
		channel+= temp;
	}
	
	public void channelDown(){ //채널을 내린다.
		int tmp = 2;
		channel-= tmp;
	}
	
}
