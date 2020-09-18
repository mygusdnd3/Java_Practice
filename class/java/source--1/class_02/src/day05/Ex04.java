package day05;

/*
 *  문제 4]
 *  	1 - 2 + 3 - 4 + 5 - 6 + ..했을경우
 *  	어디까지 계산하면 100이 넘는숫자인지
 */

public class Ex04 {
	/*public static void main(String[] args) {
		int booho = -1;
		int sum = 0;
		int num = 1;
		for(int i = 1; true ; i++) {
			booho *=-1;
			sum = sum + (booho*i);
			System.out.println(booho);
			if(sum >= 100) {
				num = i;
				break;
			}
		}
		System.out.println("더한 값이 100 이상 되는 숫자는 " +num+"이고 합은 "+sum+"입니다.");
	}
}*/
	public static void main(String[] args) {
		
		
		int booho = -1;
		int sum = 0;
		int num = 1;
		for(int i = 0; true; i++) {
			booho *=-1; //+1 //-1
			System.out.println(i+"번째"+booho);
			sum = sum +(booho*i); //sum = +1   -1*1+0=1      1*2
			System.out.println(sum);
			if(sum>=100) {
				num = i;
				break;
			}
			
		}
		
	}
}

