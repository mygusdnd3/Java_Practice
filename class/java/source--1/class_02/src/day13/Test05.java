package day13;

import java.awt.Color;

import javax.swing.JFrame;

public class Test05 extends JFrame {
	public Test05() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이것은 창입니다");
		this.setBackground(Color.GREEN);
		this.setSize(300,500);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Test05();
	}
}
