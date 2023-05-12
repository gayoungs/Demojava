package Quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz02 {
	
	public static void main(String[] args) {
		
	     /*
	       * 1. Date클래스를 이용해서 File경로에 하위폴더로 20230504file 폴더를 생성합니다
	       * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
	       * 3. 그만을 입력받을 때 까지 엔터를 포함해서 입력 받습니다.
	       *    \r\n을 적절하게 이용해서 파일 출력을 완료 
	       * 4. 파일을 다 썼다면 아무방법으로 읽어들여서 이클립스창에 출력.
	       */
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		//무조건 문자로 한줄씩 들어옴 (숫자로 바꿔주고, 문자로바꿔주는 그런기능없음)
		*/
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyymmdd");
		String now= sdf.format(date); //년월일
	
		
		Scanner scan = new Scanner(System.in);
		System.out.print("파일명>");
		String filename = scan.nextLine();
		
		
		String filepath ="C:\\Users\\user\\Desktop\\course\\java\\file\\"+ now + "file"; //경로
		String path = filepath + "\\" + filename + ".txt";
		
		
		File file = new File(filepath);
		if(file.exists() == false) {//존재하지않는다.
			file.mkdir();
			
			System.out.println("폴더생성완료"); 
				
			}else { 
				System.out.println("이미존재합니다.");
			}
			
			
			
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path));
			BufferedReader br = new BufferedReader(new FileReader(path));) {
			
			/*
			Reader rd = new FileReader(경로);
			BufferdReader br = new BufferdReader(리더클래스);
			*/
			
		//쓰는작업
			while(true) {
				System.out.print(">");
				String str = scan.nextLine();
				
				if(str.equals("그만")) {
					System.out.println("종료합니다.");
					break;
				}
				
				bw.write(str + "\n"); //쓴다.
				bw.flush(); //플러쉬 작업을 해줘야 파일이 실제로 써진다.
			}
			
			
			
			//읽는작업
			String result;
			while((result = br.readLine()) != null ) {
				System.out.println(result);
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

}
