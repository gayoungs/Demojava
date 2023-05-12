package day08.encap.good;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		//me, day. = 2022; 직접적인 변환은 불가능 값저장해야함
		me.setYear(2022);
		me.setMonth(12);
		me.setDay(30);
		me.setSsn("123123-1231231");
		
		int year = me.getYear();
		System.out.println(year);
		
		String ssn = me.getSsn();
		System.out.println(ssn);
	}

}
