package quiz01;

import java.util.Scanner;

public class Quiz03 {
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);

		int star = 5;


		for (int i = 1; i <= star; i++) {

			for (int j = star; j > i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
     }
		
	}


