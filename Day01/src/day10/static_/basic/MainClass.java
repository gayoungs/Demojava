package day10.static_.basic;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		//Arrays.toString();
		
		//String result = Arrays.toString();
	
		//System.out.println(result);
		
	       System.out.println(MyArrays.printArray(new String[3]));
	        System.out.println(MyArrays.printArray(new char[3]));
	        System.out.println(MyArrays.printArray(new int[3]));
		
		//클래스가 여러번 로드 되더라도 static은 단 1번만 실행됨
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		
	
	}

}
