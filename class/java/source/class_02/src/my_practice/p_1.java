package my_practice;

public class p_1 {
	public static void main(String[] args) {
		System.out.printf("%5d, %n%5d, %n%5d", 168 & 245, 168 | 245, 168 ^ 245);
		System.out.printf("%d,%d,%d", 168 & 245, 168 | 245, 168 ^ 245);

		int[] array = { 1, 2, 3, 4, 5, 6 };
		int cnt = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
//		do {
//			i++;
//			System.out.println("index :"+cnt+"데이터"+array[i]);
//		}
//		while(cnt++<array.length);

		while (cnt++ < 5) {
			int no = 3;
			if (no == 2) {
				break;
			} else {
				System.out.println(no % 2 == 0 ? "짝수" : "홀수");
				continue;
			}

		}
	}
}
