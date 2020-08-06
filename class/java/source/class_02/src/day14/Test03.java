package day14;

public class Test03 {

	public Test03() {
		Object[] obj = new Object[5];
		obj[0] = "ㅁㅈㅇ";
		obj[1] = 100;
		obj[2] = 'a';
		obj[3] = 3.14;
		obj[4] = true;
		try {
		for(int i = 0; i < obj.length; i++) {
			String str ="";
			if(obj[i] instanceof String) {
				str = "문자열";
			}else if(obj[i] instanceof Integer) {// 클래스와 클래스의 비교확인
				str = "정수";						//int 이런거 쓰지마라
			}else if(obj[i] instanceof Character) {
				str = "문자";
			}else if (obj[i] instanceof Double) {
				str ="실수";
			}else if (obj[i] instanceof Boolean) {
				str = "논리";
			}
			System.out.println(obj[i] + " : " + str + " 데이터");
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Test03();
	}

}
