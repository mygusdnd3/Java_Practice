package day14;


/*
 	문제 1]
 	10개의 데이터를 기억할 배열을 만드는데.
 	1~15까지의 수를 랜덤하게 발생시켜서
 	나머지가 0이면 문자열을		" 문자열"이라고 입력하고
 	나머지가 1이면 정수 100을 입력하고
 	나모지가 2이면 영문자를 랜덤하게 입력하고
 	나머기자 3이면 실수를 2.0 ~ 7.0까지 랜덤하게 만들어서 입력한다
 	
 	그리고 
 	꺼내서 출력하는데
 	꺼낸 데이터가 
 		문자열이면 "문자열 데이터" 로
 		정수면 25를 더한 정수를
 		영문자면 대소문자를 바꿔서
 		실수면 소수 세째자리에서 반올림해서
 		
 		 출력하세요
 		 
 		 //력하는 평균값은 소수 셋째 자리에서 반올림하여 출력합니다. %0.2f를 사용하
[출처] 소수점 셋째 자리에서 반올림|작성자 Jess


 */
import static java.lang.Math.*;

import java.util.Arrays;
public class Ex01 {
	
	public Ex01() {
		start();
		
		
	}
	
	public void start() {
	// 배열 10개짜리생성
	Narr[] nArr = new Narr[10];
	
//	1~15까지의 수를 랜덤하게 발생시켜서
	loop:
	for (int i = 0; i < nArr.length; i++) {
		nArr[i] = new Narr();
		int tmp = (int)(random()* 15 -1 +1)+1;
		int namuge = (int)(random()* 4+1-1)+1;
		if(tmp%namuge ==0 ) {
			
			nArr[i] = new Nstr("문자열");
		}else if(tmp%namuge == 1) {
			nArr[i] = new Iarr(100);
			
		}else if(tmp%namuge ==2) {
		char c  = (char) (random()*('z'-'A'-1)+'A');
		if(c>'Z'&&c<'a') {
			--i;
			continue loop;
		}
			nArr[i] = new Earr(""+c);
			System.out.println("발생한 문자 Check : "+c);
		}
		else if(tmp%namuge == 3) {
			nArr[i] = new Darr((random()*7-2+1)+2);
			
		}
	}
	
	for(int i = 0 ; i < nArr.length ; i++) {
		if(nArr[i] instanceof Nstr) {
			nArr[i].doSomeThing();
			nArr[i].toPrint();
			System.out.println("---------------");
		}else if(nArr[i] instanceof Iarr) {
			nArr[i].doSomeThing();
			nArr[i].toPrint();
			System.out.println("---------------");
		}else if(nArr[i] instanceof Earr) {
			nArr[i].doSomeThing();
			nArr[i].toPrint();
			System.out.println("---------------");
		}else if(nArr[i] instanceof Darr) {
			nArr[i].doSomeThing();
			nArr[i].toPrint();
			System.out.println("---------------");
		}
		
	}
	
//	그리고 
// 	꺼내서 출력하는데
// 	꺼낸 데이터가 
// 		문자열이면 "문자열 데이터" 로
// 		정수면 25를 더한 정수를
// 		영문자면 대소문자를 바꿔서
// 		실수면 소수 세째자리에서 반올림해서
// 		
	
	
// 	나머지가 0이면 문자열을		" 문자열"이라고 입력하고
// 	나머지가 1이면 정수 100을 입력하고
// 	나모지가 2이면 영문자를 랜덤하게 입력하고
// 	나머기자 3이면 실수를 2.0 ~ 7.0까지 랜덤하게 만들어서 입력한다
	
	}
	public static void main(String[] args) {
		new Ex01();
	}

}
class Narr{
	public Narr() {
		
	}
	public void doSomeThing() {
		
	}
	public void toPrint() {
		System.out.println("뭔가잘못됨");
	}
}
class Nstr extends Narr{
	
	String str;
	public Nstr() {
		
	}
	public Nstr(String str) {
		this.str = str;
	}
	public void doSomeThing() {
		str = str+"데이터!";
	}
	
	public void toPrint() {
		System.out.println(str);
	}
}

class Iarr extends Narr{
	
	int i;
	public Iarr() {
		
	}
	public Iarr(int i) {
		this.i = i;
	}
	public void doSomeThing() {
		i = i+25;
	}
	
	public void toPrint() {
		System.out.println(i);
	}
}
class Earr extends Narr{
	String eng ;
	public Earr() {
		
	}
	public Earr(String eng) {
		this.eng = eng;
	}
	public void doSomeThing() {
		char c = eng.charAt(0);
		if(c > 'Z') {
			eng = eng.toUpperCase();
		}else {
			eng = eng.toLowerCase();
		}
		 
	}
	
	public void toPrint() {
		System.out.println(eng);
	}
}
class Darr extends Narr{
	double d;
	public Darr() {
		
	}
	public Darr(double d) {
		this.d = d;
	}
	public void doSomeThing() {
	
				//(d * 100)/100.0;
		
	}
		 
	public void toPrint() {
		System.out.println(Math.round(d*1000)/1000.0);
	}
}