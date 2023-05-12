package day05;

public class PenMain {
	
	public static void main(String[] args) {
		
		//펜을 사용하려면 객체로 생성해야합니다.
		pen red = new pen (); //변수명은 자유!! 생성이 된것, 객체를 만들었음
		
		red.ink = "빨강색";  // .뒤에는 참조연산자 
		red.price = 2000;
		red.company = "빨간펜";
		
		red.write(); 
		
		//검은색 펜도 만들고 싶다.
		pen black = new pen();
		black.ink = "검정색";
		black.price =1000;
		black.company="모나미";
		
		black.write();
	
		//빨간색 쓰고싶으면 red. 검정색 쓰고 싶으면 black.
		
		red.info();
		black.info();
		
	}
	

}
