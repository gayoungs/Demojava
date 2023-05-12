package Day03;

import java.util.Arrays;

public class ArraysSort2 {
	
	public static void main(String[] args) {
	
		//버블정렬 - 가장느림 (큰 값을 뒤로 보낸다) ,바로 붙어있는 다음 값
		
		int[] arr = {5, 23, 1, 43, 200, 100, 40};
		
		//5, 1, 23, 43, 100, 40, 200 // 1회전
		//1, 5, 23, 43, 40, 100, 200 // 2회전
		//1, 5, 23, 40, 43, 100, 200 // 3회전 - 정렬 완성
		
		//바깥 반복문은 회전수
		//안쪽 반복문이 ?
		for(int i = 0; i < arr.length-1; i++) { 
			for(int j = 0; j < arr.length-i-1; j++) {
				System.out.println(i + "-" + j);
				if(arr[j] > arr[j+1]) { //j가 j+1번째보다 크면 자리를 바꾼다.
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =temp;	
				}	
			}
		}
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr); 
		System.out.println(Arrays.toString(arr));
	
	}
}
