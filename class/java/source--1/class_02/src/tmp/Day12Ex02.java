package tmp;//

import java.util.Arrays;

import tmp.Stud;

public class Day12Ex02 {

	public Day12Ex02() {
		//setOne();
		//setThree();
		setThree(5);
	}

	public static void main(String[] args) {
		new Day12Ex02();
	}
	
	// 한명의 데이터 만들고 출력하기
	public void setOne() {
		int java = (int)(Math.random() * (95-70+1)+70);
		int oracle = (int)(Math.random() * (95-70+1)+70);
		int html = (int)(Math.random() * (95-70+1)+70);
		int jsp = (int)(Math.random() * (95-70+1)+70);
		//한명 성적데이터를 만들고
		Stud student = new Stud(java,oracle,html, jsp);
		System.out.println(student);
		//클래스의 주소를 호출하게되면
		//toString() 함수를 출력하게된다.
		//오브젝트가 가지고 있는 함수인데
		//그 함수를 고쳐서 썼다 그래서 Overriding이라고 표현한다.
		//zmffotm dlfmaaks TMrhtlvek cnffurdp rmf
		//출력에 클래스 이름만 쓰고싶다 그럼 클래스에다가 toString함수를 정의해야한다.
		//형식은 public String toString(){}으로 무조건 써야한다.
		//반환값은 무조건 String 접근지정자 무조건 public
	}
	
	public Stud[] SetOne(Stud students[], int idx) {
		int java = (int)(Math.random()*26 + 70);
		int oracle = (int)(Math.random()*26 + 70);
		int html = (int)(Math.random()*26 + 70);
		int jsp = (int)(Math.random()*26 + 70);
		
		// 한명 성적데이터 만들고
		Stud student = new Stud(java, oracle, html, jsp);
		
		students[idx] = student;
		
		return students;
	}	
	// 3명의 데이터를 만들고 출력해보자.
	public void setThree() {
		//세명의 점수가 필요하므로, 배열로 만들어 처리한다.
		Stud[] students = new Stud[3]; //방만 세개 만들어놨다.
		
		for(int i = 0; i < students.length ; i++) {
			int java = (int)(Math.random() * (95-70+1)+70);
			int oracle = (int)(Math.random() * (95-70+1)+70);
			int html = (int)(Math.random() * (95-70+1)+70);
			int jsp = (int)(Math.random() * (95-70+1)+70);
			students[i] = new Stud(java, oracle, html, jsp);
			students = SetOne(students, i);
		}
		
		
		//출력한다.
		for(Stud st : students) {
			System.out.println(st);
		
		}
	}
	
	
	public void setThree(int idx) {
		Stud[] studends = new Stud[idx];
		
		for (int i = 0; i < studends.length; i++) {
			int java = (int)(Math.random() * (95-70+1)+70);
			int oracle = (int)(Math.random() * (95-70+1)+70);
			int html = (int)(Math.random() * (95-70+1)+70);
			int jsp = (int)(Math.random() * (95-70+1)+70);
			//한명 성적데이터를 만들고
			Stud student = new Stud(java,oracle,html, jsp);
			System.out.println(student);
		}
			
	}
}
