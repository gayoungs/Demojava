package quiz01;

public class MethodQuiz02 {

	public static void main(String[] args) {

		String result = java(5);
		System.out.println(result);
	}
	static String java (int a) {  //소괄호안에 매개변수까지 반복문 돌아야함

		String str = "";
		for(int i = 1; i <= a; i++) { 

			if(i % 2 == 0) {   //짝수일때
				str += "자";
			} else {			//홀수일때
				str += "바";
			}
		}
		return str;
	}
}
