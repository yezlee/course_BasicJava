package f_game;

import e_oop.ScanUtil;

public class MyGame {

	//등장인물들
	Character c;
	Item[] items;
	
	MyGame(){
		c = new Character("가렌", 100, 50, 20, 10);
		
		items = new Item[10];
		items[0] = new Item("무한의 대검", 0, 0, 10, 0);
		items[1] = new Item("가시갑옷", 0, 0, 0, 10);			
	}
	
	
	public static void main(String[] args) {
		/*
		 * 게임을 만들어보자, 게임에는 캐릭터 아이템 몬스터 등등 여러가지 객체들이 등장. 그걸 클래스로 만들어보기 좋다.
		 * RPG게임을 만들어보자
		 */
		new MyGame().start();
	}
	
	void start(){
		int input = 0;
		while(true){
			System.out.println("1.내정보\t2.사냥\t3.종료");
			input = ScanUtil.nextInt();
			
			switch(input){
			case 1:
				c.showInfo();
				break;
				
			case 2: //사냥을 하는건데 케이스안에 하면 내용이 길어져서 메소드 만들어줄게
				hunt();
				break;
				
			case 3: //종료
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;			
			}
		}		
	}
	
	void hunt(){
		Monster m = new Monster("고블린", 20, 10, 15, 10, new Item[]{items[0], items[1]});
		System.out.println(m.name + "를 만났습니다. 전투를 시작합니다.");
		
		int input = 0;
		battle : while(true){
			System.out.println("1.공격\t2.도망");
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				c.attack(m); //캐릭터가 몬스터 공격한거
				if(m.hp <= 0){
					System.out.println(m.name + "을 처치하였습니다.");
					c.getExp(150);
					c.getItem(m.itemDrop());
					break battle;
				}
				m.attack(c);
				break; //한번씩 공격 주고 받으면 우선 끝
				
			case 2: 
				break battle; //도망가는 케이스
			}
		}
	}
	
	
	
	
	
}
