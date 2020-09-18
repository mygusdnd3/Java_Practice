package day08;

import javax.swing.JOptionPane;

/*
 * 	문제 4]
 * 
	 	도형의 정보를 입력 받는데
	  	입력형식은
	 
	  		0/5 - 반지름이 5인 원
	  		3/5/10 	- 밑변이 5고 높이가 10인 삼각형
	  		4/3/4	- 가로가 3이고 세로가 4인 사각형
	  
	  		의 형식으로 입력받은 도형의 넓이를 계산하시오
	  
	  참고 ]
	  	indexOf(int ch, int fromIndex)
	  		ch 		: 찾을 문자
	      fromIndex : 찾을 시작위치
	 
	  lastIndexOf(int ch)
	  	뒤에서 부터 찾을 문자를 검색해서 해당 위치를 반환해준다.
 * 
 *
 * 
 */
public class Ex04 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("계산하고자 하는 도형의 정보를 입력하세요");
		
		String[] sArr = new String[3];
		
		// 실제 데이터 형태의 배열을 만들고
		int[] noArr = new int[3];
		
		sArr[0] = str.substring(0, str.indexOf('/'));
		if(!sArr[0].equals("0")){
			//사각형, 삼각형인경우
			sArr[1] = str.substring(str.indexOf('/')+1,str.lastIndexOf('/') );	
		}else {//원인경우
			sArr[2] = str.substring(str.indexOf('/')+1 );

		}
		//sArr[1] = sArr[0].equals("0")?str.substring(str.indexOf('/')+1):str.substring(str.indexOf('/')+1,str.lastIndexOf('/')
		
		for(int i = 0 ; i<noArr.length; i++) {
			noArr[i] = Integer.parseInt(sArr[i]);
		}
		// 데이터 꺼내서 계산해서 출력한다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*
		String[] sArr = new String[3];
		int cnt = 0;
		int cnt2 = str.lastIndexOf('/');
		char c = ' ';
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) > '0' || str.charAt(i) > '9') {
				cnt = i;
				break;
			}

		}
		String name = "";

		System.out.println(name);

		sArr[0] = str.substring(0, 1);
		sArr[1] = str.substring(cnt, cnt2);
		sArr[2] = str.substring(cnt2 + 1);
		System.out.println(sArr[0]);
		System.out.println(sArr[1]);
		System.out.println(sArr[2]);
		float result = 0;
		
		int num1 = Integer.parseInt(sArr[1]);
		
		int num2 = Integer.parseInt(sArr[2]);
		
		int num3 = Integer.parseInt(sArr[0]);
		if (num3 == 0) {
			name += "원";
		} else if (str.indexOf(1) == '4') {
			name += "사각형";
		} else if (str.indexOf(1) == '3') {
			name += "삼각형";
		}
		switch (sArr[0]) {
		case "3":
			result = (num1 * num2) / 2;
			break;
		case "4":
			result = num1 * num2;
			break;
		case "0":
			result = (num1 * 2) * 3.14f;
			break;

		}
		JOptionPane.showMessageDialog(null, "계산하고자 하는" + name + "의 계산 넓이는 : " + result + "입니다.");
*/
	}

}
