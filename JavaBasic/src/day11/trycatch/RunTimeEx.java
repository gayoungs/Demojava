package day11.trycatch;

public class RunTimeEx {
	
	public static void main(String[] args) {
		
		//실행 에러들
//		int[] arr = {1,2,3,4,5};	
//		System.out.println( arr[5]);   //중단
		
		//castException
//		String s = (String)new Object();
		
		//문자열 -> 숫자로 변경
		//NumberFormayException
//		String str = "10a"; //숫자로 변경할 수 없음.
//		int num = Integer.parseInt(str);  //문자열을 받아서 정수로 반환해주는 기능 
		
		//NullPointer
		
		String str = null;  //어떠한 객체 초기값 0인것이 null
		str.charAt(0); //문법적으로 틀리지 않았는데, null에 .을 찍으면 에러남! (값이 null)
		
		System.out.println(1111111);
		
	}

}
