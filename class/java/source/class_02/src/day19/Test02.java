package day19;

import java.util.*;
public class Test02 {

	public Test02() {
		Random rd = new Random(10);
		Random rd1 = new Random(10);
		Random rd0 = new Random();
		System.out.println("rd0 : "+rd0.nextInt());
		System.out.println("rd : "+rd.nextInt());
		System.out.println("rd1 : " +rd1.nextInt());
	}

	public static void main(String[] args) {
		new Test02();
	}

}
