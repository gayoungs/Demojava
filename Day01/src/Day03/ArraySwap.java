package Day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {
	
	public static void main(String[] args) {
		/*
		int x = 5;
		int y = 10;
		int temp = 0;
		//x와 y의 값을 바꾸고싶을때
		// 임시로 x값을 temp에 넣고 y값을 x에 넣고 , temp에 넣은 값을 y로 옮김

		temp = x;
		x = y;
		y =temp;
		
		System.out.println(x);
		System.out.println(y);
		*/
		
		
		
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		//두 수를 입력받아서, 두 수의 위치번째를 변경
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(); //0~9
		int b = scan.nextInt(); //0~9
		
		int temp = 0;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
		System.out.println(Arrays.toString(arr));
		
	}

}
