package day06;
/*
반복문 문제
	문제 ]
	
	1	2	3	4	5     
	10	9	8	7	6 	 +10 -
	11	12	13	14	15   +1 -
	20	19	18	17	16	 +10
	21	22	23	24	25	 +1	
*/
public class Ex09 {
	public static void main(String[] args) {
		
		//12345 출력
		for(int i = 1; i <=5; i++ ) {
			
			for(int j = 0; j< 5; j++) {
				
				System.out.print((i*10)+(j)+"\t");
			}System.out.println();
				
		}
	}

}
