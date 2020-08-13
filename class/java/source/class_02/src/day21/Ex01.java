package day21;
/*
	삼각형부터
	기본정렬기준을 면적으로
	추가적읜 정렬을 Comparator를 구현한 클래스를 가지고 정렬을하세용
	그것까지되며는
	우리 학생 JAVA DB JSP 총점 을기준으로 기본적으로
	이후에 정렬할수있는방법이 다양해지잖아요
	그방법을 어떻게 쉽게 할수 있는지 구현하라 이말이야
*/

/*
 	ArrayList에
 	밑변과 높이를 랜덤하게 만들어서 삼격형을 만들고
 	그 삼ㄱ가형을 10개를 채우고 
 	출력하고
 	면적을 기준으로 출력하고,
 	밑변을 기준으로 정렬하고 
 	출력하고
 	높이를 기준으로 정렬하고 출력하고
 	
 		삼각형의 넓이는 : " + hight * bottom * 0.5);
		사각형의 넓이는 : " + hight * bottom);
		원 면적 area = rad * rad * PI
		원 둘레 arround = 2 * rad * PI;
 	
 */
import java.util.*;
public class Ex01 {

	
	ArrayList list = new ArrayList();
	public Ex01() {
		 
		for (int i = 0; i < 10; i++) {
		
			getSemo();
		}
		//출력하고
		System.out.println("1. 그냥 출력");
		for(Object o : list) {
			System.out.println(o);
		}
		//면적으로 정렬하고
		System.out.println("2. 면적으로 정렬");
		Collections.sort(list); 
		for(Object o : list) {
			System.out.println(o);
		}
		
		Collections.sort(list,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Semo semo1 =(Semo)o1;
				Semo semo2 =(Semo)o2;
				
				return (semo1.getBottom() - semo2.getBottom())>0?1:-1;
			}
			
		});
		System.out.println("3. 밑면으로 정렬");
		for(Object o : list) {
			System.out.println(o);
		} 
		// 높이으로 정렬하고
		
		System.out.println("4. 높이로 정렬");
		

		Collections.sort(list,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Semo semo1 =(Semo)o1;
				Semo semo2 =(Semo)o2;
				
				return (semo1.getHight() - semo2.getHight())>0?1:-1;
			}
			
		});//출력
		for(Object o : list) {
			System.out.println(o);
		}
		
		
	}
	void  getSemo() {
		
		int hight = (int)(Math.random()*20-1+1)+10;
		int bottom = (int)(Math.random()*20-1+1)+10;
		Semo semo = new Semo();
		semo.setHight(hight);
		semo.setBottom(bottom);
		semo.setArea();
		list.add(semo);
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
