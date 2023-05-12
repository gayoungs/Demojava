package day06.inherit.good;

public class MainClass {
	
	public static void main(String[] args) {
		
		student s = new student();
		s.age = 20;
		s.name = "홍길동";
		s.studentId = "123123";
		System.out.println(s.info());
		
		teacher t = new teacher();
		t.age = 30;
		t.name ="이순신";
		t.subject ="수학";
		System.out.println(t.info());
	}

}
