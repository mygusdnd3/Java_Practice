package day11;


/*
  
 	문제 2]
 	세모 데이터 5개를 관리하는 배열을 만들고
 	각 인스턴스의 변수를 초기화 해서 
 	내용을 출력 하세요.
 	
 */
public class Ex01 {
	public Ex01() {
		setSemo();
	}
	
	public void setSemo() {
		Semo[] semo = new Semo[5];
		for(int i = 0 ; i < semo.length; i++) {
			semo[i] = new Semo();
			int width = (int)(Math.random()*100);
			int height = (int)(Math.random()*100);
			semo[i].setData(width, height);
			System.out.println((i+1)+" 번째 width    |"+semo[i].width+"\n\theight  |"+semo[i].height+"\n\tarea    |"+semo[i].area);
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		new Ex01();

	}

}

class Semo{
	int width, height;
	double area;
	
	void setData(int width, int height) {
		this.width = width;
		this.height = height;
		area = (int)(width * height / 2.0 *100 +0.5)/ 100.0; //소수 두번째자리까지 반올림)
	}
}

