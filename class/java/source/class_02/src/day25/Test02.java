package day25;

import java.util.Scanner;

public class Test02 {

	public Test02() {
		Scanner sc = new Scanner(System.in);
		System.out.print("뭐라도 써주세요 : ");
		String str= sc.nextLine();
		System.out.print("뭐라도 써주세요 : ");
		str = str + sc.nextLine();
		System.out.println("입력한 문자 : "+str);
	}

	public static void main(String[] args) {
		new Test02();
	}

}
