package day20;

import java.util.*;

public class Test01 {

	public Test01() {
		// 날짜 객체를 만든다.
		// 현재 시간을 출력한다 getMonth+1 이새낀 0월부터 시작
		for (int i = 0; i < 300; i++) {
			Date d = new Date(); // 객체를 만든 순간 정보를 저장한다 , 돌려도 하나만나옴
			System.out.println((d.getYear() + 1900) + "년" + (d.getMonth() + 1) + "월 " + d.getDate() + "일 " +getYoil(d.getDay()) +" Time "+d.getHours() 
					+ " : " + d.getMinutes() + " : " + d.getSeconds());
			// Date.getMonth+1 이새낀 0월부터 시작
			// 사용할때는 +1을 꼭 해줘야한다.

			/*
			 * 자바는 시간을 1900년 1월 1일 0시 0분 0 초 를 기준으로 밀리초 단위로 기억을 한다. 따라서 현재 2020년은 120년으로 기억을
			 * 한다 그래서 정확한 년도를 얻기를 원하면 1900을 더해줘야 한다.
			 * 
			 * getMonth() 함수의 반환값은 0부터 11까지 반환 따라서 정확한 월은 +1 해줘야 한다
			 * 
			 * getDay() 요일을 반환해주는 함수인데 반환값이 0~6까지의 정수를 반환해준다.
			 * 
			 * 0 : 일요일 1 : 월요일 ... 5 : 금요일 6 : 토요일
			 */
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	// 요일을 문자열로 반환해주는 함수
	public String getYoil(int day) {
		String yoil = "일요일";
		switch (day) {
		case 0:
			yoil = "일요일";
			break;
		case 1:
			yoil = "월요일";
			break;
		case 2:
			yoil = "화요일";
			break;
		case 3:
			yoil = "수요일";
			break;
		case 4:
			yoil = "목요일";
			break;
		case 5:
			yoil = "금요일";
			break;
		case 6:
			yoil = "토요일";
			break;
		}
		return yoil;
	}

	public static void main(String[] args) {
		new Test01();
	}

}
