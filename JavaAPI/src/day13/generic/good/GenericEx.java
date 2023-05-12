package day13.generic.good;

import java.util.ArrayList;
import java.util.List;


public class GenericEx {
	
	public static void main(String[] args) {
		//제네릭<?> = 제네릭에 뭐든 다 들어갈 수 있음
		//제네릭<? extends String> = String과 String의 자식들 전달가능
		//제네릭<? super String> = String 타입이 될 수 있다면 전달가능
		
		List<String> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Object> list3 = new ArrayList<>();
		
		add1(list1); //O
		add1(list2); //O
		add1(list3); //O 무엇이든 다 받을 수 있습니다.
		
		add2(list1); //string O
//		add2(list2); //integer X
//		add2(list3); //object X
		
		add3(list1); //string O
//		add3(list2); //integer X
		add3(list3); //object O
	
	}
		
		public static void add1(List<?>list) {
			
		}
		
		public static void add2(List<? extends String>list) {
			
		}
		
		public static void add3(List<? super String> list) {
			
		}
	}


