package quiz01;

import java.util.Scanner;

public class Quiz06 {
	
	public static void main(String[] args) {
		
		/*
		 * if 구문 밖에 선언된 변수를 잘 활용합니다.
		 *
		 * 정수 3개를 입력을 받습니다.
		 * 
		 * 가장 큰 값, 중간 값, 작은 값을 구분해서 출력. (조건 - 같은 수는 없다라고 가정) 
		 *  
		 *  입력
		 *  15, 30, 7 -> max:30, mid:15, min:7
		 *  1, 2, 3 -> max:3, mid:2, min:1
		 *  
		 *  힌트
		 *  a가 가장 클때의 조건 (a > b && a > c)
		 */
		Scanner scan = new Scanner(System.in);
		
		int max = 0;
		int mid = 0;
		int min = 0;
		
		System.out.print("첫번째 정수를 입력하세요>");
		int a	= scan.nextInt();
		 System.out.print("두번째 정수를 입력하세요>");
		 int b = scan.nextInt();
		 System.out.print("세번째 정수를 입력하세요>");
	   int c = scan.nextInt();
	
		if(a > b && a > c ) {
	      max = a;
	      if (b > c) {
		  mid = b;
		  min = c;
		} else{
		  mid = c;
		  min = b;
		}
		} else if(b > a && b > c) {
			max = b;
		 if(a > c) {
			mid = a;
		    min = c;
      	}else  {
	       mid = c;
      	   min = a;
      	} 
		} else {
      		max = c;
      	 if (a > b) {
      		mid = a;
      		min = b;
      	} else  {
      		mid = b;
      		min = a; 
      	}
      	}System.out.println("max:"+ max + ", mid:" + mid + ", min:"+min);
	}
      			

}
