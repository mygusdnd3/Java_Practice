package day24;

import java.io.*;
public class Test02 {

	public Test02() {
		File file = new File("D:\\day24\\fTest\\test.txt");
		String name = file.getName();
		System.out.println("파일이름 : "+name+file.list());
	}

	public static void main(String[] args) {
		new Test02();
	}

}
