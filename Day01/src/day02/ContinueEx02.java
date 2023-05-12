package day02;

import java.util.Scanner;

public class ContinueEx02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력 >");
		int num = scan. nextInt();
		int sum = 0;  //소수의 합을 누적
		int count =0 ; // 약수의 개수를 셀 변수

		x:for(int i = 1; i <= num; i++) {

			count = 0; // 초기화

			for(int j = 1; j <= i; j++) {

			
				//적절한 시점 초기화	
				if(i % j == 0) {
					count++;
				}
				
				if(count > 2) continue x;  //약수개수가 2개 초과라면 다음 수 확인
	  //100프로 빨라진다고 얘기할 수 없지만 불필요한 반복을 하지않음

			} //end for
			if(count == 2) { //소수를 sum에 누적
				sum += i;
			}
		}
		System.out.println("입력한 수 중에서 소수의 합:" + sum);
	}

}


