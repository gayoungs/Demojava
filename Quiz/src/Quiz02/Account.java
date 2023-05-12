package Quiz02;

public class Account {

	//한 사람의 은행 계좌
	/*
	 * accountNumber변수 - 식별아이디
	 * password변수 - 비밀번호
	 * balance변수 - 잔고
	 * 
	 * 생성자 //멤버변수 초기화
	 * 3가지를 모두 받아서 초기화하는 생성자 
	 * 
	 * 메서드
	 * deposit(입금) : void - 기능: 잔고에 매개변수를 누적하는 기능
	 * withDraw(출금) : void - 잔고에서 매개변수를 차감하는 기능 
	 * getbalance : int - 잔고를 리턴하는 기능
	 * 
	 * 메인클래스에서는 각각의 기능을 확인
	 * 
	 */
	String accountNumber;
	String password;
	int balance;

	//생성자
	Account(String num, String pw, int bal) { //생성자도 매개변수가 있음
		String accountNumber = num;
		String password = pw;
		int balance = bal;

	}

	void deposit (int money) {
		//매개변수가 양수 일때만 가능하도록 변경
		if(money > 0) {
			balance += money;
		}else {
		  System.out.println("입금이 0보다 작을수는 없습니다.");
		}	
		
	}
	
	void withDraw(int money) {
		//매개변수가 잔고보다 작을때만 출금이 가능하도록 변경
		if(money <= balance) {
			balance -= money;
		}else {
		  System.out.println("잔고가 부족합니다(잔고:" + balance+")");
		}	
	}
	
	int getBalance(int money) {
		return balance; 			//잔고를 외부에다가 가져다 준다.
	}
}
