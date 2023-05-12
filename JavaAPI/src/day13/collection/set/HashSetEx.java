package day13.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class HashSetEx {
	
	public static void main(String[] args) {
		
	/*
	 *리스트와 반대 (순서 X, 중복 X)
	 * 
	 *
	 *HashSet 클래스
	 *Treeset 클래스 (set+정렬)
	 */
	
		//HashSet<String> set = new HashSet<>();
		Set<String>set = new HashSet<>();
		
		//add()
		set.add("java");
		set.add("database");
		set.add("spring");
		set.add("jsp");
		set.add("python");
		set.add("java");
		set.add("java");
		set.add("java"); //중복X
		
		System.out.println(set.toString());
		//크기
		System.out.println("크기:" + set.size());
		//삭제(값)
		set.remove("python");
		
		//순회(회전) => 내부적으로 반복자의 개념을 사용해서 회전
		//향상된 for문
		for(String s : set ) {
			System.out.println(s);
		}
		System.out.println("--------------------------------");
		//set => iterator 타입으로 변경
		Iterator<String> iter = set.iterator();
		
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
		
		while(iter.hasNext()) { //다음이 있다면 true
			System.out.println(iter.next());
		}
		
	}
}
