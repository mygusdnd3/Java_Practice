package myMethod;

public class reverse_check {

	public reverse_check(String str) {
		System.out.println("Palindrome(회문) 체크를 합니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String line = str;
		while(true) {
			if(line.equals("0")) {
				System.out.println("0이 입력되었습니다.");
				break;
			}else if(line.equals("")) {
				System.out.println("아무것도 입력되지 않았습니다.");
				break;
			}else if(line.equals(" ")) {
				System.out.println("공백이 입력되었습니다.");
				break;
			}
			
			StringBuffer sb = new StringBuffer();
			sb.append(str).reverse();
			if(str.equals(sb.toString())) {
				System.out.println("일치합니다.");
				break;
			}else {
				System.out.println("불일치합니다.");
				break;
			}
		}
		System.out.println("체크종료");
	}

}
