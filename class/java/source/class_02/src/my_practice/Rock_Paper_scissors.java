package my_practice;

public class Rock_Paper_scissors {
	public static void main(String[] args) {
		// 두개의 랜덤한 값으로 가위바위보를 해보자

		// 랜덤값 생성

		String player1 = "";
		String player2 = "";
		String[] gameArr = { "가위", "바위", "보" };

		/*
		for (int i = 0; i < gameArr.length; i++) {
			System.out.println("i " + gameArr[i]);
			for (int j = 0; j < gameArr.length; j++) {

				System.out.println("j " + gameArr[j]);

			}
		}*/

		for (int k = 0; k < 2; k++) {
			for (int i = 0; i < gameArr.length; i++) {
				int tmp = (int) (Math.random() * 3);
				player1 = gameArr[tmp];
				//System.out.println("i " + gameArr[tmp]);
			}

			for (int j = 0; j < gameArr.length; j++) {
				int tmp = (int) (Math.random() * 3);
				player2 = gameArr[tmp];
				//System.out.println("j " + gameArr[tmp]);

			}
			

		}

		System.out.println("플레이어1 : "+ player1);
		System.out.println("플레이어2 : "+ player2);
	

	}
}
