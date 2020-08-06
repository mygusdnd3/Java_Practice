package day16;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Test06 {
	JFrame f;
	JPanel pan;
	JPanel pan2;
	JPanel sub;
	JButton btn1, btn2;

	public Test06() {
		f = new JFrame("★★★ 색 변경 ★★★");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 종료 메서드

		// 색상이 표현될 메인 판 만들고
		pan = new JPanel();
		pan.setBackground(Color.ORANGE);
		pan2 = new JPanel();
		System.out.println("2222222222222222222222");
		pan2.setBackground(Color.BLUE);
		System.out.println("33333333333333333333333");
		// 버튼이 위치할 판 만들고
		sub = new JPanel(new BorderLayout());
		System.out.println("44444444444444444444444");
		sub.setPreferredSize(new Dimension(300, 60));
		// sub.setSize(300,60);
		System.out.println("5555555555");

		// 버튼 만들고
		btn1 = new JButton("색 변경");
		btn1.addActionListener(new BtnEvent02());
		btn2 = new JButton("닫기");
		BtnEvent01 evt01 = new BtnEvent01();
		ActionListener evt = evt01; // 자동형변환
		// btn2.addActionListener(evt);
		btn2.addActionListener(new ActionListener() {
			@Override  //무명 클래스의 사용
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});//무명 클래스
		
		btn1.addActionListener(new BtnEvent04(this));
		
		btn2.addActionListener(new BtnEvent05(this));
		btn1.setPreferredSize(new Dimension(143, 30));
		System.out.println("66666666666666666666666666666666666");
		btn2.setPreferredSize(new Dimension(143, 30));
		System.out.println("777777777777777777777777");
		// sub에 버튼 추가하고
		sub.add(btn1, BorderLayout.WEST);
		sub.add(btn2, BorderLayout.EAST);

		f.add(pan, BorderLayout.CENTER);
		f.add(sub, BorderLayout.SOUTH);

		f.setSize(300, 350);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Test06();
	}

	//
	class BtnEvent02 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// 필요한 rgb 값을 만들고
			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 265);
			int blue = (int) (Math.random() * 256);

			// color 객체를 만들고
			Color color = new Color(red, green, blue);
			pan.setBackground(color);
		}
	}

	// 색상 변경 이벤트 반환함수
	public ActionListener setBg() {
		// 지역 내부 클래스
		class BtnEvent03 implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 필요한 rgb 값을 만들고
				int red = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);

				// Color 객체를 만들고
				Color color = new Color(red, green, blue);
				pan.setBackground(color);
			}
		}

		return new BtnEvent03(); // ActionListener 타입으로 자동 형변환이 된다.
	}
}

class BtnEvent01 implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("프로그램을 종료합니다");
		System.exit(0);
	}
}

class BtnEvent04 implements ActionListener {
	Test06 main;

	public BtnEvent04() {
		// main = new Test06(); //전혀 다른 객체를 main이 기억하게된다.
	}

	public BtnEvent04(Test06 main) {
		this.main = main;
	}

	public void actionPerformed(ActionEvent e) {
		// 필요한 rgb 값을 만들고
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);

		// Color 객체를 만들고
		Color color = new Color(red, green, blue);
		main.pan.setBackground(color);

	}
}


class BtnEvent05 implements ActionListener {		//클래스 통신
	
	Test06 main;		//Test06 타입의 전역변수 생성 후 기존의 셋팅값 전달.접근
	BtnEvent05(){}
	BtnEvent05(Test06 b){
		this.main = b;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 필요한 rgb 값을 만들고
				int red = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);

				// Color 객체를 만들고
				Color color = new Color(red, green, blue);
				main.pan.setBackground(color);
	}
	
}