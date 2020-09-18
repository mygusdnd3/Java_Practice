package day13;

public class Test06 {

	public Test06() {
		Member memb1 = new Member("아이유","IU","IU@Gmail.com");
		
		Member memb2 = new Member();// 홍길동으로 세팅됨
		 System.out.println(memb1);
		 System.out.println(memb2);
	}

	public static void main(String[] args) {
		new Test06();
	}

}

class Member {
	String name, id, mail;

	public Member() {
		
		/*
		/*(this.) name = "홍길동";
		id = "hong";
		mail = "hoang@gmail.com";
		*/
		
		//Member("홍길동","hong","Hong@gmail.com");
		this("홍길동","hong","Hong@gmail.com"); //this는 첫문장에 써야한다.
		//생성자 함수 호출
	}

	public Member(String name, String id, String mail) {
		this.name = name;
		this.id = id;
		this.mail = mail;
	}
	public String toString() {
		return name + " | " + id + " | " + mail;
	}
}