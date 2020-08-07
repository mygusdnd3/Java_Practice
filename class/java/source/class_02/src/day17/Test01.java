package day17;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Test01 {
	JFrame f;
	JPanel pan;
	JPanel pan2;
	JPanel sub;
	JButton btn1, btn2;

	public Test01() {
		f = new JFrame("★★★ 색 변경 ★★★");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 종료 메서드

		// 색상이 표현될 메인 판 만들고
		pan = new JPanel();
		pan.setBackground(Color.ORANGE);
		pan2 = new JPanel();
		pan2.setBackground(Color.BLUE);
		// 버튼이 위치할 판 만들고
		sub = new JPanel(new BorderLayout());
		sub.setPreferredSize(new Dimension(300, 60));
		// sub.setSize(300,60);

		// 버튼 만들고
		btn1 = new JButton("색 변경");
		
		btn1.addActionListener(new BtnEvent03(this));
		
		//btn1.addActionListener(new BtnEvent02());
		btn2 = new JButton("닫기");
		btn2.addActionListener(new BtnEvent01(this));
		
		
		
//		// btn2.addActionListener(evt);
//		btn2.addActionListener(new ActionListener() {
//			@Override  //무명 클래스의 사용 
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//			}
//		});//무명 클래스
		
		//btn1.addActionListener(new BtnEvent04(this));
		
	//	btn2.addActionListener(new BtnEvent05(this));
		btn1.setPreferredSize(new Dimension(143, 30));
		btn2.setPreferredSize(new Dimension(143, 30));
		// sub에 버튼 추가하고
		sub.add(btn1, BorderLayout.WEST);
		sub.add(btn2, BorderLayout.EAST);

		f.add(pan, BorderLayout.CENTER);
		f.add(sub, BorderLayout.SOUTH);

		f.setSize(300, 350);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Test01();
	}

	//


}
//외부클래스 //닫기버튼
class BtnEvent01 implements ActionListener {
	Test01 main;
	
	public BtnEvent01(Test01 main) {
		this.main = main;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 	문제 1]
		 			메세지창이 띄워지는 위치가 TEST01 객체의 위에 띄워지게 처리하세요.
		 */
//		JOptionPane.showMessageDialog(main.f, "프로그램을 종료합니다"); // 외부클래스인 btn01이 내부클래스인 frame f에 접근할수있게
//		System.exit(0);
		
		int cno = JOptionPane.showConfirmDialog(main.f, "프로그램을 종료할까요?","##프로그램 종료 ##", JOptionPane.YES_NO_CANCEL_OPTION);
		// yes = 0 , no = 1 cancel = 2 반환
		if(cno == 0) {
			System.exit(0);
		}
	}
}


	// 외부 클래스
class BtnEvent03 implements ActionListener {

		
		
		
		Test01 main;
		
		
		public BtnEvent03(Test01 main) {
			this.main = main;
		}
		
		
		
		
		/*		
		JFrame f;
		JPanel pan;
		JPanel pan2;
		JPanel sub;
		JButton btn1, btn2;
		
		
		Test01 main;
		
		public BtnEvent03() {
			

			f = new JFrame("★★★ 색 변경 ★★★");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 종료 메서드

			// 색상이 표현될 메인 판 만들고
			pan = new JPanel();
			pan.setBackground(Color.ORANGE);
			pan2 = new JPanel();
			pan2.setBackground(Color.BLUE);
			// 버튼이 위치할 판 만들고
			sub = new JPanel(new BorderLayout());
			sub.setPreferredSize(new Dimension(300, 60));
			// sub.setSize(300,60);

			// 버튼 만들고
			btn1 = new JButton("색 변경");
			
			btn1.addActionListener(this);
			
			//btn1.addActionListener(new BtnEvent02());
			btn2 = new JButton("닫기");
			
			//버튼이벤트 추가
			BtnEvent03 evt03 = this;
			btn2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					evt03.f.dispose();
				}
				
			});
			//
			BtnEvent01 evt01 = new BtnEvent01();
			ActionListener evt = evt01; // 자동형변환
			
			
			
//			// btn2.addActionListener(evt);
//			btn2.addActionListener(new ActionListener() {
//				@Override  //무명 클래스의 사용
//				public void actionPerformed(ActionEvent e) {
//					System.exit(0);
//				}
//			});//무명 클래스
			
			//btn1.addActionListener(new BtnEvent04(this));
			
		//	btn2.addActionListener(new BtnEvent05(this));
			btn1.setPreferredSize(new Dimension(143, 30));
			btn2.setPreferredSize(new Dimension(143, 30));
			// sub에 버튼 추가하고
			sub.add(btn1, BorderLayout.WEST);
			sub.add(btn2, BorderLayout.EAST);

			f.add(pan, BorderLayout.CENTER);
			f.add(sub, BorderLayout.SOUTH);

			f.setSize(300, 350);
			f.setResizable(false);
			f.setVisible(true);
		} */
		@Override
		public void actionPerformed(ActionEvent e) {
			//color를 선택 도구 객체 ㅁ나들고
			JColorChooser cc01 = new JColorChooser();
			// Color 객체를 만들고
			Color color =cc01.showDialog(cc01, "색선택",Color.WHITE );
			
			// Color 객체를 만들고
			main.pan.setBackground(color);
			//main.pan.setBackground(color);
		}
	}
	
