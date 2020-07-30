package day11;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/*
 	복습문제 1]
 		
 		친구 한명의 데이터를 기억할 클래스를 정의하고 
 		친구 세명의 데이터를 기억해서 
 		출력하는 프로그램을 작성하세요
 		
 		회원의 아이디를 입력하면 회원정보를 출력해주는 프로그램?
 		
 */
public class Ex02 {
	Member member; 
	FriendInfo[] fi;

	int[] age;
	char[] gen;

	
	public Ex02() {
		//setMember();
		setFriendInfo();
		//toPrint();
		
	}

	public void setMember() {
//		Member member = new Member(); === 클래스 내부 배열에 접근이 되네?
		member.name = new String[] { "아이유", "청하", "이효리", "유재석", "이광수" };
		member.tel = new String[] { "010-1111-2222", "010-2233-4455", "010-7788-9988", "010-5421-5566",
				"010-4581-5155" }; 
		member.email = new String[] { "IU@gmail.com", "ChungHa@gmail.com", "LHL@gmail.com", "UJK@gmail.com",
				"Lee@gmail.com" };
		member.age = new int[] { 28, 25, 32, 38, 20 };
		member.gen = new char[] { 'F', 'F', 'F', 'M', 'M' };
		System.out.printf(member.name[3]);
		System.out.println(member.age[2]);
		System.out.println(member.email[1]);
		
//		FriendInfo[] fi = new FriendInfo[5];
//		for (int i = 0; i < fi.length; i++) {
//			fi[i] = new FriendInfo();
//			fi[i].setData(member.name[i], member.tel[i], member.email[i], member.age[i], member.gen[i]);
//		}
	}

	public void setFriendInfo() {
		member = new Member();
		setMember();
		FriendInfo[] fi = new FriendInfo[5];
		for (int i = 0; i < fi.length; i++) {
			fi[i] = new FriendInfo();
			fi[i].setData(member.name[i], member.tel[i], member.email[i], member.age[i], member.gen[i]);
			System.out.printf("이름 : %s 연락처 : %s 이메일 : %s 나이 : %d : 성별 : %s", fi[i].name, fi[i].tel, fi[i].email,
					fi[i].age, fi[i].gen == ('M') ? "남자" : "여자");
		}
		
//		for (int i = 0; i < fi.length; i++) {
//			
//		}
	}

	public void toPrint() {
		for (int i = 0; i < fi.length; i++) {
			System.out.printf("이름 : %s 연락처 : %s 이메일 : %s 나이 : %d : 성별 : %s", fi[i].name, fi[i].tel, fi[i].email,
					fi[i].age, fi[i].gen == ('M') ? "남자" : "여자");
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
