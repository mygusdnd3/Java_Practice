package day12;

public class Test03 {

	public Test03() {
		
		String[] name = {"윤요셉","유병욱","오예찬"};
		int[] age = {18,17,16};
		
		// Saram 3개를 저장할 배열을 만들고 초기화
		
		Saram[] mans = new Saram[name.length]; // Saram 클래스의 데이터를 입력할 공간만 확보된상태
		
		for (int i = 0; i < mans.length; i++) {
			// 데이터를 채워주고
			mans[i] = new Saram();
			
			// 데이터의 맴버 변수 초기화 해주고
			mans[i].name = name[i];
			mans[i].age = age[i];
		}
		
		// 출력하고 -
		//Saram 클래스내에 멤버 변수의 내용을 함수를 만들어뒀으니
		// 그 함수는 자신의 정보를 출력하는 함수이고
		// 따라서 그 함수만 호출해주면 Saram[i]가 가지고있는 모든 사람의정보 출력가능 
		for (int i = 0; i < mans.length; i++) {
			mans[i].toPrint();
		//	mans[mans.length-i+i].toPrint();
		}
		
		Saram s1 = mans[0]; // 이미 <객체화 시켜놓은 값을 넣는것> 새로운 클래스 변수에 넣는것 가능.
		
		System.out.println("세명중 첫번째 사람은 "+s1.getName()+" 입니다");
		System.out.println("세명중 첫번째 사람은 "+"윤요셉"+" 입니다");//동일구문
		
		Saram s2 = new Saram();
		
	}
	public static void main(String[] args) {
		new Test03();
	}

}


class Saram {
	String name;
	int age;
	
	
	public String getName() {
		
		return name;
	}
	public void toPrint() { 	//
		System.out.println(name +" - "+age);
	}
	
}