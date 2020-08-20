package day25;

import java.io.File;

public class FileCheck {


	public void checkFile() {
		File file = new File("D:\\Java_Practice\\class\\java\\source\\class_02\\src\\day25\\doc\\stdScore01.txt");
		if(file.exists()) {
			System.out.println("파일 출력 완료 "+file.getName());
			System.out.println("파일 경로 "+file.getAbsolutePath());
			
		}else {
			System.out.println("파일 생성에 실패하였습니다.");
		}
		
	}

}
