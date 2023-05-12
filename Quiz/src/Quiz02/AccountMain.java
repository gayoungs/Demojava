package Quiz02;

public class AccountMain {
	
	public static void main(String[] args) {
		
		Account acc = new Account("123-456", "1234",1000); //Account, password, balance
		
		acc.deposit(-5000); //-5000 누적해야징~
		
		acc.withDraw(10000); //출금
		
		int balance = acc.getBalance(1234); //잔고확인
		System.out.println(balance);
		
	}

}
