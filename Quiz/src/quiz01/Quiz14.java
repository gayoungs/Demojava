package quiz01;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		/* => 문제출처: 1학년
		 *  1. 가로, 세로길이를 입력을 받습니다.
		 *  2. 가로, 세로길이만큼 사각형을 출력합니다./
		 *  3. 단, 윤곽만 나오면 됩니다.
		 * 
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.print("가로>");
		int a = scan.nextInt();
		System.out.print("세로>");
		int b = scan.nextInt();
 
      for(int i = 1; i <= b; i++) {
    	  
    	  for(int j = 1; j <= a; j++) {
    		 
    	  if(j==1 || j==a){	  
    	System.out.print("*");
 
    	  }else{
    		  if(i == 1 || i==b) {
		System.out.print("*");
				}else{
    	System.out.print(" ");
				}
    	  }
    	  }
    	  System.out.println();
      }
	} 
}
      
	  
      
