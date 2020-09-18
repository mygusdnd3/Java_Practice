package tmp;

public class Members {

	int mno;
	String name, id, mail;

	public Members() {

	}

	// 이름만 입력해도 객체가 만들어지도록..
	public Members(String name) {
		this.name = name;
	}

	// 이름과 아이디를 입력하면 객체가 만들어 지도록..
	public Members(String name, String id) {
		this.name = name;
		this.id = id;
	}

	// 회원번호, 이름, 아이디 , 메일을 모두 입력해야 객체가 만들어 지도록
	public Members(int mno, String name, String id, String mail) {
		this.mno  = mno;
		this.name = name;
		this.id = id;
		this.mail = mail;
	}
	public String toString() {
		return mno + " - " + name + " | " + id + " | " + mail;
	}

}
