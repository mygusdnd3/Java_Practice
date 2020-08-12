package day20;

/*
	학생의 점수를 입력받아
	학점을 출력하는 프로그램을 만들어 보자
*/
import java.text.*;

import javax.swing.JOptionPane;

class ExitEx extends Exception{
	
	public boolean getBool(boolean bool) {
		return false;
	}
	
}
public class Ex01 {

	public Ex01() {
		boolean bool = true;
		int no = 0;
		while(bool) {
		
		
		try {
			no = Integer.parseInt(JOptionPane.showInputDialog("점수를입력하세요")) ;
			if(no==999) {
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다");
				bool = false;
			}else if (no>100) {
				throw new Exception();
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "잘못 입력하셨습니다.");
		} catch(ExitEx e) {
			
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "잘못 입력하셨습니다.");
			
		}
		}
	
		if(no<60) {
			JOptionPane.showMessageDialog(null, "F학점 입니다");
		}else if(no <70) {
			JOptionPane.showMessageDialog(null, "D학점 입니다");
		}else if(no <80) {
			JOptionPane.showMessageDialog(null, "C학점 입니다");
		}else if(no < 90) {
			JOptionPane.showMessageDialog(null, "B학점 입니다");
		}else if(no > 90) {
			JOptionPane.showMessageDialog(null, "A학점 입니다");
		}
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
