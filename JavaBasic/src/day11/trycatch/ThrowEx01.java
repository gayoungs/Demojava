package day11.trycatch;

public class ThrowEx01 {
	
	public static void main(String[] args) {
		
		try {
			int result = sum(-10);
		} catch (Exception e) {  
			String msg = e.getMessage();//예외 메시지를 문자열로 반환
			System.out.println(msg);
		}

	}
	
	public static int sum(int n) throws Exception {
		//①트라이 캐치 ②예외던지기 => 둘중하나 해야 에러 발생안하고 정상적인 사용 가능
		
		//예외를 직접 생성해서, 메서드를 종료할 때 사용할 수 있습니다.
		if(n < 0) {
			
			throw new Exception("0 이상의 값이어야 합니다"); //예외를 생성할 때, 예외에서 사용되는 메시지
			//에러생성   //메서드에서 에러가발생하여 강제종료됨
			
		}
		
		int sum = 0;
		for(int i = 1; i <= n; i++ ) {
			sum += i;
		}
		
		return sum;
	}

}
