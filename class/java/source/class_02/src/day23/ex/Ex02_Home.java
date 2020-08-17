package day23.ex;

/*
 	day23.source.Student
 	데이터를 이볅하는 맵의 문제 07을 TreeMap을 사용해서 처리하세요.......
 	1. 키값을 학생 번호로 하는 방법
 	2. 키값을 학생 이름으로 하는 방법
 */
import day23.source.*;
import java.util.*;

import javax.swing.JOptionPane;

public class Ex02_Home {

	List<Integer> noList;
	List<String> names;
	Map<Integer, Student> map1;
	Map<String, Student> map2;
	int[] score;
	
	public Ex02_Home() {
		IdolList sList = new IdolList();
		noList = sList.setNoList();
		names = sList.setNames();
		map1 = new TreeMap<Integer, Student>();
		for(int i = 0; i < noList.size(); i++) {
			map1.put(noList.get(i), new Student(noList.get(i),names.get(i),sList.setScore()));
		}
		map2 = new TreeMap<String, Student>();
		for(int i = 0; i < names.size(); i++) {
			map2.put(names.get(i), new Student(noList.get(i),names.get(i),sList.setScore()));
		}
		
		for(;;) {
			String sno = JOptionPane.showInputDialog("키값이 번호인 자료 출력은 1번 \n 키값이 이름인 자료형 출력은 2번 \n 종룐는 q를 입력하세요!");
			if(sno.equals("q")) {
				int qno = JOptionPane.showConfirmDialog(null, "프로그램을 종료하시겠습니까?", "종료 확인", JOptionPane.YES_NO_OPTION);
				if(qno == 0) {
					break;
				} else {
					continue;
				}
			}else if (sno.equals("1")) {
				getMap1();
			}else if (sno.equals("2")) {
				getMap2();
			}
		}
		


	}
	public void getMap1() {
		Set<Integer> set = map1.keySet();
		String msg = "";
		Iterator<Integer> itor = set.iterator();
		while(itor.hasNext()) {
			int no = itor.next();
			
			Student stud = map1.get(no);
			
			String name = stud.getName();
			int java = stud.getJava();
			int db = stud.getDb();
			int web = stud.getWeb();
			int jsp = stud.getJsp();
			int total = stud.getTotal();
			msg = msg +String.format("%-5d 번 학생 \n이름 : %-6s, java : %-3d, db : %-3d, web : %d, jsp :%3d, total : %4d\n", no,name,java,db,web,jsp,total);
			
			
		}
		JOptionPane.showConfirmDialog(null, msg);
	}

	public void getMap2() {
		Set<String> set = map2.keySet();
		String msg = "";
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			String name = itor.next();
			 
			Student stud = map2.get(name);

			int no = stud.getNo();
			int java = stud.getJava();
			int db = stud.getDb();
			int web = stud.getWeb();
			int jsp = stud.getJsp();
			int total = stud.getTotal();
			msg = msg +String.format("이름 :%-6s\n번호 : %-5d 번, java : %-3d, db : %-3d, web : %d, jsp :%3d, total : %4d\n", name,no,java,db,web,jsp,total);
			
		}
		JOptionPane.showConfirmDialog(null, msg);
	}
	public static void main(String[] args) {
		new Ex02_Home();
	}

}
