package chatting.client;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EnterEvent implements KeyListener {
	public ClientController main;
	
	public EnterEvent(ClientController main) {
		this.main = main;
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		char ch = e.getKeyChar(); // 눌러진 키의 문자를 반환해주는 함수
		if((int) ch == 10 ) {
			main.evt.sendProc();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
