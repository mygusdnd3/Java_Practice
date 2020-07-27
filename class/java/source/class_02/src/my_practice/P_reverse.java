package my_practice;

import java.util.Arrays;

import javax.swing.JOptionPane;

class Reversel{
	public void Reverse(String str) {
		
		char[] change = new char[str.length()];
		int cnt = 0;
		String sChange = " ";
		for(int i = str.length()-1; i>=0; i--) {
			change[cnt++] = str.charAt(i);
		}
		System.out.println(Arrays.toString(change));
		for(int i = 0; i < change.length;i++) {
			sChange+=change[i]; 
		}
		JOptionPane.showMessageDialog(null, sChange);
	}
}
	
public class P_reverse {
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("뒤집을 말을 입력하세요");
		
		Reversel sr = new Reversel();
		sr.Reverse(str);
		
	}
}
