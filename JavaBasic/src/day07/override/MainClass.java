package day07.override;

public class MainClass {
	
	public static void main(String[] args) {
		
		student s = new student();
		s.age = 20;
		s.name = "홍길동";
		s.studentId = "123123";
		System.out.println(s.info()); //오버라이딩
		
		teacher t = new teacher();
		t.age = 30;
		t.name ="이순신";
		t.subject ="수학";
		System.out.println(t.info()); //오버라이딩
		
		Employee e = new Employee();
		e.age = 40;
		e.name = "홍길자";
		e.department = "회계뿌";
		System.out.println(e.info()); //오버라이딩
	}

}
