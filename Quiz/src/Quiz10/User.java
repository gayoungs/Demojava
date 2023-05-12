package Quiz10;

public class User {
	
	private String name;
	private int rrn;
	private int age;
	
	//기본생성자(ctrl+space)
	public User(){
	}
	
	//생성자
	public User (String name, int rrn, int age) {
		
		super();
		this.name = name;
		this.rrn = rrn;
		this.age = age;	
	}
	
	public void info() {
		System.out.println("이름"+name);
		System.out.println("rrn"+rrn);
		System.out.println("나이"+age);
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRrn(int rrn) {
		this.rrn = rrn;
	}
	
	public int getRrn() {
		return rrn;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
}

