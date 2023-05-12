package day08.encap.obj;

public class MainClass {
	
	public static void main(String[] args) {
		
//		Hotel h = new Hotel();
		
//			Chef c = h.getChef(); // Hotel안에 있는 chef를 꺼냄
//			c.cooking();
			
			//Chef를 생성해서 Hotel한테 전달
			//Chef cehf = new Chef();
//			h.setChef(new Chef());
			
//			Chef c = h.getChef(); //Hotel안에 있는 Chef를 꺼냄
//			c.cooking();

	Chef c = new Chef();
	//사용하는 곳 (생성하는 곳)
	Hotel h = new Hotel(c);
	
	Chef chef= h.getChef(); //반환유형
	chef.cooking(); //chef안에 들어있는 기능
	
	System.out.println(c == chef); //true
	
	
	
	}
	


}
