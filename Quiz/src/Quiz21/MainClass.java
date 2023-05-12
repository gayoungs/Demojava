package Quiz21;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		//지역명, 규모구분, 연도, 월, 분양가격 -> 1행 X 4800개
		/*
		 * 1. 버퍼리더 이용해서 한줄씩 읽습니다.
		 * 2. split(",", 5)를 사용해서 Data객체에 한줄 단위로 저장을하고
		 * 3. List<Data>에 하나씩 추가를 합니다.
		 * 
		 * 4. 람다식을 이용해서 지역:서울, 4분기중 9~12월, 분양가격: 2000이상인 객체만 뽑아서
		 * 새로운 리스트로 반환.
		 */

		List<Data> list = new ArrayList<>(); //저장할 리스트
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\Quiz21\\주택도시보증공사_전국 평균 분양가격.csv"; 
        
		//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "EUC-KR" ));
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "EUC-KR" ))){

        	String str;
            while ((str= br.readLine()) != null) {
             
            	//System.out.println(str);
               
               // str.split(",");
            	String[] arr = str.split(",", 5);
            	
            	String region = arr[0];
            	String size = arr[1];
            	String year = arr[2];
            	String month = arr[3];
            	String price = arr[4].replace(" ","").replace(",", "").replace("\"","").replace("-",""); 
            	// 공백 컴마(,)제거, 쌍따움표("")제거,하이픈(-)제거
            	
            	price = price.equals("") ? "0" : price; //공백이라면, "0" 대입 : 그대로 
            			
      
            	//System.out.println(Integer.parseInt(str));
            	
            	
            	Data data = new Data(region, size, year, month, price);
            	list.add(data); //리스트에추가
               
        }
 
            System.out.println(list.size()); //리스트크기 (반복문 바깥에서 사용)
            
           //4번에 대한 처리...
            
            
            
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
		
		
		
		
		
		
		
		
		
		
	}


