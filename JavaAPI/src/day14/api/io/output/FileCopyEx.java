package day14.api.io.output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyEx {
	
	public static void main(String[] args) {
		
		/*
		 * FileInputStream, FileOutputStream은
		 * 동영상, 이미지 파일을 읽거나 쓸때 사용합니다.
		 */
		
		String readPath ="C:\\Users\\user\\Desktop\\course\\java\\file\\메서드1.mp4";
		String writePath = "C:\\\\Users\\\\user\\\\Desktop\\\\course\\\\java\\\\filecopy\\메서드1_copy.mp4";
		
		//향상된 try ~ catch문
		//Closeable 인터페이스를 상속받은 클래스만 사용이 가능
		//close작업을 대신 함
		
		
		 //()안에 값이 여러개라면 ;세미콜론으로 구분가능, 마지막엔 세미콜론 안들어감
		try(InputStream is = new FileInputStream(readPath);  
				OutputStream out = new FileOutputStream(writePath)) {
			
			
			//읽음  실제 동영상(50분)파일은 100메가바이트 넘음
			byte[] arr = new byte[2048]; //2kb
			
//			while(true) {
//			int result = is.read(arr);
//			System.out.println(result);
//			if(result == -1) break;
//			}
			int result;
			while ( ( result = is.read(arr) ) != -1 ) { //읽은 값이 -1이 아닐때까지
				
				//쓰기
				out.write(arr, 0, result); //arr데이터를 0에서~ 바이트 배열의 result까지만 씀
				
			}
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		/*
		finally {
			try {
				is.close();
				out.close();
				
			} catch (Exception e2) {
				System.out.println("파일close에러");
			}
	
			}
		*/
		System.out.println("프로그램 정상종료");
		
	}

}