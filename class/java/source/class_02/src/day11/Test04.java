package day11;

public class Test04 {
	public Test04() {
		// 사각형을 하나 만들고 면적을 출력해보자.
		
		Sagak s01 = new Sagak();
		int width = (int)(Math.random()* 9+2);  //2부터 10까지 
		int height = (int)(Math.random()* 9+2);  //2부터 10까지 
		
		s01.width = width;
		s01.height = height;
		s01.area = s01.width * s01.height;
		
		System.out.println("사각형 s01의 \n\t 가로는 "+s01.width+" 이고 \n\t "
								+ "세로는"+ s01.height+ " 이며 \n\t"
								+ " 면적은 "+s01.area	+" 입니다.");
		
		
		Sagak s02 = new Sagak();
		s02.width = (int)(Math.random()*16+5);
		s02.height = (int)(Math.random()*16+5);
		s02.Area(s02.width, s02.height);
		
		System.out.println("사각형 s02의 \n\t 가로는 "+s02.width+" 이고 \n\t "
				+ "세로는"+ s02.height+ " 이며 \n\t"
				+ " 면적은 "+s02.Area(s02.width, s02.height)+" 입니다.");
		
		Sagak[] sArr = new Sagak[3];
		for(int i = 0; i<sArr.length;i++) {
			sArr[i] = new Sagak();
		}
		sArr[0].height = 30;
		sArr[1].height = 40;
		sArr[2].height = 50;
		
		System.out.println( "sArr[0].height\t"+sArr[0].height+"\n sArr[1].height\t"+sArr[1].height
								+"\n sArr[2].height\t"+sArr[2].height);
	}
	
	
	public static void main(String[] args) {
		new Test04();

	}

}


class Sagak{
	int width, height, area;
	public int Area(int width, int height) {
		
		return width * height; 
	}
		// 가로와 세로를 입력하면 모든 변수가 초기화가 되는 함수
	
}