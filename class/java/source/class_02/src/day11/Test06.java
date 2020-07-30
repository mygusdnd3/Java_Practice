package day11;

import javax.swing.JOptionPane;

public class Test06 {

	Person[] friend; //Person 클래스
	String[] name, tel, mail;
	int[] age;
	char[] gen;

	public Test06() {
		setOne();
		setMany(); //===> 배열이 초기화 됬다.
		toPrint();
		//문제 1 ]
		// 친구 이름을 입력하면 친구의 정보만 출력하는 프로그램을 작성하세요
	}

	// 1단계 - 한사람 데이터를 만들어 보자. 출력까지 해보자.
	public void setOne() {
		// 객체만들고
		Person p1 = new Person();
		// 데이터 초기화하고
		p1.setData("홍길동", "010-4545-4545", "hong@increpas.com", 18, 'M');

		// 객체에서 변수 접근해서 출력해 보자.
		System.out.printf("이    름 : %3s\n전화번호 : %13s\n이 메 일 : %-25s\n나    이 :%3d\n성   별 : %2c", p1.name, p1.tel,
				p1.mail, p1.age, p1.gen);
	}

	// 전역변수의 데이터를 초기화 해주는 함수
	public void setArray() {
		name = new String[] { "아이유", "청하", "이효리", "유재석", "이광수" };
		tel = new String[] { "010-1111-2222", "010-2233-4455", "010-7788-9988", "010-5421-5566", "010-4581-5155" };
		mail = new String[] { "IU@gmail.com", "ChungHa@gmail.com", "LHL@gmail.com", "UJK@gmail.com", "Lee@gmail.com" };
		age = new int[] { 28, 25, 32, 38, 20 };
		gen = new char[] { 'F', 'F', 'F', 'M', 'M' };
	}

	// 다수의 친구의 정보를 저장해 보자.
	public void setMany() {
		//데이터 배열 초기화 해주고
		setArray();
		//친구배열 초기화 해주고 ==> 데이터 기억할 공간만 확보한 상태
		friend = new Person[gen.length];
		
		//친구 배열에 데이터 채워주고
		for(int i = 0 ; i<friend.length; i++) {
			//확보한 공간에 한개씩 인스턴스 채워주고
			friend[i] = new Person();
			
			//인스턴스의 변수에 데이터를 채워주고
			/*
			friend[i].name = name[i];
			friend[i].tel = tel[i];
			friend[i].mail = mail[i];
			friend[i].age = age[i];
			friend[i].gen = gen[i];
			*/
			friend[i].setData(name[i], tel[i], mail[i], age[i], gen[i]);
		
		}
	}
	//친구들 정보를 출력 해주는 함수
	public void  toPrint() {
		for(int i = 0; i < friend.length;i++)
		System.out.printf("이    름 : %3s\n전화번호 : %13s\n이 메 일 : %-25s\n나    이 :%3d\n성   별 : %2s\n", friend[i].name, friend[i].tel,
				friend[i].mail, friend[i].age, friend[i].gen == 'M' ? "남자":"여자");
		System.out.println("----------------------------------------------");
	}
	public static void main(String[] args) {
		new Test06();

	}

}

class Person {
	String name, tel, mail;
	int age;
	char gen;

	public void setData(String name, String tel, String mail, int age, char gen) {
		this.name = name;
		this.tel = tel;
		this.mail = mail;
		this.age = age;
		this.gen = gen;
	}
}