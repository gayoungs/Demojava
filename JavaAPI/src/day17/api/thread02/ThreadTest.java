package day17.api.thread02;

public class ThreadTest implements Runnable {

	
	private int num = 0;
	
	@Override
	public synchronized void run() {

		for(int i = 1; i <= 10; i++) {
			
			
			num++;
			System.out.println("===================================");
			System.out.println( "쓰레드명:" + Thread.currentThread().getName()); 
			//현재쓰레드 반환해서 겟네임함수써서 쓰레드명 갖고올거야
			System.out.println(num); 
			
			try {
				Thread.sleep(1000); //1초
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	

}
