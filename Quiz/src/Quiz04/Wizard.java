package Quiz04;

public class Wizard extends Player {
 
	Wizard(String playerName) {
		name = playerName;
		hp = 50;
		mp = 100;
	}

	void iceArrow() {
		System.out.println(name + " 이/가 iceArrow를 사용합니다! 마나 20 감소");
		mp -= 20;
		info();
	}
	
}
