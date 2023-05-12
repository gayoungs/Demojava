package day06.import_ex;

//import day06.fruit.Apple; //패키지명을 포함한 클래스명
//import day06.fruit.Melon;
import day06.fruit.*;

public class MainClass {
	
	public static void main(String[] args) {
		
		Apple app = new Apple();
		Melon melon = new Melon();
		
		int a = 1;
		System.out.println(melon);
		System.out.println(app);
		
	}

}
