package e_oop;

public class Audio {

	
	boolean power;
	double frequency;
	int volume;
	
	final double MIN_FREQUENCY = 87.1;
	final double MAX_FREQUENCY = 109.5;
	final int MIN_VOLUME = 0;
	final int MAX_VOLUME = 10;
	
	Audio(){
		power = false;
		frequency = 0.1;
		volume = 10;
	}
	
	void power(){
		power = !power;
		System.out.println(power ? "라디오 켜짐" : "라디오 꺼짐");
	}
	
	
	void chnnelInput(double frequency){
		if(power){
			if(MIN_FREQUENCY <= frequency && frequency <= MAX_FREQUENCY){
				this.frequency = frequency;
			}
			System.out.println("라디오 주파수. " + this.frequency);
		}
	}	
	
	
	void channelUp(){
		frequency++;
	}
	
	void channelDown(){
		frequency--;
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

		Audio audio = new Audio();

	
	
		while(true){

			System.out.println("┌──────────────────────────────┐");
			System.out.println("│                              │");

			System.out.println("1.전원  2.주파수변경  3.채널업  4.채널다운");

			System.out.println("    5.볼륨업  6.볼륨다운  0.종료");
			
			System.out.println("│                              │");
			System.out.println("└──────────────────────────────┘");

			System.out.print("원하는 서비스의 번호를 입력해주세요>");

			int input = ScanUtil.nextInt();

			

			switch (input) {

			case 1: audio.power(); break;

				

			case 2:

				System.out.print("변경할 주파수 입력>");

				double ch = ScanUtil.nextDouble();

				audio.chnnelInput(ch);

				break;

				

			case 3: audio.channelUp(); break;

			case 4: audio.channelDown(); break;

			case 5: audio.volumeUp(); break;

			case 6: audio.volumeDown(); break;

				

			default:

				System.out.println("종료되었습니다.");

				System.exit(0);

				break;

			}

		}

	}

	
	
	
	
	
	
	
	
	
	
	
}
