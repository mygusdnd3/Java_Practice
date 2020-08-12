package day20;

/*
 	34567.8912
 	라는 숫자를 세자리마다 , 로 구분하고
 	소수점 이하는 3자리만 출력해 보자.
 */
import java.text.*;
public class Test03 {

	public Test03() {
		double num = 34567.8916;
		
		DecimalFormat form = new DecimalFormat("0,000,000.000");	//폼을 만들어준다.
		/*
		 	숫자의 형식을 지정할 때
		 		0 : 무효숫자 표현
		 		# : 무효숫자 표현 안함
		 */
		//문자열을 만든다.
		String str = form.format(num);
		
		//출력하기
		System.out.println("num  :" + num);
		System.out.println("결과 :" + str);
		//반올림이 자동으로 된다?
		//무효숫자는 안보이게 처리
		DecimalFormat form2 = new DecimalFormat("#,###,###.###");
		String str2 = form2.format(num);
		System.out.println("결과2:"+str2);
		}

	public static void main(String[] args) {
		new Test03();
	}

}
