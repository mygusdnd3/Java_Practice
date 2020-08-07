package day17;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorClass {
	public JFrame frame;
	public JPanel panel , bPanel;
	public JButton btn1, btn2;
	public ColorPick cPick;
	public Color color;
	public ColorClass() { 
		frame = new JFrame("★★★ 컬러보기 ★★★");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ColorPick 초기화
		cPick = new ColorPick(this); //ColorClass의 "주소"만 넘겨줌
		// 패널 만들기
		panel = new JPanel();
		//패널 배경색 설정
		JColorChooser Choose = new JColorChooser();			//색상선택 함수 초기화
		color = Choose.showDialog(Choose, "초기색상선택", Color.WHITE);	// 색상선택함수의 사용
		//Color color = JColorChooser.showDialog(frame, "색선택", color.WHITE); showDialog 가 Static이라 바로 호출도 가능
		
		panel.setBackground(color);
		
		
		//버튼 맨들기
		btn1 = new JButton("색상 선택");
		btn2 = new JButton("Close");
		//버튼 사이즈 변경
		btn1.setPreferredSize(new Dimension(147, 30));
		btn2.setPreferredSize(new Dimension(147, 30));
		
		
		//버튼 이벤트 추가
		 
		//컬러 변경 버튼
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cPick.setVisible(true);
			}
			
		});
		
		
		//닫기버튼
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		bPanel = new JPanel(new BorderLayout());	//초기화
		bPanel.add(btn1,BorderLayout.WEST);
		bPanel.add(btn2,BorderLayout.EAST);
		
		
		// 프레임에 패널 추가
		frame.add(panel, BorderLayout.CENTER); 	//가운데다 패널(메인색 추가)
		frame.add(bPanel,BorderLayout.SOUTH);
		//패널에 버튼추가
		
		frame.setSize(400,330);
		frame.setVisible(true); //초기값은 false
		frame.setResizable(false); //창크기 변경 권한
		
	}
	
	public static void main(String[] args) {
		new ColorClass();
	}
}
