package day30.network;

/*
 	서버에 접속한 후 
 	특정 데이터를 서버에 보내고 
 	서버가 다시 응답하는 데이터를 받는 프로그램.
 */
import java.net.*;
import java.io.*;

public class PingClient01 {

	public PingClient01() {
		// 상대방과 통신을 하기 위해서는 통신 도구가 필요하다.
		// 이 통신 도구의 역할을 하는 클래스가 Socket이다.
		Socket socket = null;
		try {
			// 소켓을 만들면 상대방과 자동적으로 접속이 이루어 진다.
			socket = new Socket("192.168.0.28", 7777);
			//포트번호는 접속받은 프로그램에서 지정한 번호 여야 한다. 
			//이제 접속이 되었다는 것이고
			
			// 상대방과 통신을 하면 된다.
			// 통신 방법은 스트림을 이용해서 처리한다.
			// 1. 타겟 스트림
			//	getInputStream() | getOutputStream();
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			// 먼저 데이터를 서버에 보내자.
			String str = "첫번째 네트워크 프로그램 핑(서현웅)";
			byte[] buff = str.getBytes();
			
			// 이제 내보내면 된다.
			System.out.println(buff);
			out.write(buff);
			//in.read(buff);?
			
			// 서버가 응답해준 데이터를 받아보자.
			
			buff = new byte[1024];
			int len = in.read(buff); //읽은 갯수반환
			str = new String(buff, 0 , len);
			System.out.println("받은내용 : " +str);
			Thread.sleep(1000);
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		new PingClient01();
	}

}
