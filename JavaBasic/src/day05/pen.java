package day05;

//설계도로 사용할 클래스를 메인이 없습니다.
public class pen {
	
	//클래스 속성(값저장)을 나타낼때 멤버변수(field) 라고 합니다.
	int price;      //가격
	String ink;     //색상
	String company; //제조사

	//클래스 안에 기능을 나타낼때 메서드라고 부릅니다. (static빼고!)
	void write() {                             //매개변수 없고
		System.out.println(ink + "색상 글씨를 씁니다");
	}
	void info() {
		System.out.println("======펜의 정보======");
		System.out.println("가격" + price);
		System.out.println("색상" + ink);
		System.out.println("제조사:" + company);
	}

}
