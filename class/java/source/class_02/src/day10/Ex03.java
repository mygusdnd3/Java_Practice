package day10;

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
//		ch 		: 찾을 문자
//  fromIndex : 찾을 시작위치
//	단, 입력, 총점계산, 석차계산, 출력은 함수를 작성해서
//		처리하세요.
 * 	  lastIndexOf(int ch)
	  	뒤에서 부터 찾을 문자를 검색해서 해당 위치를 반환해준다.
 * 
	// 입력
 */
import javax.swing.JOptionPane;

public class Ex03 {

	// 1. 점수를 입력한다 10/20/30/40
	// 2. substring으로 점수를 빼서 총점을 계산
	// 3. 총점안에서 석차계산

	// 생성자 생략가능
	// public Ex03() {}



	public int pointSum(int[] arrScore) {

		int sumTotal = 0;
		for (int i = 0; i < arrScore.length; i++) {
			sumTotal += arrScore[i];
		}
		
		return sumTotal;
	}

	public void setPoint() {
		int[] totalArr = new int[5]; // 5명의 총점을 집어넣는다.
		for (int i = 0; i < totalArr.length; i++) {
			String str = JOptionPane.showInputDialog("점수를입력");
			// 10/20/30/40
			int startIdx = 0;
			int endIdx = 0;
			int[] arr = new int[4];
			int tempIdx = 0;

			while (endIdx != -1) {
				endIdx = str.indexOf("/", startIdx);
				System.out.println("endIdx => "+endIdx);
				String score = "";
				if (endIdx == -1) {
					score = str.substring(startIdx);

				} else {
					score = str.substring(startIdx, endIdx);
				} 
				arr[tempIdx] = Integer.parseInt(score);
				tempIdx++;
				startIdx = endIdx + 1 ;
			}
			
			
			//4과목의 SUM값을 totalArr i번지에 저장
			totalArr[i] = pointSum(arr);
			
			
		}
		int[] rankArr =	rank(totalArr);
		
		toPrint(rankArr); 
	}

	public int[] rank(int[] totalArr) {
		int temp = 0;
		for (int i = 0; i < totalArr.length; i++) {
			// System.out.println("totalArr[" + i + "] => " + totalArr[i]);
			for (int j = 0; j < totalArr.length - 1; j++) {
				if (totalArr[j] < totalArr[j + 1]) {
					temp = totalArr[j];
					totalArr[j] = totalArr[j + 1];
					totalArr[j + 1] = temp;
				}
			}
		}
		return totalArr;
		
		
	}
	
	public void toPrint(int[] rankArr) {
		
		for (int i = 0; i < rankArr.length; i++) {
			System.out.println((i + 1) + "등 => " + rankArr[i]);
		}
	}
	

	public void setPoint_backup() {
		int[] totalArr = new int[5]; // 5명의 총점을 집어넣는다.
		// 5명 돌림
		for (int i = 0; i < totalArr.length; i++) {
			String str = JOptionPane.showInputDialog("점수를입력");

			int sumTotal = 0;
			int startIdx = 0;
			int endIdx = 0;

			while (endIdx != -1) {
				endIdx = str.indexOf('/', startIdx + 1);

				String score = "";
				if (endIdx == -1) {
					score = str.substring(startIdx);
				} else {
					score = str.substring(startIdx, endIdx);
				}

				sumTotal += Integer.parseInt(score);

				// System.out.println("startIdx=> "+startIdx+ ", endIdx =>"+ endIdx +", score =>
				// " + score);
				// System.out.println("sumTotal => " + sumTotal);

				startIdx = endIdx + 1;
			}

			totalArr[i] = sumTotal;
		} // for문 End
		int temp = 0;
		for (int i = 0; i < totalArr.length; i++) {
			// System.out.println("totalArr[" + i + "] => " + totalArr[i]);
			for (int j = 0; j < totalArr.length - 1; j++) {
				if (totalArr[j] < totalArr[j + 1]) {
					temp = totalArr[j];
					totalArr[j] = totalArr[j + 1];
					totalArr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < totalArr.length; i++) {
			System.out.println((i + 1) + "등 => " + totalArr[i]);
		}

		/*
		 * 
		 * for (int i = 0; i < alpha.length-1; i++) { for (int j = 0; j < i; j++) if
		 * (alpha[i] > alpha[j]) { char tmp = alpha[i]; alpha[i] = alpha[j]; alpha[j] =
		 * tmp;
		 * 
		 * }
		 * 
		 * }
		 */
	}

	public static void main(String[] args) {
		Ex03 e = new Ex03();
		e.setPoint();
	}

}
