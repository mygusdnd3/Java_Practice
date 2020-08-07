package day17.event;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import day17.*;

public class ChooseEvent implements ActionListener {

	ColorPick pick;
	
	public ChooseEvent(ColorPick pick) {
		this.pick = pick;
	}
	public ChooseEvent(BtnEvt btnEvt) {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Color color = JColorChooser.showDialog(pick, "컬러선택", Color.WHITE);
		pick.color = color;
		pick.panel.setBackground(color);
		//순차적으로 진행되니깨 한번더 선언해준다.
		
	}
}
