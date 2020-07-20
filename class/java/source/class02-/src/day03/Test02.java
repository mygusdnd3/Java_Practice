package day03;

//사용할 라이브러리 불러 오고 ..
import java.util.*;
public class Test02 {
	
	int num; 
	String ss;          //맴버  들   fields
	public void tt(){}
	public static void main(String[] args) {
		//입력 받을 준비를 하고
		
		Scanner sc = new Scanner(System.in);
		// 입력 메세지 출력하고
		System.out.print("이름을 입력하세요! : ");
		//입력 받은 이름 변수에 기억하고
		String name = sc.nextLine();
		//나이 입력을 받을 메세지 출력
		System.out.println("나이를 입력하세요! : ");
		//입력 받은 나이 변수에 기억하고
		int age = sc.nextInt();
		sc.close();
		//Scanner 종료
		//출력
		
		System.out.printf("입력된 사람은 [ %3s ] :  %3d \n", name, age);
		
		
		/*
		 * 	참고]
		 * 		Scanner 클래스도 시스템의 자원을 사용하는 클래스이므로
		 * 		더이상 사용하지 않으면 닫아 주는것이 원칙이다
		 * 
		 * 		닫는 명령은
		 * 			sc.close();
		 */
	}
}
