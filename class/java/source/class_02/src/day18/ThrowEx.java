package day18;

import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

public class ThrowEx {

	public ThrowEx() {
	}

	public static void main(String[] args)  {
		try {
			System.out.println(ExceptionFileOpen.getFirstLine());
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을수 없습니다.");
			//e.printStackTrace();
		}
		System.out.println("main end..");
		String str= "a";
		
		try {
			Intparser.intpas(str);
		} catch (Exception e) {
			System.out.println("문자가 입력되었습니다.");
			//e.printStackTrace();
		}
		
		
		
	}
}

 class Intparser {
	 public static int intpas(String str) throws Exception {
		 int a = Integer.parseInt(str);
		 return a;
	 }
 }