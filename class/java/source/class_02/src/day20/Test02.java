package day20;

/*
 	Calender 클래스를 이용해서 현재 시간을 출력해 보자
 */

import javax.swing.*;
import java.util.*;
import static java.util.Calendar.*;
public class Test02 {

	public Test02() {
		Calendar cal =Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;// 이 함수도 역시 반환값이 0~11의 정수를 반환해준다. 따라서 1을 더해주어야 한다.
		int day = cal.get(DAY_OF_MONTH);
		int yoil = cal.get(DAY_OF_WEEK);	//1~7 일~토
		System.out.println("오늘 날짜 : "+year +" 년 "+month+" 월 "+day+" 일 " +getYoil(yoil));
	}
	
	public String getYoil(int day) {
		String yoil = "일요일";
		switch (day-1) {
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
		new Test02();
	}

}
