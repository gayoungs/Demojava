package day07.override01;

public class MainClass {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.method01(); //본인의메서드
		p.method02(); //본인의메서도
		
		child c = new child();
		c.method01(); //상속받은 메서드
		c.method02(); //오버라이드 된 메서드
	}

}
