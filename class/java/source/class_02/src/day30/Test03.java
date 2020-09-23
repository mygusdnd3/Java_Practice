package day30;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Test03 {
	public JFrame fr;
	public JPanel pan, contP, timeP;
	public JLabel timelbl;
	public JTextArea area;
	
	public Test03() {
//		System.out.println("?1?");
//		Date date = new Date();
//		
//		SimpleDateFormat form = new SimpleDateFormat("yyyy/MM/dd\tHH:mm:ss");
//		
//		try {
//			Thread.sleep(1000);
//		} catch (Exception e) {}
//			Date date1 = new Date();
//			
//			String stime1 = form.format(date);
//			String stime2 = form.format(date1);
//			
//			System.out.println("??");
//			System.out.println(stime1);
//			System.out.println(stime2);
//		
			fr = new JFrame();
			fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			timeP = new JPanel();
			
	}

	public static void main(String[] args) {
		new Test03();
	}

}
