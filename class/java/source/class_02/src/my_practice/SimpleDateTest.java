package my_practice;

import java.text.*;
import java.util.*;

public class SimpleDateTest {

	public SimpleDateTest() {
	}

	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat form = new SimpleDateFormat("");
		SimpleDateFormat form1,form2,form3,form4,form5,form6,form7;
		
		form1 = new SimpleDateFormat("yyyy-MM-dd");
		form2 = new SimpleDateFormat("yy/MM/dd");
		form3 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		form4 = new SimpleDateFormat("HH:mm:ss");
		form5 = new SimpleDateFormat("hh:mm:ss a");
		form6 = new SimpleDateFormat("오늘은 yyyy년의 w주차이며 D번째 날");
		form7 = new SimpleDateFormat("오늘은 M월의 W번째 주, d 번째 날이고, F번째 E요일 입니다");
		
		System.out.println(form1.format(today));
		System.out.println(form2.format(today));
		System.out.println(form3.format(today));
		System.out.println(form4.format(today));
		System.out.println(form5.format(today));
		System.out.println(form6.format(today));
		System.out.println(form7.format(today));
		
		
		Calendar time1 = Calendar.getInstance();

		Calendar time2 = Calendar.getInstance();

		Calendar time3 = Calendar.getInstance();

		 

		time2.set(1982, 2, 19);

		time3.set(2020, 8, 13);

		 

		System.out.println(time1.before(time2));

		System.out.println(time1.before(time3));
	}

}
