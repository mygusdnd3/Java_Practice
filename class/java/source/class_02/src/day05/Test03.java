package day05;

//구구단 5단을 출력해 보자
public class Test03 {
	public static void main(String[] args) {
		
		int dan = 5;
		for(int i = 0; i<9; i++) {
			System.out.println(dan+"*"+ (i+1) + " = "+(dan*(i+1)));
		}
		
	}
}
