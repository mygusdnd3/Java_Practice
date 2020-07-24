package day07;

/*
 	다섯 학생의 국어, 영어, 수학, 코딩, 총점을 관리할 배열을 만들고
 	랜덤하게 과목 점수를 만들어서 입력하고
 	총점을 계산하세요.
 	출력하세요
 	1.
 	각 과목의 배열을 만들고 점수를 입력해서 배열을 완성하고
 	2차원 배열로 합쳐서 처리하는 방법.
 	2.
 	2차원 전체 배열로 처리하는 방법
 	보너스 ] 
 		점수가 높은 사람부터 정렬해서 출력하세요
 	
 */
public class Ex03 {

	public static void main(String[] args) {
		int[] kor = new int[4];
		int[] eng = new int[4];
		int[] suhak = new int[4];
		int[] cod = new int[4];
		int[] sum = new int[5];

		for (int i = 0; i < sum.length; i++) {
			for(int j = 0; j<4;j++) {
				int num = (int) (Math.random() * 100 + 1);
				kor[j] = num;
				int num2 = (int) (Math.random() * 100 + 1);
				eng[j] = num2;
				int num3 = (int) (Math.random() * 100 + 1);
				suhak[j] = num2;
				int num4 = (int) (Math.random() * 100 + 1);
				cod[j] = num3;
				
			}
			System.out.println(i+"번"+"수학"+suhak[]);
		}
		
		System.out.println(cod[3]);
		System.out.println("*****");
	}

}
