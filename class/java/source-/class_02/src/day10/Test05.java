package day10;


/*
 	 전역 변수 컨트롤하기
 	 
 	 정수 배열 변수를 만들고
 	 그 변수의 내용을 수정해 보자
  
 */
public class Test05 {

	int[] num;
	public Test05() {
		/*
		// 1.
		num = initNum(5);
		*/
		initNum(5);
		
		//배열 내용 채우고
		setNum();
		// 출력하고
		toPrint();
		
	}
	//배열 변수 초기화 함수
	/*
	public int[] initNum(int cnt) {
		return new int[cnt];
	}
	*/
	public void initNum(int cnt) {
		
		num = new int[cnt];
		
	}
	// num 에 1~5까지 숫자를 채우는 함수.
	public void setNum() {
		int len = num.length;
		for(int i = 0 ; i< len; i++) {
			num[i] = i+1;
		}
	}
	
	// 정수 배열 내용 출력
	public void toPrint() {
		System.out.println("*** 정수 배열 num의 내용***");
		System.out.print("| ");
		for(int i = 0 ; i < num.length; i++) {
			System.out.print(num[i]+ " | ");
		}
		System.out.println();
		System.out.println("---------------------------");
	}
	public static void main(String[] args) {
		new Test05();

	}

}
