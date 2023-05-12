package day09.poly.basic2;

public class House {
	/*
	private Student[] student = new Student[100];
	//private String str = " 홍길동 " >> String타입변수
	private Employee[] employee = new Employee[100];
	private Teacher[] teacher = new Teacher[100];
	private int index1;
	private int index2;
	private int index3;
	
	public void inHouse(Student s) {
	student[index1] = s;
	index1++;
} 
	public void inHouse(Teacher t) {
		student[index2] = t;
		index2++;
	}
	public void inHouse(Employee e) {
		student[index3] = e;
		index3++;
	}*/
	
	private Person[] person = new Person[100];
	private int index;
	
	public void inHouse(Person p) {
		person[index] = p;
		index++;	
	}
	
	public void whoAreYou(Person p) {
	
		if(p instanceof Student) { //student -> true
			System.out.println("너는 학생이야!");
			Student s = (Student)p;
		} else if (p instanceof Teacher) {
			System.out.println("나는 선생이야!");
		} else if (p instanceof Employee) {
			System.out.println("너는 직원이야!");
		} else {
			System.out.println("너는 그냥 사람이야");
		}
	}
	
}








