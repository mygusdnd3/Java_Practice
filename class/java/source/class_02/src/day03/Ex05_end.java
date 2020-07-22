package day03;

public class Ex05_end {
	public static void main(String[] args) {
		
		char ch = (char)(Math.random() *(255 - 0) +1));
		
		char result = (ch >'A'&& ch<='Z')?
						(char)(ch + ('a' - 'A'))
						:
							(
									(ch >= 'a'&& ch<='z')?
											(char)(ch -('a'-'A')) : ch
									);
						
	System.out.printf("랜덤하게 발생한 문자 [ %c ] 는 < %c >로 변환된다.", ch, result);
							
							
							
	}
}
