package day12;

import javax.swing.*;
public class Test02 {
	public Test02() {
		Member m = new Member(); // 메모리에 먼저 올리고
		Member[] memb = m.getMembers();

		// 한사람 데이터만 출력한다.
		//m.toPrint("김광현", memb);
		
		
		//모든사람의 정보를 출력해보자
		/*
		for (int i = 0; i < memb.length; i++) {
			memb[i].toPrint();
		}
		*/ //직접 출력
		
		m.toPrint(memb); // 함수를 이용해 출력
		System.out.println();
		
		// 회원번호를 입력받는다.
		String sno = JOptionPane.showInputDialog("회원 번호를 입력하세요");
		//정수 데이터로 변환해주고
		int mno = Integer.parseInt(sno);
		m.toPrint(mno, memb);
	}

	public static void main(String[] args) {
		new Test02();
	}

}

class Member {
	int mno;
	String id, name, mail, tel;
	char gen;

	// 5명의 회원을 저장한 배열을 반환해주는 함수
	public Member[] getMembers() {
		Member[] mArr = new Member[5]; // 데이터를 기억할 공간만 만들어놓은 상태다

		String[] names = getNames();
		String[] ids = getIds();
		String[] mails = getMails();
		String[] tels = getTels();
		char[] gens = getGens();
		// 회원번호는 1001부터 순차적으로 증가시켜 만들어 주는것으로 한다.
															
		for (int i = 0; i < names.length; i++) {
			mArr[i] = new Member();// 데이터를 기억할 각 공간에 반복해서 넣어준다 i번지에다가
			// 회원번호입력
			mArr[i].mno = 1001 + i;
			// 회원 이름 입력
			mArr[i].name = names[i];
			mArr[i].id = ids[i];
			mArr[i].mail = mails[i];
			mArr[i].tel = tels[i];
			mArr[i].gen = gens[i];

		}
		// 배열 넘겨주고
		return mArr;

		/*
		 * for(int i = 0; i< getNames().length;i++) { //**배열이들어간다 names의 배열리턴 mArr[i] =
		 * new Member(); // 데이터를 기억할 각 공간에 반복해서 넣어준다 i번지에다가 }
		 * 
		 */

	}

	// 길이를 입력하면 회원 배열을 반환해주는 함수
	public Member[] getMembers(int len) {
		Member[] mArr = new Member[len];

		return mArr;

	}

	// 회원 이름 배열 반환해주는 함수
	public String[] getNames() {
		String[] names = { "아이유", "선미", "화사", "유병재", "김광현" };

		return names;
	}

	// 회원 전화번호들을 배열로 반환해주는 함수
	public String[] getTels() {
		return new String[] { "010-1111-2222", "010-2233-4455", "010-7788-9988", "010-5421-5566", "010-4581-5155" };

	}

	// 회원들 메일을 배열로 반환해주는 함수
	public String[] getMails() {
		return new String[] { "IU@gmail.com", "ChungHa@gmail.com", "LHL@gmail.com", "UJK@gmail.com", "Lee@gmail.com" };

	}

	// 회원 성별을 배욜로 반환해주는 함수
	public char[] getGens() {
		return new char[] { 28, 25, 32, 38, 20 };
	}

	// 회원 아이디를 배열로 반환해 주는 함수
	public String[] getIds() {
		return new String[] { "IU", "ChungHa", "LHL", "UJK", "Lee" };
	}

	// 회원 이름을 입력하면 회원 정보를 출력해 주는 함수 ***
	public void toPrint(String name, Member[] memb) { // 배열을 전역으로 안써서..
		for (int i = 0; i < memb.length; i++) {
			if (name.equals(memb[i].name)) {
				System.out.println("-----------------------------------------------------");
				System.out.println("-------------------" + name + " 님 정보------------------");
				System.out.printf("회원번호 : %5d\n이    름 : %3s\n아 이 디 : %-15s\n전화번호 : %13s\n이 메 일 : %-25s\n성   별 : %2c",
						memb[i].mno, memb[i].name, memb[i].id, memb[i].tel, memb[i].mail, memb[i].gen);
				System.out.println("-----------------------------------------------------");
			}
		}
	}

	// 회원정보를 출력해 주는 함수
	public void toPrint(Member[] memb) {
		for(int i = 0; i<memb.length; i++) {
			Member m = memb[i];
			m.toPrint(); // 밑에 회원들정보
		}
	}

	// 회원들정보를 출력해 주는 함수
	public void toPrint() {
		System.out.printf("회원번호 : %5d\n이    름 : %3s\n아 이 디 : %-15s\n전화번호 : %13s\n이 메 일 : %-25s\n성   별 : %2c", mno, name,
				id, tel, mail, gen);
		System.out.println("-----------------------------------------------------");
	}
	public void toPrint(int mno, Member[] memb) {
		for(int i = 0; i< memb.length; i++) {
			if(memb[i].mno == mno) {
				memb[i].toPrint();
			}
		}
		
	}
}
