package day04;

public class MethodEx01 {

	 public static void main(String[] args) {

	      /*
	       * 메서드는 생성과 호출이 있습니다.
	       * 메서드는 메서드안에서 생성 할 수 없습니다. 
	       */

	      //1~10까지 합을 구하는 반복문
	      /*int sum = 0;
	      for(int i = 1; i <= 10; i++) {
	         sum += i;
	      }
	      System.out.println("1~10까지합:" + calSum());
	      System.out.println("1~10까지합:" + calSum());
	      System.out.println("1~10까지합:" + calSum());*/

	      int result = calSum(); //55는 정수, 담아서 출력가능
	      System.out.println("1~10까지합:" + result);

	      String result2 =calSum2();
	      System.out.println(result2);

	   } //main이 끝나는 지점

	   //반환 유형 이름()
	   static int calSum() {

	      //여기에 여태 공부한 문법들 다 사용할 수 있음 배열, 스캐너, 전부다 사용가능 
	      //1~10까지 합을 구하는 반복문
	      int sum = 0;
	      for(int i = 1; i <= 10; i++) {
	         sum += i;
	      }
	      return sum; //합계를 반환 
	   }

	   //문자열 반환
	   static String calSum2() {
	      String str = "";
	      for(char c = 'A'; c <= 'Z'; c++) {
	         str += c;
	      }
	      return str;   
	   }
	}
