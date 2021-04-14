package e_oop;

public class Calculator {
	
	//두개의 파라미터를 가지고 있고 연산을 해서 리턴을 해주는것
	//두개의 파라미터를 받아서 더해서 리턴해주는것
	//이렇게 총 5개의 메소드를 만들면 된다.
	
				
	double sum(double a, double b){
		return a + b;
	}	
	
	double minus(double a, double b){
		return a - b;
	}	
	
	double multi(double a, double b){
		return a * b;
	}
	
	double devide(double a, double b){
		return a / b;
	}
	
	double rest(double a, double b){
		return a % b;
	}
	
}
