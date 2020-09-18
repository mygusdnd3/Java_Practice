package day05;

/*
 * 정수를 랜덤하게 발생 시키고
 * 숫자를 입력 받아서
 * 같은 수샂가 입력될 경우 종료시키는
 * 프로그램을 작성하세요
 */
import javax.swing.*;

public class Extra {
	public static void main(String[] args) {
		int no = (int) (Math.random() * 90 + 10);
		int cnt = 0;
		int tmp = 0;
		loop: for (;;) {
			String player = JOptionPane.showInputDialog("숫자를 입력하세요");

			tmp = Integer.parseInt(player);
			++cnt;
			if (no == tmp) {
				System.out.println("같은 수를 입력하셨습니다.");
			}if (cnt ==30){
				System.out.println("글러먹었습니다.");
				break loop;
			}
			else {

				System.out.println("다시 입력하세요");
				continue loop;
			}

		}
	}
}
