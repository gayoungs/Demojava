package day08.super_;

public class Parent {

	//변수 2개 생성
	String mother;  
	String father;

	//아무것도 안만들어도 기본생성자 생략 (만들어져 있음)
//	parent() {
//		super();
//	}
	
	Parent(String mother, String father) {
		this.mother = mother;
		this.father = father;
	}
	String info() {
		return "name:" + mother + ", name:" + father;
	}
	
}
