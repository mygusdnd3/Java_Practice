package day12;

public class Test06 {

	public Test06() {
		// 이름 두개를 입력하고 출력
		toPrint("윤요셉","유병욱");
		System.out.println();
		// 다섯명의 이름을 입력하고 출력
		
		toPrint( "아이유", "선미", "화사", "유병재", "김광현" );
	}
	public static void main(String[] args) {
		new Test06();
	}
	// 회원의 이름들을 입력하면 출력해주는 함수를 작성하자.
	public void toPrint(String...name) {  //자동배열변수
		for(String irum : name) {
			System.out.println(irum);
		}
	}/*
			public void toPrint(String[] name) {  //q반드시 배열의 형태로 만들어서
				//함수를 호출해야한다.
				for(String irum : name) {
					System.out.println(irum);
		}
	}*/
}
