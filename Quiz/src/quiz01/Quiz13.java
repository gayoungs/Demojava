package quiz01;

import java.util.Scanner;

public class Quiz13 { 
	
	public static void main(String[] args) {
		
		//1. 7~100까지 정수 중에 7의 배수만 가로로 출력.
			
		for(int a = 7; a <= 100; a++)
	      if(a % 7 == 0) {
	    	  System.out.print(a + " ");
	      } 
		System.out.println(); 
		
		//2. 1~200까지 정수 중에 9의 배수의 개수를 출력.
		
		int count = 0;
		for(int b = 1; b <= 200; b++)
			if(b % 9 == 0) {
				count++;
			} 
		System.out.println("1~200까지 정수 중에 9의 배수의 개수 : " + count);
			
		//3. 50~100 사이의 두 수 사이의 합
		int sum = 0;
		for(int c = 50; c <=100; c++) {
			sum += c;
			
		} System.out.println("50~100까지 합 : "+ sum);
		
		//4. A~Z까지 가로로 붙여서 출력, A=65, Z=90
		for(char c = 'A'; c <= 'Z'; c++) {
			 System.out.print(c+" ");
		}
		
		System.out.println();
		//5. 입력받은 정수까지 팩톹리얼 5팩토리얼 = 5 * 4 * 3 * 2 * 1
	
	    Scanner scan = new Scanner(System.in);
	    System.out.print(">");
		int num = scan.nextInt();
		int sum2 = 1;
	    for(int i = 1; i <= num; i++) {
	    	sum2 *= i;
		 
	    }
		System.out.println(num + "!은" + sum2);
	
	}
		
		
		
	}


