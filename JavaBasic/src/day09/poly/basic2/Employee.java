package day09.poly.basic2;

public class Employee extends Person {

	String department; // 부서

	// 생성자
	Employee(String name, int age, String department) {
		super(name, age);    // 밑에 3줄이랑 똑같은 의미, 단 두번 호출할 수는 없음
		//		super(); //생략되어있음
		//		this.name = name;
		//		this.age = age;
		this.department = department;
	}

	String info() {
		return super.info() + ", 부서:" + department;
	}

}
