package day11;

public class Test06_01 {
	
	public Test06_01() {
		
	}
	//한사람용 데이터
	public void setOne() {
		//객체화
		Person p1 = new Person();
		
		//데이터 초기화
		p1.setData("홍길동", "010-5465-8748", "hongs@gmail.com", 18, 'M');
		
		//객체에서 변수에 접근
		System.out.printf("이름 \t :%3d\n전화번호\t :%13s\n이메일 \t :%-25s\n나이\t : %3d\n성별\t :%c"
						,p1.name,p1.tel,p1.mail,p1.age,p1.gen);
	}
	
	public static void main(String[] args) {
		new Test06_01();
	}
}


class Person{
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