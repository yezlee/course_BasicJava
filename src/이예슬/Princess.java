package 이예슬;

import java.util.Random;

public class Princess {

	String name;

	int age = 15;
	int strength = 1; // 근력
	int intellect = 1; // 지력
	int grace = 1; // 기품
	int charm = 1; // 매력
	int ethicality = 1; // 도덕성
	int score;// 평가

	void info() {

		score = (strength + intellect + grace + charm + ethicality);
		System.out.println("-------------------------------");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("체력 : " + strength);
		System.out.println("지력  : " + intellect);
		System.out.println("기품  : " + grace);
		System.out.println("도덕성  : " + ethicality);
		System.out.println("재력 : " + money);
		System.out.println("총점  : " + score);
		System.out.println("-------------------------------");
		
		
	}

	int money = 100000;

	void logging() {

		Random random = new Random();
		Boolean[] logging = new Boolean[4];

		for (int i = 0; i < logging.length; i++) {
			logging[i] = random.nextBoolean();
			if (logging[i]) {
				System.out.println("나무장작을 열심히 패고있습니다.");
			} else
				System.out.println("도끼를 부려뜨렸습니다.");
		}

		if (logging[0]) {
			System.out.println();
			System.out.println("--- 하다가 힘들어서 도망갔습니다.");
			System.out.println();
			money -= 1000;
			strength += 1;
			age += 1;

		} else if (logging[1]) {
			System.out.println();
			System.out.println("--- 평범하게 일했습니다.");
			System.out.println();
			money += 2200;
			strength += 3;
			ethicality += 1;
			age += 1;

		} else if (logging[2]) {
			System.out.println();
			System.out.println("--- 도끼질에 소질을 보이며 많은 장작을 팼습니다.");
			System.out.println();
			money += 3800;
			strength += 5;
			ethicality += 1;
			age += 1;

		} else if (logging[3]) {
			System.out.println();
			System.out.println("--- 도끼가 부러졌습니다.");
			System.out.println();
			money += 660;
			strength += 2;
			age += 1;
		}
	}


	void maid() {
		Random random = new Random();
		Boolean[] maid = new Boolean[4];

		for (int i = 0; i < maid.length; i++) {
			maid[i] = random.nextBoolean();
			if (maid[i]) {
				System.out.println("왕궁 청소를 하고 있습니다.");
			} else
				System.out.println("청소를 잘 못하여 이모님한테 혼이 났습니다.");
		}

		if (maid[0]) {
			System.out.println();
			System.out.println("--- 공주님이 도망갔습니다.");
			System.out.println();
			money -= 1000;
			grace += 1;

		} else if (maid[1]) {
			System.out.println();
			System.out.println("--- 평범하게 일했습니다.");
			System.out.println();
			money += 2300;
			grace += 3;
			age += 1;

		} else if (maid[2]) {
			System.out.println();
			System.out.println("--- 열심히 왕궁을 청소하였습니다.");
			System.out.println();
			money += 4700;
			grace += 5;
			ethicality += 1;

		} else if (maid[3]) {
			System.out.println();
			System.out.println("--- 청소하다가 이모님이랑 싸웠습니다.");
			System.out.println();
			money += 800;
			grace += 2;
		}
	}

	void bar() {
		Random random = new Random();
		Boolean[] bar = new Boolean[4];

		for (int i = 0; i < bar.length; i++) {
			bar[i] = random.nextBoolean();

			if (bar[i]) {
				System.out.println("진상고객을 상대하고 있습니다.");
			} else
				System.out.println("서빙을 하고 있습니다.");
		}

		if (bar[0]) {
			System.out.println();
			System.out.println("--- 공주님이 도망갔습니다.");
			System.out.println();
			money -= 1000;
			grace -= 1;
			age += 1;

		} else if (bar[1]) {
			System.out.println();
			System.out.println("--- 평범하게 일했습니다.");
			System.out.println();
			money += 2000;
			grace -= 3;
			age += 1;

		} else if (bar[2]) {
			System.out.println();
			System.out.println("--- 많은 손님들이 몰려왔습니다.");
			System.out.println();
			money += 7000;
			grace -= 5;
			age += 1;

		} else if (bar[3]) {
			System.out.println();
			System.out.println("--- 진상 손님에게 한방 먹였습니다.");
			System.out.println();
			money += 700;
			grace -= 2;
			age += 1;
		}

	}

	void INN() {
		Random random = new Random();
		Boolean[] INN = new Boolean[4];
		for (int i = 0; i < INN.length; i++) {
			INN[i] = random.nextBoolean();

			if (INN[i]) {
				System.out.println("진상고객을 상대하고 있습니다.");
			} else
				System.out.println("청소를 하고 있습니다.");
		}

		if (INN[0]) {
			System.out.println();
			System.out.println("--- 공주님이 도망갔습니다.");
			System.out.println();
			money -= 1000;
			strength += 1;
			age += 1;

		} else if (INN[1]) {
			System.out.println();
			System.out.println("--- 평범하게 일했습니다.");
			System.out.println();
			money += 2000;
			strength += 3;
			age += 1;

		} else if (INN[2]) {
			System.out.println();
			System.out.println("--- 청소를 잘해서 여관에 손님이 늘었습니다.");
			System.out.println();
			money += 4000;
			strength += 5;
			age += 1;

		} else if (INN[3]) {
			System.out.println();
			System.out.println("--- 여관 주인에게 혼났습니다.");
			System.out.println();
			money += 700;
			strength += 2;
			age += 1;
		}

	}


	void weaponshop() {
		Random random = new Random();
		Boolean[] weaponshop = new Boolean[3];
		for (int i = 0; i < weaponshop.length; i++) {
			weaponshop[i] = random.nextBoolean();
			if (weaponshop[i]) {
				System.out.println("상품에 대해서 설명하고 있습니다.");
			}else
				System.out.println("상품 사용법을 보여주고 있습니다.");
		}

		if (weaponshop[0]) {
			System.out.println();
			System.out.println("--- 공주님이 도망갔습니다.");
			System.out.println();
			money -= 1000;
			strength += 1;
			age += 1;

		} else if (weaponshop[1]) {
			System.out.println();
			System.out.println("--- 평범하게 일했습니다.");
			System.out.println();
			money += 2000;
			strength += 3;
			age += 1;

		} else if (weaponshop[2]) {
			System.out.println();
			System.out.println("--- 매우 비싼 상품을 판매하였습니다.");
			System.out.println();
			money += 4000;
			strength += 5;
			age += 1;

		} 
	}

	void martial_arts() {
		Random random = new Random();
		Boolean[] martial_arts = new Boolean[3];
		for (int i = 0; i < martial_arts.length; i++) {
			martial_arts[i] = random.nextBoolean();
			if (martial_arts[i]) {
				System.out.println("검을 휘두르며 연습중 입니다.");
			}else
				System.out.println("방패로 막는 연습을 하고 있습니다.");
		}

		if (martial_arts[0]) {
			System.out.println();
			System.out.println("--- 초급 과정을 완수했습니다.");
			System.out.println();
			money -= 1000;
			strength += 1;
			age += 1;
			
		} else if (martial_arts[1]) {
			System.out.println();
			System.out.println("--- 중급 과정을 완수했습니다.");
			System.out.println();
			money -= 2000;
			strength += 3;
			age += 1;
			
		} else if (martial_arts[2]) {
			System.out.println();
			System.out.println("--- 고급 과정을 완수했습니다.");
			System.out.println();
			money -= 4000;
			strength += 5;
			age += 2;
		}
	}

	void study() {
		Random random = new Random();
		Boolean[] study = new Boolean[3];
		for (int i = 0; i < study.length; i++) {
			study[i] = random.nextBoolean();
			if (study[i]) {
				System.out.println("행정학을 배우고 있습니다.");
			}else
				System.out.println("경제학을 배우고 있습니다.");
		}

		if (study[0]) {
			System.out.println();
			System.out.println("--- 초급 과정을 완수했습니다.");
			System.out.println();
			money -= 1000;
			intellect += 1;
			age += 1;
			
		} else if (study[1]) {
			System.out.println();
			System.out.println("--- 중급 과정을 완수했습니다.");
			System.out.println();
			money -= 2000;
			intellect += 3;
			age += 1;
			
		} else if (study[2]) {
			System.out.println();
			System.out.println("--- 고급 과정을 완수했습니다.");
			System.out.println();
			money -= 4000;
			intellect += 5;
			age += 2;
		}
	}

	void Court_etiquette() {
		Random random = new Random();
		Boolean[] Court_etiquette = new Boolean[3];
		
		for (int i = 0; i < Court_etiquette.length; i++) {
			Court_etiquette[i] = random.nextBoolean();
			if (Court_etiquette[i]) {
				System.out.println("궁중 예법을 배우고 있습니다.");
			}else
				System.out.println("식사 예법을 배우고 있습니다.");
		}

		if (Court_etiquette[0]) {
			System.out.println();
			System.out.println("--- 초급 과정을 완수했습니다.");
			System.out.println();
			money -= 1000;
			grace += 1;
			ethicality += 1;
			age += 1;
			
		} else if (Court_etiquette[1]) {
			System.out.println();
			System.out.println("--- 중급 과정을 완수했습니다.");
			System.out.println();
			money -= 2000;
			grace += 3;
			ethicality += 3;
			age += 1;
			
		} else if (Court_etiquette[2]) {
			System.out.println();
			System.out.println("--- 고급 과정을 완수했습니다.");
			System.out.println();
			money -= 4000;
			grace += 5;
			ethicality += 5;
			age += 2;
		}
	}

	void ending() {
		if (score > 10) {
			System.out.println("GREAT! 공주는 여왕이 되었습니다.");
			System.exit(0);
		} else if (intellect >= 5) {
			System.out.println("GREAT! 열심히 교육을 마친 공주는 똑똑한 여왕이 되었습니다.");
			
		}else if (score >= 10 && money >= 15000) {
			System.out.println("GREAT! 경제관념이 뛰어난 공주는 부자 여왕이 되었습니다.");
		}
	}

	void Free_action() {
		Random random = new Random();
		Boolean[] Free_action = new Boolean[3];
		for (int i = 0; i < Free_action.length; i++) {
			Free_action[i] = random.nextBoolean();
			if (Free_action[i]) {
				System.out.println("쇼핑하러 가고 있습니다.");
			}else
				System.out.println("신나게 놀러 가고 있습니다.");
		}

		if (Free_action[0]) {
			System.out.println();
			System.out.println("--- 마켓에 도착해서 쇼핑을 했습니다.");
			System.out.println();
			money -= 1000;
			intellect += 1;
		} else if (Free_action[1]) {
			System.out.println();
			System.out.println("--- 놀이동산에 도착해서 재밌있게 놀았습니다.");
			System.out.println();
			money -= 2000;
			intellect += 3;

		} else if (Free_action[2]) {
			System.out.println();
			System.out.println("--- 루비반지를 구매했습니다.");
			System.out.println();
			money -= 4000;
			intellect += 5;			
			
		}
	}
}