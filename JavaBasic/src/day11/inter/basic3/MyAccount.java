package day11.inter.basic3;

public class MyAccount extends Account implements Calculator {
	
	//객체들이 모두 동일한 값을 갖는다
	//static은 클래스.변수명 으로 바로 호출 가능 (이 경우에는 private이라 getter로)
	private static String bankName = "우리은행";  //객체들이 모두 동일한 값을 받는다.
	
	//final은 절대 못바꾸는 값(값의 변경의 금지) 
	//static 1개만 생성한다.
	
	//생성자는 여러개가 가능하다 	
	MyAccount() {}
	
	MyAccount(String name) {
		super(name);
	}
	
	//오버라이드
	public void method01() {
		System.out.println("자식 클래스에서 오버라이드");
	}
	
	public void method02() {
		System.out.println("추상클래스에서 받은 추상 메서드 오버라이딩");
	}
	
	
	//오버로딩 (동일한 메서드를 여러개 만듦 - 매개변수 값만 변화)
	public void info(String name) {
		System.out.println("parameter를 name만 받음");
	}
	
	public void info(String name, String ssn) {
		System.out.println("parameter를 name, ssn 받음");
	}
	
	@Override
	public void add(int a) {
		
	}
	
	@Override
	public void sub(int a) {
		
	}
	
	public static String getBankName() {
		return bankName;
	}

}
