package day04;

public class MethodEx02 {

	public static  void main(String[] args) {

		/*
		 * 매개변수(parameter)
		 * 메서드가 전달받는 매개값 
		 * 여러개 받을 수도 있고, 받지 않을 수도 있습니다.
		 */
	 
		int result = calSum(10);
		System.out.println("결과:" + result);
		
		int result2 = calSum(100);
		System.out.println("결과" + result2);
		
		int result3 = calSum2(1, 2);  //35번에 매개변수 2개면 여기 값도 2개 넣으면 된다.
		System.out.println("결과" + result3);
		
		String result4 = calSum3(5, "가");
		System.out.println("결과:" + result4);
	} //main 끝

	// 1부터 매개 변수까지의 합계
	static int calSum(int a) {   //(소괄호)안에 매개변수 (선언문 타입포함입력)

		int sum = 0;  
		for(int i = 1; i <= a; i++) {
			sum += i;

		}

		return sum; 
	}

  	// 매개변수를 2개받음 , 컴마로 나열하면 된다. 매개변수 제한없이 계속 나열가능
		static int calSum2(int a, int b) {
		 int result = a + b;
		 return result;        //returen a + b;와 같다.
		
	}
	
	//간단한 실습 - 정수, 문자열을 전달받는 String calSum3() 생성
	static String calSum3(int a, String s) {
		
		String str = "";
		for(int i = 1; i <=a; i++) {
			str += s;
		}
		return str;
	} 
		
}
