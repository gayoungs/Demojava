package day13.collection.list;

import java.util.Stack;

public class StackEx {
	
	public static void main(String[] args) {
		
		/*
		 * Stack
		 * =>Last in First out (후입선출)
		 * => push(), pop()
		 */
		
		Stack<String> stack = new Stack<>();
		
		stack.push("홍길동");
		stack.push("이순신");
		stack.push("홍길자");
		
		//형태를 문자열로 확인
		System.out.println(stack.toString());
		
		String n = stack.pop(); 
		//값이 빠짐과동시에 빠진 값까지 누구인지 한번에 알려주는 형태
		System.out.println("pop : " + n);
		System.out.println(stack.toString());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}

}
