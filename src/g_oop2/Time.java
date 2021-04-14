package g_oop2;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() { //변수값을 얻기위한 메소드
		return hour;
	}
	public void setHour(int hour) { // set은 변수값을 저장하기위한 메소드
		this.hour = hour;
	/*	if(0 <= hour && hour <= 23){						
		}else if(hour <= 0){
			System.out.println(0);
			}else{
				System.out.println(23);
			}	
		}			
	*/
		
		if (hour < 0) {
			this.hour = 0;
		} else if (23 < hour) {
			this.hour = 23;
		} else {
			this.hour = hour;
		}
		
		
		if (hour > 23){
			this.hour = 0;			
		}
		
	}
	
	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
				
/*		this.minute = minute;
		if (0 <= minute && minute <= 59) {
		} else if (minute <= 0) {
			System.out.println(0);
		} else {
			System.out.println(59);
		}
	}
*/
		if (minute < 0) {
			this.minute = 0;
		} else if (59 < minute) {
			this.minute = 59;
		} else {
			this.minute = minute;
		}
		
		
		if(minute > 59){
			this.minute = 0;
			//setHour(hour+1); 아래랑 같음. 그리고 이걸 위에 if문안에 넣어도 돼. 그럼 더 깔끔하겠지. 이프문 하나에 다 들어가니까.
			setHour(this.hour+1);
		}			
	}
	
	

	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
		
		if (second < 0) {
			this.second = 0;
		} else if (59 < second) {
			this.second = 59;
		} else {
			this.second = second;
		}
		
		
		if(second > 59){
			this.second = 0;
			setMinute(minute+1);
		}			
	}
	
	
	String getTime() {
		return hour + ":" + minute + ":" + second;
	}
	
	void clock(){
		while(true){
	//		System.out.println(getTime());
			stop(100); //스탑이라는 메소드도 만들어줘야해 
			setSecond(second + 1); //1초동안 멈춘후에 1초가 증가해야하니까
		}
	}
	

	
	
	private void stop(int i){ //이건 누가 알필요가 없어? 뭔말이지. 암튼 그래서 프라이빗 접근제한자 붙여주는거. 
								//아!! accessmodifier 클래스에서 이 메소드를 알이유가 없어서. 그래서 여기서만 보이게 하려고 !
		try {
			Thread.sleep(i); //파라미터로 넘겨진 시간만큼 스레드가 잠을 자는거야.
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // 컴터가 잠시동안 잠이 듭니다. 
	}
	
	
	
	
	
	
	
}
