package day13.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		/*
		 * ArrayList
		 * => 배열기반
		 * => 순서 o, 중복 
		 */
		//ArrayList<String> list = new ArrayList<>();
		List<String> list = new ArrayList<>();

		//List추가 add()
		list.add("홍길동");
		list.add("이순신");
		list.add("홍길자");
		list.add("홍길동");
		list.add("신사임당");

		//문자열로 확인
		System.out.println(list.toString());

		//길이 확인 size()
		System.out.println("리스트의 길이 : " + list.size());

		//중간에 추가 add()
		list.add(0, "0번째추가");
		System.out.println(list.toString());

		//값의 확인 get()
		String n = list.get(3);
		System.out.println(n); //pop은 제거되면서 값을 빼주지만
		//겟메서드는 배열이기때문에 값이 사라지는게 아니라 그대로 남아있으면서
		//빼고 싶은 값만 빠짐

		//값의 수정 set()
		list.set(4, "홍순자");
		System.out.println(list.toString());

		//갑의 제거 remove()
		list.remove(0);
		list.remove("신사임당");
		System.out.println(list.toString());

		//contains()
		if(list.contains("홍길동")) {
			System.out.println("홍길동이 있음");

		}

		if((list.isEmpty())) {
			System.out.println("리스트가 비었음");
		}else
			System.out.println("리스트가 비어있지 않음");

		//전부삭제 clear()
		list.clear();
		System.out.println(list.toString());

	
		//제네릭<?> = 제네릭에 뭐든 다 들어갈 수 있음
		//제네릭<? extends String> = String과 String의 자식들 전달가능
		//제네릭<? super String> = String 타입이 될 수 있다면 전달가능
		List<String> list2 = Arrays.asList("a","b","c","d");
		System.out.println(list2.toString());
		
		//리스트를 병합,, 리스트가 값이 들어있든 없든 값을 합쳐줌
		list.addAll(list2);
		
		System.out.println(list.toString());
	
	}


}

