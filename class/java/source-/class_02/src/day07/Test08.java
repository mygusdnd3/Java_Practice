package day07;

public class Test08 {

	public static void main(String[] args) {
		int[] no = {4,5,6};
		int[][] num = {{1,2,3},no};
		
		System.out.println(num[1][0]);
		
		
		no[0] = 9;
		System.out.println("no[0] :"+ no[0] +"|"+num[1][0]);
		
		// Heap에 만들어진 애들은 주소만 기억하기때문에 값이 같이 변경된다.
	}

}
