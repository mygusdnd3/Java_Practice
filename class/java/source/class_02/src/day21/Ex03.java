package day21;

/*
 	학생의 시험 점수를 관리할 클래스를 정의해서
 		이름, JAVA, DB, WEB, JSP, TOTAL 을 입력해서
 		데이터를 완성하고 
 		ArrayList에 5명의 데이터를 추가하고
 		출력하고
 		
 		총점을 기준으로 정렬하고
 		출력하고
 		
 		자바 점수를 기준으로 정렬하고
 		출력하고
 		
 */
import java.util.*;

import javax.swing.JOptionPane;

public class Ex03 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Ex03() {

		ArrayList list = new ArrayList();
		list.add("고길동");
		list.add("동아리");
		list.add("이태리");
		list.add("리어카");
		list.add("카센타");

		ArrayList result = new ArrayList();
		for (int i = 0; i < 5; i++) {
			result.add(setStud((String)list.get(i)));
			
		}

		
		
		boolean bool = true;
		while (bool) {
			String ScoreCheck = JOptionPane.showInputDialog("정렬 방식을 선택하세요 \n JAVA /DB/WEB/JSP/TOTAL");
			if (ScoreCheck.equals("TOTAL") | ScoreCheck.equals("total")) {
				System.out.println("토탈 점수에 대한 정렬 결과입니다");
				Collections.sort(result);
				for (Object o : result) {
					System.out.println(o);
				}
			} else if (ScoreCheck.equals("JAVA") | ScoreCheck.equals("java")) {
				System.out.println("자바에 대한 정렬 결과입니다.");
				Collections.sort(result, new Comparator() {

					@Override
					public int compare(Object o1, Object o2) {
						Stud_Class std1 = (Stud_Class) o1;
						Stud_Class std2 = (Stud_Class) o2;
						int res = std1.getJava() - std2.getJava();
						return res > 0 ? 1 : -1;
					}

				});
				for (Object o : result) {
					System.out.println(o);
				}
			} else if (ScoreCheck.equals("db") | ScoreCheck.equals("db")) {
				System.out.println("DB 점수에 대한 정렬 결과입니다");
				Collections.sort(result, new Comparator() {

					@Override
					public int compare(Object o1, Object o2) {
						Stud_Class std1 = (Stud_Class) o1;
						Stud_Class std2 = (Stud_Class) o2;
						int res = std1.getDb() - std2.getDb();
						return res > 0 ? 1 : -1;
					}

				});
				for (Object o : result) {
					System.out.println(o);
				}
			} else if (ScoreCheck.equals("WEB") | ScoreCheck.equals("web")) {
				System.out.println("WEB 점수에 대한 정렬 결과입니다");
				Collections.sort(result, new Comparator() {
 
					@Override
					public int compare(Object o1, Object o2) {
						Stud_Class std1 = (Stud_Class) o1;
						Stud_Class std2 = (Stud_Class) o2;
						int res = std1.getWeb() - std2.getWeb();
						return res > 0 ? 1 : -1;
					}

				});
				for (Object o : result) {
					System.out.println(o);
				}
			} else if (ScoreCheck.equals("JSP") | ScoreCheck.equals("jsp")) {
				System.out.println("JSP 점수에 대한 정렬 결과입니다");
				Collections.sort(result, new Comparator() {

					@Override
					public int compare(Object o1, Object o2) {
						Stud_Class std1 = (Stud_Class) o1;
						Stud_Class std2 = (Stud_Class) o2;
						int res = std1.getJsp() - std2.getJsp();
						return res > 0 ? 1 : -1;
					}

				});
				for (Object o : result) {
					System.out.println(o);
				}
			}
			
			else {

				JOptionPane.showMessageDialog(null, "잘못 입력하셨습니다.");
				bool = false;
			}

		}

	}
	public Comparator getComp(String sub) {
		Comparator c = null;
		switch(sub){
			case "name":
				c = (Comparator)sort.get(0);
				break;
			case "total":
				
				break;
			case "name":
				
				break;
			case "name":
				
				break;
			case "name":
				
				break;
			case "name":
				
				break;
		}
		return c;
	}

	Stud_Class setStud(String name) {
		Stud_Class stud = new Stud_Class();
		stud.setName(name);
		ArrayList score = new ArrayList();
		for(int i = 0; i <4; i++) {
			score.add((int) (Math.random() * 100 - 1 + 1) + 1);
		}
		stud.setJava((int)score.get(0));
		stud.setDb((int)score.get(1));
		stud.setWeb((int)score.get(2));
		stud.setJsp((int)score.get(3));
		stud.setTotal();
		/*
		stud.setJava((int) (Math.random() * 100 - 1 + 1) + 1);
		stud.setDb((int) (Math.random() * 100 - 1 + 1) + 1);
		stud.setWeb((int) (Math.random() * 100 - 1 + 1) + 1);
		stud.setJsp((int) (Math.random() * 100 - 1 + 1) + 1);
		stud.setTotal();
*/
		return stud;

	}

	public static void main(String[] args) {
		new Ex03();
	}

}
