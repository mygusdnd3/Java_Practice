package day18;

import javax.swing.JOptionPane;

/*
 	사각형의 면적이 같으면 같은 사각형이 되도록 
 	클래스를 정의 하세요
 */
public class Test03 {

	public Test03() {
		// 가로 세로가 각각 2,3 그리고 3,2 인  두 사각형을 비교해 보자
		Nemo n1 = new Nemo(2,3);
		Nemo n2 = new Nemo(3,3);
		String msg = "가로 세로가 각각2,3 3,2 인 두 사각형은"+
					(n1.equals(n2)?" 같은":" 다른") +"사각형 입니다.";
		JOptionPane.showMessageDialog(null, msg);
	}

	public static void main(String[] args) {
		new Test03();
	}

}

class Nemo{
	int width, height; 
	double area;
	public Nemo() {
		this(1,1);	//Nemo(1,1)로 호출해야 하지만 이렇게 사용못하므로
						//this(1,1)함수를 호출해서 사용
	}
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	public void setArea() {
		area = width * height;
	}
	public void setArea(int width, int height) {
		area = width * height;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		//현재 실행중인 이 객체와 매개변수로 입력된 객체를 비교해야 하므로
		// 매개 변수로 입력된 Object는 분명히 Nemo 타입의 객체일 것이다.
		// 따라서 Object를 Nemo 타입으로 형변환 해줘야 하고
		// 이 경우는 Object가 더 넓기 때문에 강제 형변환이 되어야 한다. 
		// 
		Nemo n = (Nemo) o ;
		if(this.area == n.area) {
			bool = true;
		}
		return bool;
		
	}
}