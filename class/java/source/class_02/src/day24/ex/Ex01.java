package day24.ex;

/*
 	day24.Test04.java 파일을 복사해서
 	day24.Test04_01.java 를 만드세요
 	"src/day24/Test04.java"
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Ex01 {

	public Ex01() {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		Date d = null;
		try { 
			fr = new FileReader("src/day24/Test04.java");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("src/day24/Test04_01.java");
			bw = new BufferedWriter(fw);
			
			String s = null;
			d = new Date();
			
			long start = d.getTime();
			
			while((s=br.readLine())!=null) {
				bw.write(s);
				bw.newLine();
			}
			
			d = new Date();
			long end = d.getTime();
			
			System.out.println("복사시간 :" + (end-start));
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(br!=null) {
				try {
					br.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}   if(fr != null) try{fr.close();}catch(IOException e){}
			 if(bw != null) try{bw.close();}catch(IOException e){}
			   if(fw != null) try{fw.close();}catch(IOException e){}
			
		}
		/*
		 * while (true) { Arrays.fill(buff, (byte) 0); int len = fis.read(buff); // 버프만큼
		 * 읽어서 len에 길이 저장. if(len == -1) { break; } fos.write(buff, 0, len); }
		 * System.out.println("복사완료가왜빨간줄이냐");
		 * 
		 * } catch (Exception e) { e.printStackTrace(); } finally { try { fos.close();
		 * fis.close(); } catch (Exception e) { e.printStackTrace(); } }
		 */

	}

	public static void main(String[] args) {
		new Ex01();
	}

}
