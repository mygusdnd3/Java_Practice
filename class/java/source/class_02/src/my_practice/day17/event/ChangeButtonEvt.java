package my_practice.day17.event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import day17.event.ApplyEvent;
import my_practice.day17.*;
import my_practice.day17.event.*;


public class ChangeButtonEvt extends JFrame {	//JFrame의 기능을 사용하기위해 통으로 상속

	public JPanel panel , bPanel;
	public JButton btn1, btn2, btn3;		// cbEvt 클래스 버튼의 새로운 창에 적용할 변수들 선언
	public Color color;
	public ColorChanger main;		// 클래스 받을 ColorChanger형태의 main 선언
	
	public ChangeButtonEvt(ColorChanger main) {
		this.main = main;  			// 매개 인자로 받은 main을 cbEvt 클래스의 지역변수로 주소 저장
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//창 하나만 종료되게 설정
		
		panel = new JPanel(); // 패널 초기화
		panel.setBackground(color.WHITE);//기본 컬러 초기화
		
		panel.setPreferredSize(new Dimension(200,100));// 패널 사이즈 설정
		
		bPanel = new JPanel(new BorderLayout()); //BoarderLayout형태로 버튼 패널 초기화
		bPanel.setPreferredSize(new Dimension(200,30)); // 버튼 사이즈 설정
		
		btn1 = new JButton("색상 적용");
		btn2 = new JButton("색상 선택");
		btn3 = new JButton("닫     기");	//각각의 버튼 내용 넣고 초기화
		
		//버튼 클릭 이벤트
		btn1.addActionListener(new ApplyEvent(this));
		btn1.addActionListener(l);
		btn1.addActionListener(l);
		
		// 버튼 사이즈 설정
		btn1.setPreferredSize(new Dimension(60,50));
		btn2.setPreferredSize(new Dimension(60,50));
		btn3.setPreferredSize(new Dimension(60,50));
		
		bPanel.add(btn1, BorderLayout.WEST);
		bPanel.add(btn2, BorderLayout.CENTER);
		bPanel.add(btn3, BorderLayout.EAST);	// 버튼을 버튼 패널에 추가해준다.
		
		this.add(panel, BorderLayout.CENTER);
		this.add(bPanel, BorderLayout.SOUTH);	// 버튼과 패널을 JFRAME에 적용
		
		this.setSize(250,130);
		this.setVisible(false); // true일시 시작과 동시에 켜진다
	}
	

}
