package my_practice.day17;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import my_practice.day17.event.ChangeButtonEvt;

public class ColorChanger {
	public JFrame frame;//
	public JPanel panel, bPenal;// 버튼과 캔버스
	public JButton btn1, btn2;
	public Color color; // 컬러를 변경해 저장할 변수
	public ChangeButtonEvt cbEvt;
	public ColorChanger() {
		frame = new JFrame("Color Changer"); // 메인 화면단의 제목
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x눌르시 프로그램 종료.
		
		panel = new JPanel(); // 패널 초기화
		
		JColorChooser Choose = new JColorChooser();
		color = Choose.showDialog(Choose, "초기 색상의 선택", color.GRAY); //initialColor- 초기 기본 컬러
		
		panel.setBackground(color);// 선택한 컬러로 백그라운드 컬러로 적용
		
		btn1 = new JButton("색상 선택");
		btn2 = new JButton("Close");//버튼의 초기화와 버튼 내용 삽입
		btn1.setPreferredSize(new Dimension(200,80));
		btn2.setPreferredSize(new Dimension(200,80));// 버튼 개별 사이즈 조절
		bPenal = new JPanel(new BorderLayout());	//버튼단 초기화와 사용하고자 하는 레이아웃 호출
		bPenal.add(btn1,BorderLayout.WEST);
		bPenal.add(btn2,BorderLayout.EAST);//왼쪽 오른쪽으로 사용하겠다 선언
		
		frame.add(panel,BorderLayout.CENTER);
		frame.add(bPenal, BorderLayout.SOUTH); //Frame에 패널과 버튼단을 추가
		
		frame.setSize(400,330);//frame 사이즈
		frame.setVisible(true); // Visible 상태, 초기값은 false/ 보이지않음
		frame.setResizable(false); // 창 크기 변경권한
		
		//버튼 이벤트 추가 단
		btn1.addActionListener(new ActionListener() {	//버튼 클릭시 발생하게 되는 창 연동

			@Override
			public void actionPerformed(ActionEvent e) {
				cbEvt.
			}
			
		});
		
	}

	public static void main(String[] args) {
		new ColorChanger();
	}

}
