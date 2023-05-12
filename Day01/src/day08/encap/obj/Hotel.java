package day08.encap.obj;

public class Hotel {
	
	//private chef chef =  new chef; // 초기화
//	private Chef Chef; 
	
	//생성자 안에서 chef 초기화
//	public Hotel () {
	//	this.Chef = new Chef();
//	}
	
	//chef의 게터 세터 자동완성 안쓰고 쓸줄 알아야함
	//객체를 매개변수로 받는 모형
//	public void setChef(Chef chef) { 
//		this.Chef = chef;
//	}
	
	//객체를 반환하는 모형
//	public Chef getChef() {
//		return Chef;
//	}
	
	
	private Chef chef;
	
	//호텔은 생성될때 외부에서 chef객체를 받는다.
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	//setter
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	//getter
	public Chef getChef() {
		return chef;
		
	}
	

}
