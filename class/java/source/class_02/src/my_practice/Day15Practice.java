package my_practice;

import java.util.Arrays;
import java.util.Optional;

public class Day15Practice {

	public Day15Practice() {
	}

	public static void main(String[] args) {
		
		String str = null;//외부 입력값이 null로 들어 온 경우로 가정합니다.
		Optional<String> strOptional = Optional.ofNullable(str);
		System.out.println(str);
		System.out.println(strOptional.orElse("").length());
		int[] iArr = new int[10];
		int len = 11;
		int errorCode=0;
		try {
		for(int i = 0 ; i < len ; i++) {
			int tmp = (int)(Math.random()* 10);
			iArr[i] = tmp;
		}
		} catch(ArrayIndexOutOfBoundsException e) {
			errorCode = -8897;
			System.out.println("에러가 발생했습니다 에러코드 : " +errorCode);
			//System.out.println(e);
			//e.printStackTrace();
		}
		
		catch (NullPointerException e) {
			errorCode = -8898;
			System.out.println("에러가 발생했습니다 에러코드 : " +errorCode);
			System.out.println(e);
			e.printStackTrace();
		}
		catch(Exception e) {
			errorCode = -0000;
			System.out.println("관리자에게 문의하십시요 에러코드 :"+ errorCode);
		}
//		for(int a : iArr) {
//			System.out.println(a);
//		}
		if (errorCode != 0) {
			System.out.println("에러 코드를 확인해주세요, 프로그램을 종료합니다");
			System.exit(0);
		}else {
			System.out.println("코드진행성공.");
			
		}
		
	}

}






