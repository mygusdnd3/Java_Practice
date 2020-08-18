package day24;

import java.io.File;
import java.io.FilenameFilter;

public class Test03_01 {

	public Test03_01() {
		File file = new File("D:\\Java_Practice\\class\\java\\source\\class_02\\doc");
//		String[] fList = file.list();
//		for(String f : fList) {
//		//	System.out.println(f+" - ");
//		}
		
		File[] f = file.listFiles();
		for(File fe : f) {
			File fInfo = fe;
			String name = fInfo.getName();
			System.out.println(name +" - "+fInfo.length());
		}
		File[] fList = file.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				if(name.startsWith("Java")&&name.endsWith(".pdf")) {
					return true;
				}else {
					return false;
				
				}
			}
			
		});
		for(File fe : fList) {
			System.out.println(fe.getName());
		}
		
	}

	public static void main(String[] args) {
		new Test03_01();
	}

}
