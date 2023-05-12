package day10.static_.singleton;

public class MainClass {
	public static void main(String[] args) {
		
		// Singleton s = new Singleton();
		//일반적인 형식으로 만들어낼 수 없음.
	
	Singleton s = Singleton.getInstance();
	Singleton s1 = Singleton.getInstance();
	Singleton s2 = Singleton.getInstance();
	
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s2);
	
	
	System.out.println(s.getDomain());
	System.out.println(s1.getDomain());
	System.out.println(s2.getDomain());
	
	
	}

}
