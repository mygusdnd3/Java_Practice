package my_practice;

import java.util.Arrays;
import javax.swing.*;

class ReverseValue {

	public void reversel(String st) {
		int a = 0;
		char change[] = new char[st.length()];
		for (int i = st.length() - 1; i >= 0; i--) {
			change[a++] = st.charAt(i);
		}

		System.out.print("afer reverse : ");
		for (int i = 0; i < st.length(); i++) {
			System.out.print(change[i]);
		}
		System.out.println();
	}

}

public class Reverse_class {

	public static void main(String[] args) {

		String user_Str = JOptionPane.showInputDialog("글자를 뒤집어보자!");
		F_reverse fr = new F_reverse();
		fr.Reverse(user_Str);
		/*ReverseValue rv = new ReverseValue();
		rv.reversel("ABCDEF");

		int cnt = 0;
		String str = "가나다라마바사";
		char[] c = new char[str.length()];
		for(int i = str.length()-1; i>=0; i--) {
			c[cnt++] = str.charAt(i);
		}
			
		System.out.println(Arrays.toString(c)); */
		}

}

class F_reverse{
	public void Reverse(String str) {
		int cnt = 0;
		String cStr="";
		char[] change = new char[str.length()];
		for(int i = str.length()-1; i>=0; i--) {
			change[cnt++] = str.charAt(i);
		}
		System.out.println(Arrays.toString(change));
		for(int i = 0 ; i <change.length ; i++) {
			cStr += change[i];
		}
		
		JOptionPane.showMessageDialog(null, cStr);
	}
}
