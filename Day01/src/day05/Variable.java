package day05;

public class Variable {
	
	//int a;  선언
	//a = 10;여기서 초보자들이 많이하는 실수  클래스바로아래는 선언만 가능 이런문법은 존재하지 않음, 
	
	int a = 1; // 멤버변수 이거는 가능함! 선언과 동시에 초기화는 가능함
	String b;  //멤버변수
	
	void printNum(int d) {   //printNum 메서드 (매개변수) 소괄호안에 있는건 지역변수이면서 매개변수
		
		int c = 1; //지역변수
		
		System.out.println("멤버변수:" + a);
		System.out.println("멤버변수" + b);
		System.out.println("지역변수:" + c);
		System.out.println("지역변수(매개변수):" + d); //예외적으로 꼭 전달을 하게되니까 초기값 없어도 사용가능
		
	}

}
