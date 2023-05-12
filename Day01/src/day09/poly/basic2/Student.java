package day09.poly.basic2;

public class Student extends Person {

	String studentId; // 학번

	// 생성자
	Student(String name, int age, String studentId) {
		// 어차피 부모님꺼를 빌려쓰는것이기 때문에 부모님 생성자를 끌어옴
		super(name, age);

		this.studentId = studentId;
	}


	String info() {

		return super.info() + ", 학번:" + studentId;
	}

}