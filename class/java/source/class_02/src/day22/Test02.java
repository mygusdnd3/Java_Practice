package day22;

import java.util.*;
import day22.source.*;
public class Test02 {

	public Test02() {
		HashSet set = new HashSet();
		
//		for(int i = 0; i < 8; i++) {
//			//Nemo n = getNemo();
//			set.add(getNemo());
//		}
		//set.add(new Nemo(3,4));
		//set.add(new Nemo(4,4));
		System.out.println("set.size() :" + set.size());
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		for(Object o : set) {		//String은 내부toString으로 출력이 가능하다, 숫자숫자도 되는데
									// 이건 클래스를 담고있어서 못하나봄
			System.out.println(o);
		}
	}
	
	//네모 반환해주는
	
	public Nemo getNemo() {
		
		//가로세로 랜덤수치 만들고
		int garo = (int)(Math.random()*13+3);
		int sero = (int)(Math.random()*13+3);
		//네모 만들고
		//String name ="고길동";
		Nemo n = new Nemo(garo,sero);
		//네모 반환해주고
		return n;
	}

	public static void main(String[] args) {
		new Test02();
	}

}
