package Quiz18;

import java.util.Scanner;

public class StringQuiz01 {
	
	/*
	 * 스캐너 사용해서 id를 입력받습니다.
	 * 아이디는 공백을 포함해서 받을 수 있습니다. nextLine()
	 * 
	 * 단, 공백을 제거한 아이디가 5글자 미만이면 다시 입력받습니다.
	 * 		5글자 이상이라면 "id가 등록되었습니다" 출력후 종료
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	/*	String id;
        
		do {
            System.out.print("id를 입력하세요>");
            
            id = scan.nextLine().replace(" ", "");
       
        } while (id.length() < 5) {
        
        System.out.println("id가 등록되었습니다.");
        
        scan.close();
       
        }*/
	
	
		while (true) {
		
		System.out.println("id>");
		
		String id = scan.nextLine();
		
		id = id.replace(" ", "");
		
		if(id.length() >=5 ) {
		
			System.out.println("id가 등록되었습니다.");	
			
			break;
			
		} else {
        
			System.out.println("id는 5글자 이상입니다.");
      
	}
	
	}
	}
}



