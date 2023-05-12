package day04;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		
		//문자열 다루기
		//문자열은 사실 배열입니다. 문자열은 인덱스가 있습니다.
		
		String str = "안녕하세요~ 영어로하면 하이!";
//		String str  = "안녕하세요~"; //문자열 선언  0안 1녕 2하 3세 4요 5~
		//System.out.println( str[]); 안되는 문법!
		
		//문자열을 다루는 다양한 메서드를 제공
		//문자열을 한글자 자르기
		char c = str.charAt(5);  //~
		System.out.println(c);
		
		//문자열의 위치확인 indexOf
//		int idx = str.indexOf("안");
//		System.out.println("안 의 위치:" + idx); //가장 처음 발견된 위치를 찾아줍니다.
		
		//문자열의 위치확인 indexOf - 없다면 -1을 반환시킵니다.
		int idx = str.indexOf("야");
		System.out.println("문자의 위치:" + idx); //없는값은 결과값이 -1 나옴
		
		int idx2 = str.lastIndexOf("하");
		System.out.println("뒤에서부터 찾은위치:" + idx2);
		
		//문자열 변환 toUpperCase(대문자로변경), toLowerCase (소문자로변경)
		String s = "abcDEF";
	
		String result = s.toLowerCase();
		System.out.println(result); //소문자로
		System.out.println(s); //💖💕❤💖💕❤원본문자열은 그대로 유지❤
		
		String result2 = s.toUpperCase();
		System.out.println(result2); //대문자로
		
		System.out.println("====================================");
		// 문자열 변경 replace
		s = "abcdefaaa";
		
		String result3 = s.replace("a","x");
		System.out.println(result3); //a -> x로 변경(전부다)
		System.out.println(s); //💖💕❤💖💕❤원본문자열은 그대로 유지❤
		
		String result4 = s.replaceFirst("a" , "x");
		System.out.println(result4); //a -> x로 변경 (첫번째만)
		
		System.out.println("====================================");
		//공백제거 trim
		str = "   010-1111-2222   ";
		String result5 = str.trim(); //앞뒤 공백을 제거해서 반환
		System.out.println(result5);
		System.out.println(str); //💖💕❤💖💕❤원본문자열은 그대로 유지❤
		
		str = " 안녕 하세요? 오늘은 4월 19일 입니다";  
		//모든 공백 지우고싶어요
		System.out.println(str.trim()); // 처음과 마지막 공백만 지워진다. 
										// trim은 중간 중간 공백을 지울 수가 없다.
										//원본 문자열에 덮어씌우고 싶다. 원본문자열에 담는다.
		                                // 공백을 전부 제거해서 원본 문자열에 저장 
//		String result6 = str.replace(" ", "");  //위와 같이 원본 문자열에 덮어씌우고 싶다.
//	    str = result6;
		System.out.println(str);
		System.out.println("====================================");
		//문자열 자르기
		//substring - 인덱스 기준으로 자름
		str = "010-1111-2222";
		String result6 = str.substring(9);  //9번째 인덱스 자를게
		System.out.println(result6);
		
		//str은 변함 없음 (💖💕❤💖💕❤원본문자열은 그대로 유지❤)
		String result7 = str.substring(4,8);  // 4 <=8 < 8 인덱스 추출
		System.out.println(result7);
		
		System.out.println(str); // str은 변함 없음 (💖💕❤💖💕❤원본문자열은 그대로 유지❤)
	
		//split - 특정문자를 기준으로 자름(제대로 사용하려면 정규표현식을 알아야함)
		String[] arr = str.split("-");
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = str.split(""); 
		System.out.println(Arrays.toString(arr2));
		
		//toCharArray - 한글자씩 char형으로 자름
		char[] arr3 = str.toCharArray();
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("===============================================");
		//문자열의 길이
		str = "안녕하세요";
		int len = str.length();
		System.out.println("문자열길이:" + len);
		
		//문자열의 비교 equals()
		if(str.equals("안녕하세요") ) {
			System.out.println("두 문자가 같음");
		}
		//문자열의 포함여부 contains()
		if(str.contains("녕")) {
			System.out.println("녕이 포함되어 있음");
		}
	}
}
