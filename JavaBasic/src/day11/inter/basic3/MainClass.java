package day11.inter.basic3;

public class MainClass {
	
	public static void main(String[] args) {
		
		//Printed pt = new LG(); //LG기능 쓰기싫어!
		
		//Printed pt = new Samsung();
		
		LG pt = new LG(); // LG에 저장했을때
		
		
		pt.print("hello world");
		pt.colorPrint("hello world2", "파란색");
		int result = pt.copy(5);
	}

}
