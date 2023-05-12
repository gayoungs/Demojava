package quiz01;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		
		// 1. 1000까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 count(개수)
		
		int sum = 0;
		int a = 1;
		
		while(a <= 1000) {
			if(a % 4 == 0 && a % 8 != 0) {
			 
				//sum += a;
				sum++; //숫자의 갯수를 세는 것
			}
			
		   a++;
		}
		
		// 2. 50~100까지의 합계
		System.out.println("개수:" + sum);
		
		int b = 50;
		int c = 0;
	while(b <= 100) {
			 
		  c += b;
			
		  b++;
		  
	}
	  System.out.println("50~100까지의합:"+c);
	 
	}
}


		
		
	

