package day24;
/*
 	내용을 파일에 저장하는 프로그램을 만드세요
 	단, Buffered 스트림을 사용해서 처리하세요.
*/

import java.io.*;

import javax.swing.JOptionPane;
public class Test08 {

	
	public Test08() {
		//타겟 스트림( 기본스트림) 은 반드시 필요하다
		FileOutputStream fout = null;
		//필요에 따라서 보조(필터)스트림을 연결 할 수 있다. 이때 스트림의 방향도 맞춰야 한다. 
		BufferedOutputStream bout = null;
		try {
			fout = new FileOutputStream("D:\\Java_Practice\\class\\java\\source\\class_02\\src\\day24\\wTest\\BufferedTest.txt"); //프로젝트 경로는 / 하나로된다
			bout = new BufferedOutputStream(fout);
			
			//내용을 적당히 만들자.
			String str ="Parmenides on Reason and Revelation\r\n" + 
					"The Image of the Noble Sophist\r\n" + 
					"The Science of Philosophy : Discourse and Deception in Plato's Sophist\r\n" + 
					"Are Potency and Actuality Compatible in Aristotle?\r\n" + 
					"Being Itself and the Being of Beings : Reading Aristotle's Critique of Parmenides (Physics 1.3) after Metaphysics";
			byte[] buff = str.getBytes();
			bout.write(buff); //bout에 쓰면 자동으로 fout까지 가지 않겠니
			/*
			 	문제는 아직 버퍼가 다 채워지지 않았으므로
			 	버퍼의 내용이 FileOutputStream으로 가지 않는다. 
			 	따라서 아직 저장이 되지 않았다..
			 	
			 	따라서 반드시 습관적으로 작업이 완료되는 시점에서
			 	버퍼를 비워주는 습관을 가진다.
			 */
			bout.flush();
			JOptionPane.showMessageDialog(null, "파일 저장 완료!");
			System.out.println("");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bout.close(); //의존성을 먼저 따져야 한다. 닫아야되는 순서
				fout.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		new Test08();
	}

}
