package day30.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PingServer02 {
	ServerSocket server = null;
	Socket socket = null;
	InputStream in = null;
	OutputStream out = null;

	public PingServer02() {
			ArrayList serv = new ArrayList();
			System.out.println("### 서버 접속 대기 중 ###");
			for(;;) {
			 
				StartServer();
			}
	}
	
			
	public void StartServer() {
		try {
		server = new ServerSocket(7777);
		socket = server.accept();
		System.out.println("### 서버 접속 완료 ###");
		in = socket.getInputStream();
		out = socket.getOutputStream();
		ConnectWho();
		byte[] buff = new byte[1024];
		int len = in.read(buff);
		String str = new String(buff,0,len);
		Date day = new Date();
		SimpleDateFormat form1 = new SimpleDateFormat("yyyy/MM//dd HH:mm:ss");
		SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
		System.out.println("Server Receive Data : "+ str + "\n\t\t\t\t 작업일시 -"+form1.format(day)); 
		str = "Server Receive Data : "+ str + "\n\t\t\t\t 작업일시 -"+form1.format(day);
		buff = str.getBytes();
		out.write(buff);
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} finally {
			try {
				out.close();
				in.close();
				socket.close();
				server.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
	
	public void ConnectWho() {
		InetAddress inet = socket.getInetAddress();
		String who = inet.getHostAddress();
		System.out.println("<<"+who+">> 접속중");
	}

	public static void main(String[] args) {
		new PingServer02();
	}

}
