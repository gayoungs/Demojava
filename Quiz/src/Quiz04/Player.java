package Quiz04;

public class Player {
 	//Player클래스로 상속관계를 만들어 주세요
	//마법사는 생성될 때 ★이름만 매개변수로 받고, hp = 50, mp = 100이 됩니다.
	//마법사는 강력한 iceArrow()를 가지고 있습니다
	//iceArrow()는 호출될떄마다 mp를 -20씩 감소시킵니다
	String name;
	int hp;
	int mp;
	
	void info() {
		System.out.println("케릭명:" + name);
		System.out.println("hp:" + hp);
		System.out.println("mp:" + mp);
	}
	}

  /*//Player클래스로 상속관계를 만들어 주세요
	//전사는 생성될 때 ★이름만 매개변수로 받고, hp = 100, mp = 50이 됩니다.
	//전사는 강력한 bash()를 가지고 있습니다
	//bash()는 호출될떄마다 mp를 -10씩 감소시킵니다
	String name;
	int hp;
	int mp;
	
	void info() {
		System.out.println("케릭명:" + name);
		System.out.println("hp:" + hp);
		System.out.println("mp:" + mp);
	}
}*/