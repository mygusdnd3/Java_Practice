package my_practice;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/*
 	복습문제 1]
 		
 		친구 한명의 데이터를 기억할 클래스를 정의하고 
 		친구 세명의 데이터를 기억해서 
 		출력하는 프로그램을 작성하세요
 		
 		회원의 아이디를 입력하면 회원정보를 출력해주는 프로그램?
 		
 */
public class Ex02_backup {
	Member memb;
	FriendInfo[] fi;
	String[] name;
	String[] tel;
	String[] email;

	int[] age;
	char[] gen;

	public Ex02_backup() {
		setMember();
		setFriendInfo();
		toPrint();
		System.out.println();
	}

	public void setMember() {
		//Member member = new Member();
		name = new String[] { "아이유", "청하", "이효리", "유재석", "이광수" };
		tel = new String[] { "010-1111-2222", "010-2233-4455", "010-7788-9988", "010-5421-5566",
				"010-4581-5155" };
		email = new String[] { "IU@gmail.com", "ChungHa@gmail.com", "LHL@gmail.com", "UJK@gmail.com",
				"Lee@gmail.com" };
		age = new int[] { 28, 25, 32, 38, 20 };
		gen = new char[] { 'F', 'F', 'F', 'M', 'M' };

	}
	
	// Member 배열 만들기
	public void setMemb() {
		memb = new Member();
		for (int i = 0; i < age.length; i++) {
			memb.name[i] = 
		}
	}
	
	public void setFriendInfo() {
		FriendInfo[] fi = new FriendInfo[5];
		for (int i = 0; i < fi.length; i++) {
			fi[i] = new FriendInfo();
			fi[i].name = name[i];
			fi[i].tel = tel[i];
			fi[i].email = email[i];
			fi[i].age = age[i];
			fi[i].gen = gen[i];
			System.out.println(fi[i].gen);
		}
		
	}

	public void toPrint() {
		for (int i = 0; i < fi.length; i++) {
			System.out.println(fi[i].gen);
			
//			System.out.printf("이름 : %s 연락처 : %s 이메일 : %s 나이 : %d : 성별 : %c", fi[i].name, fi[i].tel, fi[i].email,
//					fi[i].age, fi[i].gen );//== ('M') ? "남자" : "여자"
		//	System.out.println(fi[i].age);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Ex02();
	}

}

class Member {

	String[] name;// = new String[] { "아이유", "청하", "이효리", "유재석", "이광수" };
	String[] tel;// = new String[] { "010-1111-2222", "010-2233-4455", "010-7788-9988",
					// "010-5421-5566", "010-4581-5155" };
	String[] email;// = new String[] { "IU@gmail.com", "ChungHa@gmail.com", "LHL@gmail.com",
					// "UJK@gmail.com",
//			"Lee@gmail.com" };
	int[] age;// = new int[] { 28, 25, 32, 38, 20 };
	char[] gen;// = new char[] { 'F', 'F', 'F', 'M', 'M' };
	
	public void arrInit(int cnt) {
		name = new String[cnt];
		tel = new String[cnt];
	}
}

class FriendInfo {

	String name, tel, email;
	int age;
	char gen;

	public void setData(String name, String tel, String email, int age, char gen) {
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.age = age;
		this.gen = gen;
	}
}
