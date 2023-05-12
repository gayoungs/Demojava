package Quiz11;

public class MainClass {
	
	public static void main(String[] args) {
		
		KeyBoard key = new KeyBoard();
		Mouse mouse = new Mouse();
		Monitor monitor = new Monitor();
		
		Computer com = new Computer(key, mouse, monitor);
		com.computerInfo();
		
		//get (모니터정보)
		Monitor m = com.getMonitor();
		m.info();
		
	
		
	}

}
