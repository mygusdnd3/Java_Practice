package tmp;

public class Day12Ex03 {

	public Day12Ex03() {
		//fromName();
		//nameAndId();
		
		setAll();
	}

	public static void main(String[] args) {
		new Day12Ex03();
	}

	public void fromName() {
		// 이름 입력해서 객체를 만들고 출력해보자.
		Members member = new Members("아이유");
		member.mno = 1001;
		member.id = "IUda";
		member.mail ="IU@gmail.com";
		
		System.out.println(member);
	}
	
	public void nameAndId() {
		//이름과 아이디를 입력하면 객체가 만들어 지게 한다.
		Members memb = new Members("김순자","SuunJa");
		System.out.println(memb);
		memb.mno = 1002;
		memb.mail = "suunja@gmail.com";
		System.out.println(memb);
	}
	
	public void setAll() {
		//모든 변수를 초기화 하면서 객체가 만들어지도록;
		Members member = new Members(1003,"김덕자","dukdukja","dukja@gmail.com");
		
		System.out.println(member);
		
		
	}

}
