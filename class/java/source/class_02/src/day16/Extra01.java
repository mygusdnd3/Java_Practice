package day16;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Extra01 {
	int num ;
	JFrame frame;
	JPanel pan;
	JButton btn1, btn2;
	
	public Extra01() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 100);
		
		pan = new JPanel(new BorderLayout());
		btn1 = new JButton("숫자 입력");
		AddClass adc = new AddClass(this);
//		Extra01 e1 =this;
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				new AddClass(e1);
			}
			
		});
		//new AddClass(btn1);
		btn1.setPreferredSize(new Dimension(123, 100));
		// 이벤트 추가
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				adc.setMain();
				
			}
		});
		btn2 = new JButton("숫자 출력");
		btn2.setPreferredSize(new Dimension(123, 100));
		// 출력이벤트 등록
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "입력된 숫자 : " + num);
			}
		});
		
		pan.add(btn1, BorderLayout.WEST);
		pan.add(btn2, BorderLayout.EAST);
		
		
		frame.add(pan);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	public static void main(String[] args) {
		new Extra01();
	}

}

class AddClass {
	
	//Extra01의 객체의 주소를 기억할 준비를 해야한다.
	Extra01 main;
	 
	
	//Extra01객체의 주소를 넘겹다아서 셋팅해주는 역할을 하는 생성자를 정의한다.
	
	
	AddClass(){}
	AddClass(Extra01 main){
		this.main = main;
		//setMain();
	}
	public void setMain() {
		String soo = JOptionPane.showInputDialog("정수를입력하세요");
		int no = 0;
		try {
			no = Integer.parseInt(soo);
		}catch(Exception e) {
			no  = -999;
			System.out.println(no);
			e.printStackTrace();
		}
		// 정수는 이제 만들어 졌으니 Extra01의 객체의 멤버에 기억시키면 된다.
		main.num += no;
		
	}
	
}
