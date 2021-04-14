package e_oop;

public class TV {
	
	// 티비에는 여러가지속성이 있는데 그걸 변수로 만들면됨
	// 채널, 음량, 전원, ... - 이 세가지 속성을 가지고 티비를 만들어 이걸 변수로 만들고
	// 이 변수를 조작할수 있는 메소드를 만들어
	// 이 메소드를 어떻게 만들지 생각해야겠지
	// 전원 버튼은 하나. 이걸로 키고 끌수있어 전원 메소드를 만들면돼
	// 채널은, 1- 채널 직접 입력. 숫자 입력. 2- 채널을 1씩 증가 시키는 법  3- 채널을 1씩 감소시키는  -> 이렇게 총 3개의 메소드
	// 볼륨은, 올리거나 내리거나 2개의 버튼. 2개의 메소드
	
	
	/*
	 * 과제. 임의의 사물을 대상으로 클래스를 만들어주세요.
	 * 사물이 가지고 있는 속성을 변수로 만들고,
	 * 변수와 관계된 동작들을 메서드로 만들어주시면 됩니다.
	 */
	
	
	boolean power;
	int channel;
	int volume;

	final int MIN_CHANNEL = 1;
	final int MAX_CHANNEL = 100;
	final int MIN_VOLUME = 0;
	final int MAX_VOLUME = 10;
	
	TV(){
		power = false;
		channel = 1;
		volume = 5;
	}
	
	void power(){
		power = !power;
		System.out.println(power ? "TV 켜짐" : "TV 꺼짐");
	}
	
	void chnnelInput(int channel){
		if(power){
			if(MIN_CHANNEL <= channel && channel <= MAX_CHANNEL){
				this.channel = channel;
			}
			System.out.println("채널. " + this.channel);
		}
	}	
	
	void channelUp(){
		channel++;  /*changeChannel(channel + 1);*/
	}
	
	void channelDown(){
		channel--; /*changeChannel(channel - 1);*/
	}
		
	void volumeUp(){
		if(power){
			if(volume < MAX_VOLUME){
				volume++;
			}
			showVolume();
		}
	}
	
	void volumeDown(){
		if(power){
			if(volume > MIN_VOLUME){
				volume--;
			}
			showVolume();
	}
}


	void showVolume(){

		System.out.print("음량. ");

		for(int i = MIN_VOLUME + 1; i <= MAX_VOLUME; i++){

			if(i <= volume){

				System.out.print("■");

			}else{

				System.out.print("□");

			}

		}

		System.out.println();

	}


	public static void main(String[] args) {

		TV tv = new TV();

		

		while(true){

			System.out.println("-------------------------------");

			System.out.println("1.전원  2.채널변경  3.채널업  4.채널다운");

			System.out.println("5.볼륨업  6.볼륨다운  0.종료");

			System.out.println("-------------------------------");

			System.out.print("번호 입력>");

			int input = ScanUtil.nextInt();

			

			switch (input) {

			case 1: tv.power(); break;

				

			case 2:

				System.out.print("변경할 채널 입력>");

				int ch = ScanUtil.nextInt();

				tv.chnnelInput(ch);

				break;

				

			case 3: tv.channelUp(); break;

			case 4: tv.channelDown(); break;

			case 5: tv.volumeUp(); break;

			case 6: tv.volumeDown(); break;

				

			default:

				System.out.println("종료되었습니다.");

				System.exit(0);

				break;

			}

		}

	}

	
	
	
	
}



