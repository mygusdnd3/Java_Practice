package my_practice;

import java.util.*;
public class Day21Ex03 {
	ArrayList sort = new ArrayList();
	ArrayList list = new ArrayList();
	ArrayList stud = new ArrayList();
	public Day21Ex03() {
		list.add("둘리");
		list.add("고길동");
		list.add("도우너");
		list.add("또치");
		list.add("희동이");
		
		for (int i = 0; i < 5; i++) {
			stud.add(getStud((String)list.get(i)));
				getStud((String)list.get(i));//어우시발이거였어
		}
		
	}

	

public Comparator getComp(String sub) {
	
	Comparator c = null;
	
	switch(sub) {
	case "name":
		c = (Comparator)sort.get(0);
		break;
	case "total":
		c = (Comparator)sort.get(1);
		break;
	case "java":
		c = (Comparator)sort.get(2);
		break;
	case "db":
		c = (Comparator)sort.get(3);
		break;
	case "web":
		c = (Comparator)sort.get(4);
		break;
	case "jsp":
		c = (Comparator)sort.get(5);
		break;
	}
	return c;
}

public Stud getStud(String name) {
	Stud s = new Stud();
	s.setName(name);
	ArrayList score = new ArrayList();
	for(int i = 0 ; i < 4; i++) {
		
		score.add((int)(Math.random()*41+60));
	}
	s.setJava((int)score.get(0));
	s.setDb((int)score.get(0));
	s.setWeb((int)score.get(0));
	s.setJsp((int)score.get(0));
	s.setTotal();
	
	return s;
}

public static void main(String[] args) {

}

}