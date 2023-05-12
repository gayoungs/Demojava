package day11.inter.basic;

public interface Inter1 {
	//public static final이 자동으로 붙어서 상수취급
	int A = 10;  //초기값을 지정해주어야함!
	
	//메서드를 선언하면 자동으로 추상메서드가 됩니다.
	void method01();
	
	//인터페이스에는 static, default메서드 선언이 가능함
	public static void method3() {
		System.out.println("스태틱 메서드");
	}
	
	public default void method04() {
		System.out.println("디폴트 메서드");
	}
}
