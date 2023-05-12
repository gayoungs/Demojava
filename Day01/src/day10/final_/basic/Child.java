package day10.final_.basic;

public class Child extends Parent{
	
	//final 클래스 - 상속금지
	//final 메서드 - 오버라이드 금지
	
	//overide
	public void method01() {
		this.method02(); // 상속만 안됨 오버라이드하는데 지장은 없음
	}
	
	//public void method02() {} //오버라이드 안됨~~~~~

}
