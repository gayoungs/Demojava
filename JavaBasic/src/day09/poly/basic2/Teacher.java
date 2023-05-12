package day09.poly.basic2;

public class Teacher extends Person {

	String subject; // 과목

	// 생성자
	Teacher(String name, int age, String subject) {
		super(name, age);

		this.subject = subject;
	}

	String info() {
		//super.메소드() - 오버라이딩된 메소드에서 부모님의 원형 메소드가 필요할 때 사용
		return super.info()+"과목:" +subject;

	}

}