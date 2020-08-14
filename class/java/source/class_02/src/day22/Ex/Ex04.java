package day22.Ex;

import java.util.*;

import javax.swing.JOptionPane;

import day22.source.*;

/*
	문제 4 ]
	1.
		학생의 점수를 관리할 클래스(Stud)를
			name, java, db, web, jsp, total
		이라는 변수를 가지는 클래스로 정의하고
		
		학생 이름을 키값으로 하고 학생 클래스의 객체를 입력해서 
		학생의 이름과 총점을 출력하는 프로그램을 작성하세요.
		
	2.
		학생의 이름을 입력하면 
		학생의 정보를 출력해주는 프로그램을 작성하세요.
	
 */
public class Ex04 {
	HashSet names;

	public Ex04() {
		names = new HashSet();
		setNames();
		TreeMap map = new TreeMap();

		ArrayList list = new ArrayList(names);

		Stud[] stud = new Stud[5];
		for (int i = 0; i < 5; i++) {
			stud[i] = new Stud((String) list.get(i));
			int java = (int) (Math.random() * 100 - 1 + 1) + 1;
			int db = (int) (Math.random() * 100 - 1 + 1) + 1;
			int web = (int) (Math.random() * 100 - 1 + 1) + 1;
			int jsp = (int) (Math.random() * 100 - 1 + 1) + 1;
			stud[i].setScore(java, db, web, jsp);
			map.put(list.get(i), stud[i].toString());

		}

		Iterator itor = names.iterator();
		int i = 0;
		while (itor.hasNext()) {
			Object o = itor.next();
			System.out.println(map.get(o));
		}
	
		String find = JOptionPane.showInputDialog("찾고자 하는 학생의 이름을 입력하세요");
		
		String c = "";
		switch (find) {
		case "이시대의현자":
			c = "이시대의현자";
			break;
		case "초록괴물":
			c = "초록괴물";
			break;
		case "또라이":
			c = "또라이";
			break;
		case "빨간코괴물":
			c = "빨간코괴물";
			break;
		case "길동이아들래미":
			c = "길동이아들래미";
			break;
		}
		JOptionPane.showMessageDialog(null, map.get(c));
		
		
	}

	public void setNames() {
		names.add("이시대의현자");
		names.add("초록괴물");
		names.add("또라이");
		names.add("빨간코괴물");
		names.add("길동이아들래미");
	}

	public static void main(String[] args) {
		new Ex04();
	}

}
