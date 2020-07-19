package day02;

public class Ex_Test_04 {

	public static void main(String[] args) {

		/*
		 * 1년은 365.2426일이다. 이 수치는 몇일, 몇시간, 몇분, 몇초인지 계산해서 출력하세요.
		 * 
		 * 힌트] 0.5일은 12시간이다. <24 * 0.5
		 */
//		double year = 365.2426;

//		System.out.println("1년 :"+year);
//		double time = year*24;
//		System.out.println("시간:" + time);
//		double min = time*60;
//		System.out.println("분 :"+min);
//		double sec = (min*60);
//		System.out.println("초 :"+ sec);
//		
		double year = 0.2426;
		System.out.println("계산할 일수 "+year);
		int daytime = 24;
		int hour = (int)(year*daytime); //몇시간
		System.out.println("시간 "+hour);
		int min = hour*60; //분
		System.out.println("분 " +min);
		int sec = min*60; //초
		System.out.println("초 "+sec);
		
		
		
		
		
		//		System.out.println(min);
//		double sec = min / 60;
//		System.out.println(sec);

	}

}
