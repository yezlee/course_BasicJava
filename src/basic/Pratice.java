package basic;

public class Pratice {

	public static void main(String[] args) {
		
		Pratice pr = new Pratice();
		pr.multi(2);
		
		pr.sort(50, 30);
		
		int result = pr.oddSum(40);
		System.out.println(result);
	
	}
	
	
	public void multi(int a){
		System.out.println(a + "단");
		for(int i = 0; i <= 9; i++){
			System.out.println(a + "*" + i + "=" + i * a);
		}
	}
	
	
	public void sort(int a, int b){
		if(a > b){
			System.out.println("큰값 : " + a + " 작은값 : " + b);
		}else if(a < b){
			System.out.println("큰값 : " + b + " 작은값 : " + a);
		}else{
			System.out.println(a + ", " + b + "는 같다." );
		}
	}
	
	
	public int oddSum(int a){
		
		int sum = 0;
		for (int i = 1; i <= a; i++){
			if(i % 2 == 1){
				sum += i;
			}
		}return sum;
	}
	
	
	public int sumNum(int a, int b){
		
		int sum = 0;
		int min; 
		int max;
		
		if(a > b){
			max = a;
			min = b;			
		}else{
			max = b;
			min = a;
		}
		
		for(int i = min; i <= max; i++){
			sum += i;
		}return sum;
	}
	
	
	
}
