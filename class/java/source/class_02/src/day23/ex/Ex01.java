package day23.ex;

import day23.*; //iuiu 파일은 패키지가다르기때문에
import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

/*
 	문제 1]
 		Test02에서 만든 iu.iu 파일의 내용을 읽어서 출력하세요
 		단,Map.Entry타입으로 반환 받아서 처리하세요
 		참고 ]
 			Map.Entry 는
 			키와 벨류를 변수로 만들어서 저장해놓은 VO 클래스이다.
 */
public class Ex01 {

	public Ex01() {
		//Properties 준비한다.
		Properties prop = new Properties();
		//파일 읽어온다.
		FileInputStream fin = null;
		String msg = ""; // 읽은 데이터 저장할 변수
		try {
			fin = new FileInputStream("src/day23/iu.iu");
			//읽은 데이터 Properties에 기억시키고
			prop.load(fin);
		}catch(Exception e) {
			e.printStackTrace();
		}
		// Properties도 Map의 일종이므로 키와 벨류를 Map.Entry가 담겨있는 Set으로 뽑을수 있다.
		Set set = prop.entrySet();
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			Map.Entry ent = (Map.Entry)itor.next();	// 중복이름은 허용하지 않는다.
			//이제 데이터는 ent에 저장이 되어있으니 변수의 내용만 꺼내서 실행하면 되겠다.
			msg = msg +ent.getKey()+" : "+ent.getValue()+"\n";
		}
		JOptionPane.showMessageDialog(null, "<html><h2 style='color :green'>*** IU Imformation ***</h2></html>\n\n"+msg);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
