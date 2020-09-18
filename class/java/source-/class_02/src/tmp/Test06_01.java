package tmp;

public class Test06_01 {
	Person[] friend;
	String[] name, tel, mail;
	int[] age;
	char[] gen;

	public Test06_01() {
		setOne();
		setMany();
		toPrint();
	}

	// 한사람용 데이터
	public void setOne() {
		// 객체화
		Person p1 = new Person();

		// 데이터 초기화
		p1.setData("홍길동", "010-5465-8748", "hongs@gmail.com", 18, 'M');

		// 객체에서 변수에 접근
		System.out.printf("이름  :%3s\n전화번호 :%13s\n이메일  :%-25s\n나이 : %3d\n성별 :%2s", p1.name, p1.tel, p1.mail, p1.age,
				p1.gen == ('M') ? "남자" : "여자");
//		System.out.printf("이    름 : %3s\n전화번호 : %13s\n이 메 일 : %-25s\n나    이 :%3d\n성   별 : %2c", p1.name, p1.tel,
//				p1.mail, p1.age, p1.gen);
	}

	// 전역변수의 데이터를 초기화 해주는 함수
	public void setArray() {
		name = new String[] { "아이유", "청하", "이효리", "유재석", "이광수" };
		tel = new String[] { "010-1111-2222", "010-2233-4455", "010-7788-9988", "010-5421-5566", "010-4581-5155" };
		mail = new String[] { "IU@gmail.com", "ChungHa@gmail.com", "LHL@gmail.com", "UJK@gmail.com", "Lee@gmail.com" };
		age = new int[] { 28, 25, 32, 38, 20 };
		gen = new char[] { 'F', 'F', 'F', 'M', 'M' };
	}

	public void setMany() {
		setArray(); // 					*****선언을 통한 초기화 안해해주면 하단에 Nul Exception 발생
		// 데이터 배열 초기화
		friend = new Person[gen.length]; // **** Person[] friend = new로 여기서 선언하면
											// 저위에 레퍼런스가 붕떠
											// 색상잘봐 노랭이야 전역은 파랭이

		// 친구 배열에 데이터 채워주고
		for (int i = 0; i < friend.length; i++) {

			// 인스턴스 생성

			friend[i] = new Person();
			// 인스턴스 변수에 데이터 적제 가 아니라 적제용 함수사용
			friend[i].setData(name[i], tel[i], mail[i], age[i], gen[i]);

		}

	}

	// 친구들 정보 출력해주는 함수

	public void toPrint() {
		friend[0].n
		for (int i = 0; i < friend.length; i++) { // 전역에 friend 레퍼런스가 없으면 길이못써..

			System.out.printf("이름  :%3s\n전화번호 :%13s\n이메일  :%-25s\n나이 : %3d\n성별 :%2s", friend[i].name, friend[i].tel,
					friend[i].mail, friend[i].age, friend[i].gen == ('M') ? "남자" : "여자");

		}
	}
	
	public void toFind() {
		String str = "홍길동";
		int idx= friend[0].name.indexOf(str);;
		
		friend[i].name;
		
	}
	public static void main(String[] args) {
		new Test06_01();
		
				
	}
}

class Person {
	String name, tel, mail;
	int age;
	char gen;

	// 클래스 내부의 변수들을 set 해주는 함수 작성
	public void setData(String name, String tel, String mail, int age, char gen) {
		this.name = name;
		this.tel = tel;
		this.mail = mail;
		this.age = age;
		this.gen = gen;
	}
}