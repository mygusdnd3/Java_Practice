package day17;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.*;

import javax.swing.*;

import day17.*;
import day17.event.ChooseEvent;

public class Test02 {
	JButton btn1,btn2,btn3,btn4,btn5;
	Color color;
	JPanel panel ;
	public Test02() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel(); // 센터에 갈 패널
		panel.setBackground(color.WHITE);
		JPanel bPanel = new JPanel(new GridLayout(1, 5));// 격자구조그리드
		bPanel.setPreferredSize(new Dimension(500, 30));
		
		btn1 = new JButton("red");
		btn2 = new JButton("green");
		btn3 = new JButton("blue");
		btn4 = new JButton("set");
		btn5 = new JButton("close");
		bPanel.add(btn1);
		bPanel.add(btn2);
		bPanel.add(btn3);
		bPanel.add(btn4);
		bPanel.add(btn5);
		String[] sArr = { "red","green","blue","Set","Close"};
		JButton[] btn = new JButton[5];
//		for(int i = 0; i<5; i++) {
//			btn[i] = new JButton(sArr[i]);
//			btn[i].addActionListener(new BtnEvt(this));
//			bPanel.add(btn[i]);
//			
//		}
		btn3.addActionListener(new BtnEvt(this));
		
		frame.add(panel, BorderLayout.CENTER);
		frame.add(bPanel, BorderLayout.SOUTH);
		//bPanel.
		frame.setSize(500, 250);
		frame.setVisible(true);
		frame.setResizable(false);

	}

	public static void main(String[] args) {
		new Test02();
	}
}

class BtnEvt implements ActionListener{
public Test02 main;
	public BtnEvt(Test02 main) {
		this.main = main;
	}
	public BtnEvt() {}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		
		switch(str) {
		case "blue" :
			main.btn3.addActionListener(new Btn1Event(this));
			//System.out.println("파랑");		//함수를 호출해서 넣는것도 좋을것.
			break;
		case "red" :
			main.btn1.addActionListener(new Btn2Event(this));
			break;
			
		case "green":
			System.out.println("초록");
			break;
		case "Close":
			System.out.println("닫기");
			break;
		case "Set":
			System.out.println("적용");
			break;
		}
	}
	
}

class Btn1Event implements ActionListener{
	
	BtnEvt t2;
	
	Color color;
	public Btn1Event(BtnEvt main) {
		this.t2 = main;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.color = color.YELLOW;
		System.out.println("11111");
		t2.main.panel.setBackground(color);
	}
	
}

class Btn2Event implements ActionListener{

	BtnEvt t2;
	
	Color color;
	public Btn2Event(BtnEvt main) {
		this.t2 = main;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.color = color.RED;
		t2.main.panel.setBackground(color);
	}
	
}
