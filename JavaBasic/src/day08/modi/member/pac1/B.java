package day08.modi.member.pac1;

public class B {

	//사용
	A a = new A (); //public  O
	A a2 = new A(1); //default   O 
//	A a3 = new A("홍길동"); //private X
	
	
	public B() {     //A의 기능을 확인해보고싶을땐 어떻게해야되지???????????????????????????
		a.var1 = 1;
		a.var2 = 2;
		//a.var3 =3; //private X
		
		a.method1();
		a.method2();
		//a.method3();
		
	}
	
}
