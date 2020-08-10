package day18;

public class Ex02_01 {

	public Ex02_01() {
		int[] size = new int[4];
		for(int i = 0; i < 4; i++) {
			int no = (int)(Math.random()*20+1);
			try {
			if(no < 3) {
				// 이 경우도 JVM에게 강제로 예외처리하라고 알려줘야 한다.
				// 사용자자 정의 예외로..
				throw new Excep02();
			}else if (no > 15) {
				//이 경우는 사용할 수 없는 숫자이므로 예외를 강제로 발생시킨다.
				//일반적인 경우에는 예외가 전혀 아니므라, JVM이 따로 처리할 수없다.
				// 다만 이 프로그램의 경우 NumberFormatException으로 처리하기로했으니
				//JVM에게 강제로 처리하라고 알려준다.
				
				throw new NumberFormatException();
			}
			size[i] = no;
		 }catch(NumberFormatException e) {
			 i --;
			 e.printStackTrace();
		 }catch(Excep02 e) {
			 i --;
			 e.printStackTrace();
			 
		 }
		}//for문 끝
		// 삼각형에 필요한 사이즈는 정해졌으니 이제 삼각형을 만들고 비교해본다.
		Samgak2 s1 = new Samgak2(size[0],size[1]);
		Samgak2 s2 = new Samgak2(size[2],size[3]);
		
		String msg = s1.equals(s2) ? "같은 " : "다른 ";
		System.out.println("삼각형 s1과 s2 는 "+ msg + "삼각형 입니다.\n s1.width :"+s1.width+"\n s2.width : " +s2.width);
	}

	public static void main(String[] args) {
		new Ex02_01();
	}

}

class Samgak2 {
	int width, height;
	double area;

	public Samgak2() {
	}

	public Samgak2(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();

	}

	// 면적
	public void setArea() {
		area = width * height / 2.0;
	}

	// 밑변이 같으면 같은 삼각형으로 되게 equals() 오버라이드
	public boolean equals(Object o) {
		/*
		 * boolean bool = false; Samgak s1 = (Samgak) o ; if(this.width==s1.width){
		 * bool=true}또는 bool = s1.width == this.width; return bool;
		 */
		return this.width == ((Samgak2) o).width;
	}
}

class Excep02 extends Exception{
	public String toString() {
		String s = getClass().getName();
		String msg = "3보다 작은수입니다";
		return (msg != null)?(s + ": " +msg) : s;
	}
}
