package Quiz09;

public class SuperSonicAp extends Airplane {

	/*
	 * 1. Airplane을 상속받습니다. 생성자는 이름을 받아서 초기화 하도록 생성하세요
	 * 2. flyMode int형 변수를 선언하세요
	 * 3. fly() 메서드를 오버라딩합니다
	 * 	  fly() 메서드 안에서는 flyMode가 1이라면 "고속 모드로 비행합니다" 출력
	 *          flyMode 0이라면, super를 통해 부모님의 메서드를 호출
	 * 4. info() 메서드는 이름을 비행기의 이름, 속도를 리턴하도록 생성하세요.
	 */

	int flyMode; //기본값이 0 이니까 값을 따로 안줘도됨 (초기화)

	SuperSonicAp(String name) {  //생성자
		super(name);   //부모님꺼를 빌려쓴다.
	}

	public void fly () {
		if(flyMode == 1) {
			System.out.println("고속 모드로 비행합니다.");
		}else {
			super.fly();     //부모님 기능 fly메서드 사용할 수 있음 (super.)
		}

	}

	String info () {    //비행기정보
		
		return "비행기 이름:" + name + "속도 :" + flyMode;
	}
}






