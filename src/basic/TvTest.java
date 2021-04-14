package basic;

public class TvTest {

	public static void main(String[] args) {
		
		Tv t = new Tv(); // 이게 제품을 만드는거야.
		
		System.out.println("1. test = " + t.test);
		System.out.println("1. test = " + Tv.test);

		System.out.println("변경전 channel  : " + t.channel);
		System.out.println("변경전 power  : " + t.power);
		System.out.println("변경전 color : " + t.color);
				
		t.channel = 15;
		
		System.out.println("변경후  : " + t.channel);
		
		
		Tv t2 = new Tv();
		t2.channel = 100;
		System.out.println("2. test = " + t.test);
		
		t.ChannelUp();
		System.out.println("up 호출 후  : " + t.channel);
	}

}
