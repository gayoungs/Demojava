package Quiz04;

public class Warrior extends Player {

		Warrior(String playerName) {
			name = playerName;
			hp = 100;
			mp = 50;
		}
		
		void bash() {
			System.out.println(name + " 이/가 bash를 사용합니다! 마나 10 감소");
			mp -= 10;
			info();
		}


	}

