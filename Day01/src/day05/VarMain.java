package day05;

public class VarMain {
	
	public static void main(String[] args) {
		
		Variable var = new Variable(); //객체생성
		
		var.a = 100; //외부에서 값 변경가능
		var.b = "바꿔볼테야";
		
		var.printNum(10); 
		
	}

}
