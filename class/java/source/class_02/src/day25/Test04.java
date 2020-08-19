package day25;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

/*
 	fileTest01.txt 파일을
 	문자단위 스트림을 사용해서 읽어보자.
 */
public class Test04 {

	public Test04() {
		// 타겟 스트림을 준비하고
		FileReader fr = null;
		try {
			//스트림 만들고
			fr = new FileReader("src/day25/doc/fileTest01.txt");
			//1. 한 글자만 읽어보자.
			int ch = fr.read();
			// 출력
			System.out.println("한 글자 읽은 것 : " +(char)ch+" - "+ch);
			
			//2. 여러 글자를 읽어보자
			
			char[] buff = new char[1024];
			int len = fr.read(buff);
			/*
			 	len - 읽은 문자 갯수를 기억할 변수가 된다.
			 	nt read(char[] ch) -문자 배열에 읽은 문자들을채워주고 + 읽은 문자의 갯수를 반환을 해준다. 
			 */
			//데이터를 읽었으니 문자 배열을 이용해서 문자열을 만들면 된다.
			String str = new String(buff,0,len);
			//출력
		//	System.out.println(str);
			
			char[] buff2 = new char[1024];
			//int len2= fr.read(buff);
			
			BufferedReader br = new BufferedReader(fr);
			int len2 = br.read(buff2);
			
			String str2 = new String(buff2,0,len2);
			System.out.println(str);
			br.re
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
