package day25;

/*
 	문자기반 스트림을 사용해서
 	day25/doc/fileTest01.txt
 	파일을 복사해서
 	day25/doc/fileTest02.doc
 	파일을 만드세요. 
 */
import java.io.*;
public class Test07 {

	public Test07() {
		//입력 타겟 스트림 준비.
		FileReader fr = null;
		//입력 필터 스트림 준비
		BufferedReader br = null;
		//출력 타겟 스트림 준비
		FileWriter fw = null;
		//출력 필터 스트림
		BufferedWriter bw = null;
		try {
			fr = new FileReader("src/day25/doc/fileTest01.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("src/day25/doc/fileTest02.doc");
			bw = new BufferedWriter(fw);
			
			while(true) {
			
				String str =  br.readLine();
				if(str == null)break;
				bw.write(str+"\n");
			
			}
			System.out.println("복사 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
				
				
	}

	public static void main(String[] args) {
		new Test07();
	}

}
