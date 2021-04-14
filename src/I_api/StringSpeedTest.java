package I_api;

public class StringSpeedTest {

	public static void main(String[] args) {
/*		String str = "a";
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < 200000; i++){
			str += "a";
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
	
	//꽤 느려짐. 그래서 스트링을 바꾸고 싶으면 이렇게 하면 안되고 string buffer를 사용해야돼.
*/
	
		StringBuffer sb = new StringBuffer("a");
		long start = System.currentTimeMillis();
		for(int i = 0; i < 200000; i++){
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
		
		//에 주석처리한건 8초 걸렸는데 string buffer 사용하면 0.01초 밖에 안걸려.
		
	}
}

