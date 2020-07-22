package day05;

//구구단을 출력해 보자
public class service01 {
	public static void main(String[] args) {

		for (int dan = 2; dan < 10; dan++) {
			System.out.println("\t *** " + dan + " 단 ***");
			for (int i = 0; i < 9; i++) {

				System.out.printf("\t%2d x %2d = %2d\n", dan, i, dan * i);
			}
			System.out.print("\n");
		}
	}

}
