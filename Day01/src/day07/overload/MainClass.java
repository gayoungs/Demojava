package day07.overload;

public class MainClass {
	
	public static void main(String[] args) {
		
		Basic b = new Basic (); //input 메서드를 사용하려면 Basic사용
		b.input(1);
		b.input("문자열");
		b.input(3,3.14);
		b.input(3.14, 3);
		
		
	}

}
