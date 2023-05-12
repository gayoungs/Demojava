package quiz01;

import java.util.Arrays;

public class MethodQuiz03 {

	public static void main(String[] args) {

		char[] arr = { 'a', 'b', 'c'};  //배열을 호출하고 싶으면 배열이 있어야함
		String result = method06(arr);
		System.out.println(result);
		
		int [] arr2 = {1,2,3,4,5};
		int result2 = method07 (arr2);
		System.out.println(result2);
		
		String[] arr3 =method08("가","나"); //호출
		System.out.println( Arrays.toString(arr3) );
		
		
		
	} //main
	static String method06 (char[]arr) {  //배열은 변수명으로 주고 받고 한다. ★
		
		String str = "";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
		}
		
		return str;
	}
	
	static int method07 (int[]arr) {
		
		int sum = 0;         
		for (int a : arr) { //향상된 for 문
			sum += a;
		}
		return sum;
	}
	
	static String[] method08 (String a, String b) {
			
		String [] arr = {a,b};
		
		return arr;  //배열 만들어서 변환해준다.
		
		//return new String[] {a,b};  <=이렇게도 해줄 수 있다!
	}
	
}
