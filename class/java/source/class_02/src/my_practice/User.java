package my_practice;

import java.util.*;

import javax.swing.JOptionPane;

public class User {
	static Map<String, String> user = new HashMap<String, String>();
	public User() {
		joinMember();
		
	}
	public static void main(String[] args) {
		new User();
		boolean login = checkLogin(user);
		System.out.println(login);
		Set<String> set = user.keySet();
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			String a = itor.next();
			System.out.println(a + " : " + user.get(a));
		}

	}


public void joinMember() {
	String uid,upw,upw2;
	
	uid = JOptionPane.showInputDialog("가입할 아이디를 입력하세요");
	while(true) {
	upw = JOptionPane.showInputDialog("패스워드를 입력하세요");
	upw2 = JOptionPane.showInputDialog("패스워드를 한번입력하세요");
		if(!upw.equals(upw2)) {
			JOptionPane.showMessageDialog(null, "잘못 입력하셨습니다.");
		}else {
			break;
		}
	}
	user.put(uid, upw);

}


public static  boolean checkLogin(Map<String, String> user ){
		while (true) {
			String id = JOptionPane.showInputDialog("로그인 \n 아이디 입력");

			if (user.containsKey(id)) {
				String pw = JOptionPane.showInputDialog("패스워드를 입력하세요");
				
				String tmp = (String) user.get(id);
				if (tmp.equals(pw)) {
					JOptionPane.showMessageDialog(null, "로그인성공");
					break;
				} else if (pw.isEmpty()) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요");
				} else {
					JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다.");
				}
			} else if (user.isEmpty()) {
				JOptionPane.showMessageDialog(null, "아이디를 입력해주세요");
			} else {
				JOptionPane.showMessageDialog(null, "잘못된 아이디 입니다.");

			}
		}
		return true;	
		
	}
}

