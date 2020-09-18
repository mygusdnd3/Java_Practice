package my_practice;

import java.util.Arrays;
import javax.swing.*;

class S_Reverse{
	void Reverse(String str) {
		
		char[] change = new char[str.length()];
		int cnt = 0;
		for(int i = str.length(); i<=0; i--) {
			change[cnt++] = str.charAt(i);
		}
		System.out.println(Arrays.toString(change));
	}
public class Tmp {
	public static void main(String[] args) {
		
		
		
	}
	

	

}
