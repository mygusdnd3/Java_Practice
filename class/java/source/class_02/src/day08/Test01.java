package day08;

public class Test01 {

	public static void main(String[] args) {
		 String str1 = "abcd";   //리터럴풀
		 String str2 = new String("abcd"); // 힙영역의 주소
		 String str3 = str2;
		 str2 = new String("1234");
		 
		 System.out.println(str1 == str2);
		 System.out.println(str2 == str3);
		 System.out.println(str1.equals(str2));
		
	}

}
