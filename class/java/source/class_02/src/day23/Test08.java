package day23;

import day23.source.*;
import java.util.*;
public class Test08 {

	/*
	 	제너릭스의 와일드카드
	 		어떤 함수가 제너릭 선언된 컬렉션을 매개변수로 받을 때
	 		자기 자신 이외의 다른 클래스로 제네릭 선언된 것도 받을 수 있도록 해 놓은것.
	 */
	public Test08() {
		ArrayList<Figure> list1  = new ArrayList<Figure>();
		int no1 = (int)(Math.random()*13+3);
		int no2 = (int)(Math.random()*13+3);
		Semo semo = new Semo(no1,no2);
		Nemo nemo = new Nemo(no1,no2);
		
		list1.add(semo);
		list1.add(nemo);
		
		for(int i = 0; i< list1.size(); i++) {
			Figure f1 = list1.get(i);
			// list에 입력되는 데이터는 Figure로 한정시켜 놓았고
			//Figure의 멤버는 getArea()만 존재하므로 이멤버만 사용하다.
			if(f1 instanceof Semo) {
				Semo sm1 = (Semo)f1;
				//System.out.println(sm1.geta);
			}
		}
		ArrayList<Semo> list2 = new ArrayList<Semo>();
		fonc04(list1);
		fonc01(list1);
		func03(list2);
		func02(list2);
	}

	public void abcd() {
		
	}
	
	public void func02(ArrayList<? extends Figure>list) {
		/*
		 	이 함수는 Figure 로 제네릭 선언된 ArrayList와
		 	그 하위 클래스로 제네릭 선언된 것을 매개변수로 받을 수 있다. 
		 */
	}
	public void func03(ArrayList<? super Nemo>list) {
	/*
	 	이 함수는 반드시 Nemo 타입으로 제네릭 선언된ㄱ ㅓㅅ과
	 	그 상위 클래스로 제네릭 선언된 것을 매개변수로 받을 수 있다.
	 */
	}
	public void fonc04(ArrayList<?> list) { // 모든 제네릭으로 선언된 list를 모두 받는다.
		
	}
	//ArrayList<Figure>를 매개변수로 요구하는 함수
	public void fonc01(ArrayList<Figure> list) {
		
	}

	public static void main(String[] args) {
		new Test08();
	}

}
