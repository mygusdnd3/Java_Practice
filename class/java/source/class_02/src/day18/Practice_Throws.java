package day18;

import java.util.Scanner;

public class Practice_Throws {

	public Practice_Throws() {
	}

	public static void main(String[] args) {
		InputNumber i1 = new InputNumber();
		try {
			i1.inum();
		} catch (Exception e) {
			System.out.println("숫자를 입력하세요");
			e.printStackTrace();
		}
		System.out.println("main end");
		String[] str = { "1", "2" };
		ArrNum ar = new ArrNum();
		try {
			ar.arrstr(str);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("에러가 발생했습니다.");
		}
	}

}

class ArrNum {
	public String[] arrstr(String[] str) throws ArrayIndexOutOfBoundsException {

		for (int i = 0; i < 10; i++) {
			str[i] = new String();

		}
		return str;
	}
}
class InputNumber {
		public InputNumber() {
		}

		public int inum() throws Exception {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			return a;

		}
	}
