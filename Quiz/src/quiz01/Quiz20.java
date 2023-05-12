package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
	/*백준 10818번 문제
		N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

		입력
		첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
             5
             20 10 35 30 7
		출력
		첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
	*/
		
		Scanner scan = new Scanner (System.in);
		
		int a = scan.nextInt(); //크기가 a인 배열을 먼저 만든다.
		int [] arr = new int[a];
		//반복문
		
		int i = 0;
		while(i < arr.length) {
			
		arr[i] = scan.nextInt();//입력 받아 배열에 넣어줘야함
		
				i++;
		}
		//최소값, 최대값을 찾는 과정 (최소, 최대 결정)
		int min = arr[0];
		int max = arr[0];      //어차피 순서대로 비교!
		 i=0;
		 
		while(i < arr.length) {
			
			if (min > arr[i]) {
			 min = arr[i];
			
		} 
		if (max < arr[i]) 
			max = arr[i];
		i++;
	}
		
		
		
		System.out.println(min + " "+ max);
	}  
}
		
		

		
		
