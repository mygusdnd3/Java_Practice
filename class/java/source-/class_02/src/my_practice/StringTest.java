package my_practice;

public class StringTest {

	public static void main(String[] args) {
		String mail = "abcde@naver.com";
		
		int idx = mail.indexOf("@");
		
		String mail1 = mail.substring(0,idx);
		
		String mail2 = mail.substring(idx+1);

	}

}
