package day19;

import java.util.*;
import java.util.regex.*;

import javax.swing.JOptionPane;
public class Test06 {

	public Test06() {
		String tel  = JOptionPane.showInputDialog("전화번호를 입력하세요");
		
		Pattern p = Pattern.compile("0[0-9]{1,2},-[0-9]{3,4}-[0-9]{4}");
		Matcher math = p.matcher(tel);
		if (math.matches()) {
			
		}
	}

	public static void main(String[] args) {

	}

}
