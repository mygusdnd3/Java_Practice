package day19;

public class Test01 {

	public Test01() {
	}

	public static void main(String[] args) {

		Object obj = 10;
		/*
		 	먼저 리터럴 풀에 담긴 데이터를 클래스 타입으로 변형 시켜줘야 한다.
		 	int 타입이 ===>Integer 로 바뀌어야 한다.
		 	자동 형 변환이 된다.
		 		Integer ===> Object // Object다 더 크기때문에 자동으로 
		 */
		Object ojj = 20;
		int a = 12;
		int c = (int)obj;
		obj = a;
		
		Integer no = null;
		int no2;
		System.out.println(no2);
		
		
	}

}
