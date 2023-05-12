package quiz01;

import java.util.Scanner;

public class Quiz23 {
	public static void main(String[] args) {

		//정수 2개를 받아서 합을 출력하는 문장
		//반환도 없고, 매개변수도 없는 메서드 show()로 변형을 하여 출력
		//반환은 있고, 매개변수는 없는 메서드 input()
		/*
		System.out.println("[두 수의 합을 구합니다]");

		Scanner scan = new Scanner(System.in);

		System.out.print("정수입력>");
		int num1 = scan.nextInt();

		System.out.print("정수입력>");
		int num2 = scan.nextInt();

		//두 수의 합을 리턴하는 메서드 add()
		int result = num1 + num2;
		
		//매개변수로 result로 받아서 단순히 출력 print();
		System.out.println("두 수의 합:" + result);
	
		 */
		show();
		
		int a = input();
		int b = input();
		
		int result = add (a, b);
		print(result);
		
	}
	static void show() {
		System.out.println("[두 수의 합을 구합니다]");
	}
	static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력>");
		int num1 = scan.nextInt();
		return num1;
	}
	static int add(int a, int b) {
		int result = a + b;
		return a + b ;
	}
	static void print(int result) {
		System.out.println("두수의 합:" + result);
	}
	
}