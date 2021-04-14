package f_game;

public class Character {
	
	//클래스를 만들고 이 클래스에는 어떤 속성을 갖을까.
	//캐릭터엔 이름이 있지.
	
	  String name;   //이름
	  int maxHp;     //최대체력
	  int hp;		 //체력 - 최대체력, 현재체력
	  int maxMp;     //최대마나
	  int mp; 		 //마나
	  int att;       //공격력
	  int def;		 //방어력
	  int exp;		 //경험치
	  int level;     //레벨
	  Item[] items;  //보유 아이템
	  
	  // 생성자는 클래스 이름과 동일한 이름을 갖지.
	  Character(String name, int hp, int mp, int att, int def){
		  this.name = name;
		  this.maxHp = hp;
		  this.maxMp = mp;
		  this.hp = this.maxHp;
		  this.mp = this.maxMp;
		  this.att = att;
		  this.def = def;
		  this.level = 1;
		  this.exp = 0;
		  this.items = new Item[10];
	  } 
	  
	  void showInfo(){		  
		  System.out.println("==========================================");
		  System.out.println("------------------ 상태 -------------------");
		  System.out.println("이름 : " + name);
		  System.out.println("레벨 : " + level + "(" + exp + "/100)");
		  System.out.println("체력 : " + maxHp);
		  System.out.println("마나 : " + maxMp);
		  System.out.println("공격 : " + att);
		  System.out.println("방어 : " + def);
		  System.out.println("------------------ 아이템 -------------------");
		  
		  for(int i = 0; i < items.length; i++){
			  if(items[i] != null){
				  System.out.println(items[i].itemInfo());
			  }
		  }
		  System.out.println("==========================================");
		  
	  }
	  
	  void attack(Monster m){
		  int damage = att - m.def;
		  damage = damage <= 0 ? 1 : damage; //-가 나오면 안되니까
		  m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage; // -200이 되면 안되서??????
		  System.out.println(name + "가 공격으로" + m.name + "에게" + damage + "만큼 데미지를 주었습니다.");
		  System.out.println(m.name + "의 남은 HP : " + m.hp);		  
	  }
	  
	  void getExp(int exp){
		  System.out.println(exp + "의 경험치를 획득하였습니다.");
		  this.exp += exp;
		  while(100 <= this.exp){
			  levelUp();
			  this.exp -= 100;
		  }
	  }
	  
	  
	  void levelUp(){
		  level++;
		  maxHp += 10;
		  maxMp += 5;
		  att += 2;
		  def += 2;
		  hp = maxHp;
		  mp = maxMp;
		  System.out.println("LEVEL UP!!");		  
	  }
	  
	  void getItem(Item item){
		  System.out.println(item.name + "을 획득하였습니다.");
		  for(int i = 0; i < items.length; i++){
			  if(items[i] == null){
				  items[i] = item;
				  break;
			  }
		  }
		  maxHp += item.hp;
		  maxMp += item.mp;
		  att += item.att;
		  def += item.def;
	  }
	  
	  
	
}
