package Day03;

import java.util.Arrays;

public class ArrayBasic {
	
	public static void main(String[] args) {
		
		//배열
		int[] arr;
		
		//배열의 생성
		arr = new int[5];
			//변수에 5개짜리 상자를 만들어서 변수에 저장할게
		//배열의 초기화
	   // arr[인덱스번호]
	    arr[0] = 10;
	    arr[1] = 20;
	    arr[2] = 30;
	    arr[3] = 40;
	    arr[4] = 50;
	    
	    //배열의 모형
	     System.out.println(arr); //주소값 (배열의 실제 생성된 위치)
	    //배열의 모형을 문자열로 출력
	    System.out.println(Arrays.toString(arr));
	    
	    //배열의 값의 변경
	    arr[2] =100;
	    System.out.println(Arrays.toString(arr));
	    
	    //배열의 길이
	    System.out.println( "배열의길이:"+arr.length );
	    
	    //배열을 선언하는 다양한 방법
	    int[] arr2 = new int[3];
	    
	    //2nd
	    int [] arr3 = new int[] {1,2,3}; 
	    
	    //3nd
	    int [] arr4 = {1,2,3};
	    
	    //배열은 초기값을 지정하지 않으면 기본값으로 자동초기화
	    //int는 0, double은 = 0.0, String = null (null은 아무것도없다.)
	    System.out.println(Arrays.toString(arr2));
	    
	
	}

}
