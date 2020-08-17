package day23;
import java.io.*;
import java.util.*;

//프로그램에 관련된 정보를 자동으로뽑아서 살펴보자
public class Test03 {

	public Test03() {
		Properties prop = System.getProperties();
		/*
		 	System.getProperties() 함수가
		 	프로그램에 관련된 정보를 Properties의 형식으로 반환해 주는 함수
		 	
		 	Properties는 Map의 일종이니
		 	프로그램의 정보를 Map의 형태로 반환해주는 함수가 된다. 
		 */
		// 일단 정보는 받아왔는데, 키값이 어떤것들이 있는지 알지 못한다.
		// 따라서 키 값만 뽑아내야 한다.
		
		Enumeration en = prop.keys();
		//keys() 는 반환값이 Enumeration 타입이고 이것은 Iterator의 구버전이다
		while(en.hasMoreElements()) {
			String key = (String)en.nextElement(); //nextElement() 함수는 반환값이 Object 타입이므로 강제 형변환이 필요하다
			String value = prop.getProperty(key);	//get 과 같은 역할, 문자열만 꺼내는 함수
			System.out.println(key + " - " + value);
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
