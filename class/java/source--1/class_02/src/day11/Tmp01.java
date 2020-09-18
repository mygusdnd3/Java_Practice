package day11;

import my_practice.mytmp;

public class Tmp01 {

	Tmp01(){
		Moyang[] m = new Moyang[3];
		for(int i = 0 ; i < m.length; i++) {
			m[i] = new Moyang();
		}
		m[0].figure = "사각형";
		m[1].figure = "삼각형";
		m[2].figure = "원 형";
		//m[3].figure = "이건안되";
		
		
	}
	
	
	public static void main(String[] args) {
		new Tmp01();

	}

}
