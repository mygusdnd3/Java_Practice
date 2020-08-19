package day25;

import java.io.*;

public class Test04_01 {

	public Test04_01() {
		FileReader fr = null;
		BufferedReader br_f = null;
		try {
			// 콘솔에서 입력받을 경우
			// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			// 파일에서 입력받을 경우
			fr = new FileReader("src/day25/doc/fileTest01.txt");
			br_f = new BufferedReader(fr);

//			int num = Integer.parseInt(br.readLine());
//			br.close();
			String line = "";
			for (int i = 0; (line = br_f.readLine()) != null; i++) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br_f.close();
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		new Test04_01();
	}

}
