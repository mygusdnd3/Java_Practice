package day13;

public class Test07 {

	public Test07() {
		Father f = new Father();
		f.toPrint();
		Father f1 = new Father();
		f1 = (Father)new Son();
		//System.out.println(s1.num);
		System.out.println(f1.num);
		f1.toPrint();
		
		
		
		
		
		/*
		Son son = new Son();
		son.toPrint();
		f = son;
		System.out.println("Son.num:" +son.num);
		System.out.println("father.num:" +f.num);
		//변수는 레퍼런스 변수쪽을 따른다.
		f.toPrint(); //함수는 맨 마지막에 고쳐쓴 함수가 호출됨
		son = (Son)f;
		*/
	}

	public static void main(String[] args) {
		new Test07();
	}

}

class Father {
	int no = 1000;
	int num = 11;
	public Father() {

	}

	public Father(int no) {
		this.no = no;
	}

	public void toPrint() {
		System.out.println("여기는 아부지 no : " + no);
	}
}

class Son extends Father {
	int num = 22;
	public Son() {
		super(10000);
	}
	public void toPrint() {	// 함수의 오버라이딩(함수의 재정의)
		System.out.println("여기는 아들 no : " + no);
	}
}
