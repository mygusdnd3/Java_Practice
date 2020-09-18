package day07;

/*
 *  정수 5개를 저장할 배열 3개를 만들어서
 *  첫번째 배열에는 랜덤하게 사각형의 가로의 길이를 만들어서 기억시키고
 *  두번째 배열에는 랜덤하게 사각형의 세로의 길이를 만들어서 기억시키고
 *  세번째 배열에는 랜덤하게 만든 배열의 각 인덱스의 가로 세로의 길이로 면적을 계산해서저장할
 *  배열을 만들고, 출력해주세요.
 *  
 *  출력 형식 : 
 *  	
 *         첫번째 사각형 : 가로 - xx | 세로 - xx | 넓이 - xxx
		   첫번째 사각형 : 가로 - xx | 세로 - xx | 넓이 - xxx
		   첫번째 사각형 : 가로 - xx | 세로 - xx | 넓이 - xxx
		   첫번째 사각형 : 가로 - xx | 세로 - xx | 넓이 - xxx
		   첫번째 사각형 : 가로 - xx | 세로 - xx | 넓이 - xxx
 */
public class Ex02 {

	public static void main(String[] args) {
		// 1. 1차원 배열 세개를 만든다. garo, sero, area
		
		int[] garo = new int[5];
		int[] sero = new int[5];
		int[] area = new int[5];
		// 2. 만들어진 가로 세로 배열에 랜덤하게 데이터를 생성해서 집어넣는다.
		
		
		for(int i = 0; i<garo.length;i++) {
			int randNum = (int)(Math.random()*100);
			garo[i] = randNum;
		}
		for(int i = 0; i<sero.length;i++) {
			int randNum = (int)(Math.random()*100);
			sero[i] = randNum;
		}
		
		// 3. 면적을 계산해서 area 배열에 집어 넣는다.
		
		for(int i =0 ; i<5; i++) {
			area[i] = (sero[i]*garo[i]);
		}
		
		// 4. 출력한다.
		
		
		
		
		

		
		//가로를 저장할 배열 변수
		int[] garo_ = new int[5];
		int[] sero_ = new int[5];
		int[] area_ = new int[5];
		
		//가로 랜덤하게 다섯개 만들어서 저장
		for(int i = 0; i<5; i++) {
			int no = (int)(Math.random() * 90 + 10); //0부터 89까지나오고 거기다 10더해주면 10부터 99까지나온다
			garo_[i] = no;
		}
		
		// 세로 랜덤하게 다섯개 만들어서 저장
		for(int i = 0; i<5; i++) {
			int no = (int)(Math.random() * 90 + 10); //0부터 89까지나오고 거기다 10더해주면 10부터 99까지나온다
			sero_[i] = no;
		}
		
		// 면적 계산하기
		for(int i = 0; i<area.length; i++) {
			int myunjuk = garo_[i]*sero_[i];
			area_[i] = myunjuk;
		}
		// 출력하기
		for(int i = 0 ; i < area.length; i++) {
			System.out.printf("사각형 %d : 가로 - %2d, 세로 - %2d, 면적 - %4d \n", (i+1),garo_[i],sero_[i],area_[i]);
		}
				
		
		System.out.println("#################################3");
		
		// 2차원 배열에 담기
		int[][] sagak = new int[3][5];
		
		sagak[0] = garo_;
		sagak[1] = sero_;
		sagak[2] = area_;
		
		// 출력
		/*for(int i = 0 ; i< sagak[0].length; i++) {
			for(int j = 0; j< sagak.length; j++) {
				System.out.printf("사각형 %d : 가로 - %2d, 세로 - %2d, 면적 - %4d \n", (i+1),sagak[j][i],sagak[j][i],sagak[j][i]);
			}
		}*/
		for(int i = 0 ; i< sagak[0].length; i++) {
			System.out.printf("사각형 %d : 가로 - %2d, 세로 - %2d, 면적 - %4d \n", (i+1),sagak[0][i],sagak[1][i],sagak[2][i]);
		}
		
	}

}
