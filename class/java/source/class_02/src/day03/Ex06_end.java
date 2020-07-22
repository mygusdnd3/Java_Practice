package day03;

public class Ex06_end {
	public static void main(String[] args) {
		int content = (int)(Math.random()+1000);
		
		int page =  (content % 15 != 0)? (content / 15 +1)
					:
						(
								(content == 0) ? 1:content/15
								)
						;
		
		System.out.printf("랜덤하게 발생된 게시물 수 %3d 개는 %2d 개의 게시판이 필요합니다", content, page);
						
	}
}
