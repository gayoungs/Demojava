package quiz01;

public class MethodQuiz01 {

	public static void main(String[] args) {

		method01(); //

		String r1 = method02("가");
		//String r2 = scan.next(); 문자열을 받아서 문자열에 저장
		System.out.println(r1);

		double r2 = method03 (1, 2, 3.0);
		System.out.println(r2);

		String r3 = method04(3);
		System.out.println(r3);

		method05("나",3);

		int r4 = maxNum(1, 2);
		System.out.println(r4);

		int r5 = abs(-5);
		System.out.println(r5);

	} //main


	//1."안녕"출력
	static void method01() {
		System.out.println("안녕하세요");
	}
	//2."전달 받은 매개 변수 리턴"
	static String method02(String s) {
		return s;
	}
	//3."세 매개변수 합 리턴"
	static double method03 (int a, int b, double c) {
		return a + b + c;
	} 

	//4."매개 변수가 짝수면 "짝수", 홀수라면 "홀수" 리턴
	static String method04(int a) {
		/*
			String str = "";
			if(a % 2 ==0) { //짝수
				str = "짝수";
			} else { //홀수
				str = "홀수";
		}
			return str;
		 */
		/*
			if(a % 2 ==0) { //짝수
				return "짝수";   //특정조건하에 return 값을 다르게 각각 줄 수 있다.
			} else { //홀수
				return = "홀수";
			}
		 */

		return a % 2 == 0 ? "짝수" : "홀수" ;  //if else 구문 = 3항연산식같은의미
	}	
	//5."매개 변수 int만큼 String 반복 출력"
	static String method05(String a,int b) {

		for(int i = 1; i <= b; i++) {
			System.out.println(a);
		}
		return a;
	}
	//6."매개 변수 2개를 입력받아 큰 수 리턴"
	static int maxNum(int a, int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}

	}
	//7."절대값 리턴"
	static int abs(int a) {
		return a > 0 ? a : -a;

	}

}




