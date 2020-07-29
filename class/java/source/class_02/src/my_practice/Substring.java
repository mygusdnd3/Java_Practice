package my_practice;

public class Substring {

	public static void main(String[] args) {
		int idx = 0;
		String ss = "10/20/30/100/4000";
		String tmp = ss;
		String add;
		
		while(idx != -1) {
			
			
			//idx = ss.indexOf('/');
			
			
			idx = ss.indexOf('/',idx+1);
			//tmp = ss.substring(0, idx);
			String m = ss.substring(0,idx);
			//int idx2 = tmp.indexOf('/');
			//tmp = tmp.substring(0,idx);
			System.out.println(m);
		}

	} 

}
/*
	문제 3]
	
		5명의 학생의
		java, oracle, html, jsp
		점수를 입력 받아서
		총점과 석차를 구하는 프로그램을 작성하세요
		
		단, 입력, 총점계산, 석차계산, 출력은 함수를 작성해서
		처리하세요.


		10/50/80/90/
		//	indexOf(int ch, int fromIndex)
//	ch 		: 찾을 문자
//fromIndex : 찾을 시작위치
//단, 입력, 총점계산, 석차계산, 출력은 함수를 작성해서
//	처리하세요.
* 	  lastIndexOf(int ch)
  	뒤에서 부터 찾을 문자를 검색해서 해당 위치를 반환해준다.
* 
// 입력
*/