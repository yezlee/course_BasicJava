package g_oop2;

public class Store { 

	public static void main(String[] args) {  //메인메소드는 퍼블릭 클래스 안에 있고, 그건 한번만 실행. 
		//자바라는 프로그램을 실행하는데 Store라는 퍼블릭클래스가 처음에 사용되면 제일 먼저 메인메소드를 실행함. 그게 시작점. 
		
		//클래스를 만들건데 모든 물건이 이름도있고 가격도 있어 이런 공통적인걸 부모클래스로 만들고
		//그안에 물건들을 자식클래스로 만들고 물건을 구매할 손님도 만들고

		//객체 생성을 해보자
		Desktop d1 = new Desktop("삼성 컴퓨터", 100000);
		Desktop d2 = new Desktop("LG 컴퓨터", 100000);
		
		Aircon ac1 = new Aircon("삼성 에어컨", 200000);
		Aircon ac2 = new Aircon("LG 에어컨", 200000);
		
		TV tv1 = new TV("삼성 TV", 300000);
		TV tv2 = new TV("LG TV", 300000);
		
		Customer c = new Customer();
		
		System.out.println(d1.getInfo());
		System.out.println(d2.getInfo());
		c.buy(d1); //buy는 프로덕트타입. d1은 데시크탑 타입의 변수를 넘기고 있어 그 둘은 자식에서 부모로의 형변환이라 생략가능한거
		//원래는 c.buy((Product)d1);
		
		System.out.println(ac1.getInfo());
		System.out.println(ac2.getInfo());
		c.buy(ac2);
		
		System.out.println(tv1.getInfo());
		System.out.println(tv2.getInfo());
		c.buy(tv2);
		
		c.showItem();
		
		
		//이게 다형성을 사용하는 이유.
	}

}





class Product{  //부모클래스로 공통적인걸 만들고
	String name;
	int price;
	
	//이름들이 다르니까 생성자를 통해서 이름과 가격을 파라미터로 초기화할거야
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	//상품의 정보를 반환하는 메서드
	String getInfo(){
		return name + "(" + price + "원)";
	}	
}


//상품들을 만들어보자
class Desktop extends Product{ //파라미터가 있으면 호출을 못해서 직접 생성자를 만들어줘야해
	
	Desktop(String name, int price){  //나 : 데스크탑이라는 생성자를 만들어주는거지. 상속할때 생성자는 못갖고 오니까. 자식의 생성자를 만들어서 안에 수퍼를 해주면 부모클래서의 생성자를 호출해줌.  
		super(name, price);
	}//생성자를 만들어줌
	
	void programming(){
		System.out.println("프로그램을 만듭니다.");
	}	
}


//또하나의 클래스를 만들어보자
class Aircon extends Product{
	
	Aircon(String name, int price){
		super(name, price);
	}
	
	void setTemperature(){
		System.out.println("온도를 설정합니다.");
	}
}


class TV extends Product{
	
	TV(String name, int price){
		super(name, price);
	}
	
	void setChannel(){
		System.out.println("채널을 변경합니다.");
	}
}




//3개의 물건을 클래스로 만듦. 손님도 클래스로 만들어보자

class Customer{
	
	int money = 10000000;
	//내가 구매한 물건을 저장할 변수를 만들어보자
	Product[] item = new Product[100]; // 여러개니까 배열로 만들자 
	//프로덕트는 그냥 부모클래스 안에 있는 타입을 가져다 쓰는거라서 앞이나 뒤나 안붙여도 되고 임포트도 안해와도 돼. 같은 패키지안에 있으니깐.
	
	void buy(Product p){ //손님이 구매하는 메소드
	//어떤 물건을 구매하냐 정보. 정보는 파라미터로 받으면 된다. 파라미터의 타입은, 물건 3개를 다 저장할수있는 프로덕트 타입으로 만들어야지
		if(money < p.price){
			System.out.println("잔돈(내가 가진돈이)이 부족하다.");
			return;
		}
		
		money -= p.price;
		
		for(int i = 0; i < item.length; i++){
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}
		System.out.println(p.getInfo() + "를 구매했다.");
	}
	
	
	//내가 가지고 있는 물건들에 대한 목록들을 메소드로 만들어보자
	void showItem(){
		System.out.println("============= 아이템목록 =============");
		for(int i = 0; i < item.length; i++){
			if(item[i] == null){
				break;
			}else{
			System.out.println(item[i].getInfo());
			}
		}
		System.out.println("===================================");
	}
	
	
	
}
















