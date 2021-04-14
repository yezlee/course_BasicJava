package g_oop2;

public class Starcraft {

	public static void main(String[] args) {
		Marine marine = new Marine();
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
		scv.repair(scv);
		
//		scv.repair(marine); // 리페어를 상속받지못한 마린은 컴파일 에러가 생긴다
	}

}

class Unit{
	int hp; // 현재 체력
	final int MAX_HP; //최대 체력 . 초기화를 안하면 컴파일 에러 뜸. 생성자를 통해서 초기화 해줄거야 아래
	
	Unit(int hp){
		MAX_HP = hp;
		this.hp = MAX_HP;
	}
}

class Marine extends Unit{ //컴파일 에러가 발생하지. 유닛안에 생성자에 파라미터가 있어서. 그걸 반드시 호출해줘야해 아래
	Marine(){
		super(40);
	}	
}

class Tank extends Unit implements Repairable{ //기계 유닛
	Tank(){
		super(150);
	}
}

class Dropship extends Unit implements Repairable{ //기계 유닛
	Dropship(){
		super(125);
	}
}

class SCV extends Unit implements Repairable{ //얘는 기계를 수리할수있어. 그래서 이 클래스 안에 수리하는 메소드를 만들거야
	SCV(){
		super(60);
	}
	
	void repair(Repairable r){ //기계들끼리 공통된 뭔가가 생겼으니까 이걸로 상속받은애만 들어오게 하는거지
		if(r instanceof Unit){ //Unit으로 형변환이 가능한지 확인
			Unit u = (Unit)r;
			
			while(u.hp < u.MAX_HP){
				u.hp++;
			}
		}
	}	
}


interface Repairable{ //두개는 기계라서 수리가 가능한데 마린은 아니야, 그래서 그 두개만 묶을 인터페이스를 만든거지. 기계유닛한테 상속을 받게해!
	
}










