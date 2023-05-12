package quiz01;

import java.util.Arrays;

public class Quiz21 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 1~9까지 숫자중 절대 중복 되지 않는 숫자 3개를 추출
		 *    Math.random() 을 사용하여,
		 *    arr를 랜덤하게 10번 섞어줍니다.
		 *    0~2번째 값을 새로운 배열로 옮겨 담아보세요.
		 */
		
	
		int[] arr = {1,2,3,4,5,6,7,8,9}; //1부터 9까지 배열
		
		for(int i = 1; i <=10; i++) {
			int a = (int)(Math.random() * 9);
			int b = (int)(Math.random() * 9);
			
			int temp = arr[a];
			arr[a] = arr [b];
			arr[b] = temp;
		}
		int[] newArr = new int[3];  //3개
		for(int i = 0; i < newArr.length; i++ ) {  //0,1,2까지
		    newArr[i] = arr[i]; //3개를 옮긴다.
			
		}
        System.out.println(Arrays.toString(newArr));
        
      /*
		int[] arr = {1,2,3,4,5,6,7,8,9}; //1부터 9까지 배열

		for(int i =0; i < 10; i++) {

			int randNum1 = (int) (Math.random() * 9);
			int randNum2 = (int) (Math.random() * 9);
			int temp = arr[randNum2];
			arr [randNum2] = arr[randNum1];
			arr[randNum1]= temp;
			System.out.println(Arrays.toString(arr));

		}

		int[] result = new int[3];

		for(int i=0; i< result.length; i++){
			result[i]=arr[i];

		}

		System.out.println(Arrays.toString(result));

	}*/
         
	}
	
	}



