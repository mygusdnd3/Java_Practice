package chatting.client.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import chatting.client.*;
import chatting.client.ui.*;
import chatting.client.thread.*;

public class ButtonEvent implements ActionListener {
	public ClientController main;
	public ButtonEvent(ClientController main) {
		this.main = main;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 어떤버튼이 눌려졌는지 먼저 알아낸다.
		String str = e.getActionCommand(); //버튼을 우리가만들텐데 문자열만 꺼내서 처리하는 함수?
		
		switch(str) {
		case "로그인":
			loginProc();
			break;
		case "종료":
			exitProc();
			break;
		case "send":
			sendProc();
			break;
			
		}
	}
	
	//로그인 처리 함수
	public void loginProc() {
		
	}
	// 종료 처리 함수
	public void exitProc() {
		main.close();
		System.exit(0);
	}
	//메세지 보내기 처리함수
	public void sendProc() {
		
		
	}
	
	
	
	
}








