package day17;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import day17.event.*;
public class ColorPick extends JFrame {
	public ColorClass main;
	
	public JPanel panel, bPanel;
	public JButton btn1, btn2, btn3; //btn1 : 적용 , btn2 : 선택 , btn3 :닫기
	public Color color;
	
	public ColorPick(ColorClass main) {
		this.main = main;
		//x 버튼이 눌렸을때 현재 창만 닫아줘야 한다.
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//JFrame.EXIT_ON_CLOSE 상위클래스도 다꺼짐
		
		//panel 초기ㅗ하
		
		panel = new JPanel();
		panel.setBackground(color.WHITE);

		
		panel.setPreferredSize(new Dimension(200,100));
		
		
		bPanel = new JPanel(new BorderLayout());
		bPanel.setPreferredSize(new Dimension(200,30));
		
		
		//button 초기화
		btn1 = new JButton("색상 적용");
		btn2 = new JButton("색상 선택");
		btn3 = new JButton("닫     기");
		
		//이벤트 추가
		//btn1 적용 이벤트
		btn1.addActionListener(new ApplyEvent(this));
		
		//btn2
		btn2.addActionListener(new ChooseEvent(this));
		
		//btn3 종료 이벤트
		btn3.addActionListener(new CloseEvt(this));
		
		//button 사이즈 적용
		btn1.setPreferredSize(new Dimension(60,50));
		btn2.setPreferredSize(new Dimension(60,50));
		btn3.setPreferredSize(new Dimension(60,50));
		
		
		
		bPanel.add(btn1, BorderLayout.WEST);
		bPanel.add(btn2, BorderLayout.CENTER);
		bPanel.add(btn3, BorderLayout.EAST);
		
		this.add(panel, BorderLayout.CENTER);
		this.add(bPanel,BorderLayout.SOUTH);
		
		this.setSize(250, 130);
		this.setVisible(false);
		
		
	}
}
