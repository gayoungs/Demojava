package day17.api.regex;

public class RegexEx01 {
	
	public static void main(String[] args) {
		
		
		String info = "홍길동|30세|서울시 강남구|010-1234-5678"; //역슬래시 사용
		
		//(핸드폰 번호를 찾아라!) 전화번호 형식을 찾아서 ***-****-****해주세요.
		
		String pattern = "[0-9]{3}-[0-9]{4}-[0-9]{4}";  
		//대표적으로핸드폰번호 나타냄
		
		//특정 API에서 regex가 있다면, 정규표현식을 적용할 수 있다는 의미입니다.
		String result = info.replaceAll(pattern,  "***-****-****");
		//info.replaaceAll(정규표현식, 치환될 문자);
		
		System.out.println(result);
		
		
		
				
	}

}
