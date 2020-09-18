package day11;

public class Test05 {

	public Test05() {
		// 네모 데이터를 5개를 가지는 배열을 만들고 출력하세요

		Nemo[] nemo = new Nemo[5];
		for (int i = 0; i < nemo.length; i++) {
			nemo[i] = new Nemo();
			//객체가 만들어지고 변수를 바로 초기화.
			int garo = (int)(Math.random()*16+5);
			int sero = (int)(Math.random()*16+5);
			nemo[i].setNumo(garo, sero);
		}
		/*
		nemo[0] = new Nemo();
		nemo[1] = new Nemo();
		nemo[2] = new Nemo();
		nemo[3] = new Nemo();
		nemo[4] = new Nemo();
		*/
		
		// 각 방에 있는 네모의 면적을 출력해 보자.
		/*
		System.out.println(nemo[0].area);
		System.out.println(nemo[1].area);
		System.out.println(nemo[2].area);
		System.out.println(nemo[3].area);
		System.out.println(nemo[4].area);
		*/
		
		int i = 1;
		for(Nemo n : nemo) {
			
			System.out.println(i++ + "번째 네모의 가로 " + n.garo+" | 세로 "+n.sero
								+" | 넓이 "+n.area);
		}
	}

	public static void main(String[] args) {
		new Test05();

	}

}

class Nemo {
	int garo, sero, area;

	// 가로와 세로를 입력하면 모든 변수가 초기ㅗ하 되는 함수

	public void setNumo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		area = garo * sero;
	}

}
