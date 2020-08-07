package day17.event;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import day17.*;

public class ApplyEvent implements ActionListener {
	ColorPick pick;
	

	public ApplyEvent(ColorPick pick) {
		this.pick = pick;
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		ColorClass main = pick.main;
//		Color color = pick.color;
//		main.panel.setBackground(color);
		pick.main.panel.setBackground(pick.color);
		
	}

}
