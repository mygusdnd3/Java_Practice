package day20;

import java.util.*;
public class Test09_01 {

	public Test09_01() {
		Vector vec = new Vector(20);
		System.out.println("1. size:"+vec.size());
		System.out.println("1. vec :"+vec.capacity());
		for(int i = 0; i < 21; i++) {
			vec.add(10);
		}
		System.out.println("2. size:"+vec.size());
		System.out.println("2. vec :"+vec.capacity());
		
		vec = new Vector(20,5);
		System.out.println("3. vec :"+vec.capacity());
		for(int i = 0; i < 21; i++) {
			vec.add(10);
		}
		System.out.println("4. size:"+vec.size());
		System.out.println("4. vec :"+vec.capacity());
		for (int i = 0; i < 5; i++) {
			vec.add(10);
		}
		System.out.println("5. size:"+vec.size());
		System.out.println("5. vec :"+vec.capacity());
	}

	public static void main(String[] args) {
		new Test09_01();
	}

}
