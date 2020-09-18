package my_practice;

import javax.swing.JOptionPane;

public class P_Ex03 {

	String[][] st = new String[5][6];

	P_Ex03() {
		setPoint();
	}

	public void setPoint() {
		for (int i = 0; i < st.length; i++) {
			String str = JOptionPane.showInputDialog("점수를입력");
			String tmp;
			for (int j = 0; j < st[i].length; i++) {

				int idx = str.indexOf('/');

				String s = str.substring(0, idx);

				str = str.substring(idx + 1, str.length());
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
		new P_Ex03();

	}

}
