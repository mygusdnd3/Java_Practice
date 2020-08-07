package day17.event;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import day17.*;

public class CloseEvt implements ActionListener {
	ColorPick pick;
	
	public CloseEvt(ColorPick pick) {
		this.pick = pick;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		pick.setVisible(false);
		//pick.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
