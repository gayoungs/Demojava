package Quiz02;

public class Tv {

	String company = "LG"; //회사
	int channel; //채널
	boolean power; //전원
	
	/* 생성자X
	 * 메서드 
	 * changeChannel :int - 매개변수 채널번을 받아서 채널을 변경, 변경된채널을 리턴
	 * power : void - 켜져있으면 꺼지고, 꺼져있으면 켜지고 동작될 수 있도록
	 */
	
	
	int changeChannel(int num) {
	channel=num;
	System.out.println("채널변경:" + channel);
	return channel;
	
	}
	
	void power() {
	       if(power == true) {
	           power = false;
	           System.out.println("TV Off");
	       } else {
	           power = true;
			System.out.println("TV On");
		}
	}
	
	
}
