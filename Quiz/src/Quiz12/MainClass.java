package Quiz12;

public class MainClass {
	
	public static void main(String[] args) {
		
		Radio r = new Radio(); //300, sony
		Computer c = new Computer();
		Tv t = new Tv();
		
		//System.out.println(r.getPrice());
		
		//System.out.println(r.getName());
		
		//카트
		Mycart cart = new Mycart(10000);
		cart.buy(t);
		cart.buy(c);
		cart.buy(t);
		
		cart.info();
		
		

	}

}
