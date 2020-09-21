package day28.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import day28.vo.*;
import day28.dao.*;
import day28.evt.JoinEvent;
import evt.*;


public class MemberJoin extends JFrame {

	public JTextArea area;
	public JTextField id, name, pw, mail, tel, gen, avt;
	public JButton btn1, btn2;
	public Member main;
	
	public MemberJoin(Member main) {
		this.main = main;
	
//		title 설정
		JLabel title = new JLabel("*** 회원가입 ***");
		title.setFont(new Font("Gulim", Font.BOLD, 22));
		JPanel pan1 = new JPanel();
		pan1.add(title);
		pan1.setPreferredSize(new Dimension(450, 40));
		pan1.setBackground(Color.ORANGE);
		
		
//		입력폼 만들기
		// id
		JPanel idPan = new JPanel(new BorderLayout());
		idPan.setPreferredSize(new Dimension(420, 30));
		JLabel lid = new JLabel("I D : ");
		lid.setFont(new Font("gulim", Font.BOLD, 18));
		lid.setHorizontalAlignment(JLabel.RIGHT);
		lid.setPreferredSize(new Dimension(80, 30));
		id = new JTextField("아이디를 입력하세요.");
		id.setForeground(Color.DARK_GRAY);
		idPan.add(lid, BorderLayout.WEST);
		idPan.add(id, BorderLayout.CENTER);
		
		// name 
		JPanel namePan = new JPanel(new BorderLayout());
		namePan.setPreferredSize(new Dimension(420, 30));
		JLabel lname = new JLabel("NAME : ");
		lname.setFont(new Font("gulim", Font.BOLD, 18));
		lname.setHorizontalAlignment(JLabel.RIGHT);
		lname.setPreferredSize(new Dimension(80, 30));
		name = new JTextField("이름을 입력하세요.");
		name.setForeground(Color.DARK_GRAY);
		namePan.add(lname, BorderLayout.WEST);
		namePan.add(name, BorderLayout.CENTER);
		
		// 비밀번호
		JPanel pwPan = new JPanel(new BorderLayout());
		pwPan.setPreferredSize(new Dimension(420, 30));
		JLabel lpw = new JLabel("P W : ");
		lpw.setFont(new Font("gulim", Font.BOLD, 18));
		lpw.setHorizontalAlignment(JLabel.RIGHT);
		lpw.setPreferredSize(new Dimension(80, 30));
		pw = new JTextField("비밀번호를 입력하세요.");
		pw.setForeground(Color.DARK_GRAY);
		pwPan.add(lpw, BorderLayout.WEST);
		pwPan.add(pw, BorderLayout.CENTER);
		
		// mail
		JPanel mailPan = new JPanel(new BorderLayout());
		mailPan.setPreferredSize(new Dimension(420, 30));
		JLabel lmail = new JLabel("MAIL : ");
		lmail.setFont(new Font("gulim", Font.BOLD, 18));
		lmail.setHorizontalAlignment(JLabel.RIGHT);
		lmail.setPreferredSize(new Dimension(80, 30));
		mail = new JTextField("메일을 입력하세요.");
		mail.setForeground(Color.DARK_GRAY);
		mailPan.add(lmail, BorderLayout.WEST);
		mailPan.add(mail, BorderLayout.CENTER);
		
		// tel
		JPanel telPan = new JPanel(new BorderLayout());
		telPan.setPreferredSize(new Dimension(420, 30));
		JLabel ltel = new JLabel("TEL : ");
		ltel.setFont(new Font("gulim", Font.BOLD, 18));
		ltel.setHorizontalAlignment(JLabel.RIGHT);
		ltel.setPreferredSize(new Dimension(80, 30));
		tel = new JTextField("전화번호를 입력하세요. 예 ] 010-1234-9876");
		tel.setForeground(Color.DARK_GRAY);
		telPan.add(ltel, BorderLayout.WEST);
		telPan.add(tel, BorderLayout.CENTER);
		
		// 성별
		JPanel genPan = new JPanel(new BorderLayout());
		genPan.setPreferredSize(new Dimension(420, 30));
		JLabel lgen = new JLabel("성 별 : ");
		lgen.setFont(new Font("gulim", Font.BOLD, 18));
		lgen.setHorizontalAlignment(JLabel.RIGHT);
		lgen.setPreferredSize(new Dimension(80, 30));
		gen = new JTextField("성별을 입력하세요. 예 ] M");
		gen.setForeground(Color.DARK_GRAY);
		genPan.add(lgen, BorderLayout.WEST);
		genPan.add(gen, BorderLayout.CENTER);
		
		// 아바타
		JPanel avtPan = new JPanel(new BorderLayout());
		avtPan.setPreferredSize(new Dimension(420, 30));
		JLabel lavt = new JLabel("아바타 : ");
		lavt.setFont(new Font("gulim", Font.BOLD, 18));
		lavt.setHorizontalAlignment(JLabel.RIGHT);
		lavt.setPreferredSize(new Dimension(80, 30));
		avt = new JTextField("아바타번호를 입력하세요.");
		avt.setForeground(Color.DARK_GRAY);
		avtPan.add(lavt, BorderLayout.WEST);
		avtPan.add(avt, BorderLayout.CENTER);
		
		JPanel mainPan = new JPanel();
		mainPan.add(idPan);
		mainPan.add(namePan);
		mainPan.add(pwPan);
		mainPan.add(mailPan);
		mainPan.add(telPan);
		mainPan.add(genPan);
		mainPan.add(avtPan);
		
		// 버튼
		btn1 = new JButton("가입");
		btn2 = new JButton("종료");
		// 버튼 이벤트 처리
		JoinEvent evt = new JoinEvent(this);
		btn1.addActionListener(evt);
		btn2.addActionListener(evt);
		
		btn1.setPreferredSize(new Dimension(225, 30));
		btn2.setPreferredSize(new Dimension(225, 30));
		
		JPanel btnPan = new JPanel(new GridLayout(1, 2));
		btnPan.add(btn1);
		btnPan.add(btn2);
		
		this.add(pan1, BorderLayout.NORTH);
		this.add(mainPan, BorderLayout.CENTER);
		this.add(btnPan, BorderLayout.SOUTH);
		this.setSize(450, 370);
		this.setVisible(false);
	}
}
