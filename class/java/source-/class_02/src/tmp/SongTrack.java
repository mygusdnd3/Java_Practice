package tmp;

public class SongTrack {


		public SongTrack() {
		Song[] album = new Song[12];
		
			// 이 상태는 배열의 각 방에 데이터가 채워진 것은 아니고
			// 데이터를 채울 방만 준비해 놓은 상태가 된다.
			// 따라서 각방에는 데이터를 new 시켜서 채워줘야 한다.

			// 데이터 준비
			/*String[] songName = { "붐바야." + "마지막처럼." + "How you like that." + "Kill this Love." + "뚜두뚜두." + "Forever Young."
					+ "Stay." + "휘파람." + "불장난." + "Really" + "Kick it" + "See U later." };
			String singer = "블랙핑크";
			String writer = "테디";
			String[] runTime = { "00:03:14", "00:03:14", "00:03:14", "00:03:14", "00:03:14", "00:03:14", "00:03:14",
					"00:03:14", "00:03:14", "00:03:14", "00:03:14", "00:03:14" };
*/
		
		
		String[] songName = { "붐바야." + "마지막처럼." + "How you like that." + "Kill this Love." + "뚜두뚜두." + "Forever Young."
				+ "Stay." + "휘파람." + "불장난." + "Really" + "Kick it" + "See U later." };
		String singer = "블랙핑크";
		String writer = "테디";
		String[] runTime = { "00:03:14", "00:03:14", "00:03:14", "00:03:14", "00:03:14", "00:03:14", "00:03:14",
				"00:03:14", "00:03:14", "00:03:14", "00:03:14", "00:03:14" };
			// 각 방에다 데이터를 채워준다.
			//public Song1(String songName, String singer, String writer, String runTime
			for (int i = 0; i < album.length; i++) {
				album[i] = new Song(songName[i], singer, writer, runTime[i]);
			}

			// 출력
			// 클래스에 자신의 내용을 출력하는 기능을 구현해놨으므로 사용하면 된다.
			for (int i = 0; i < album.length; i++) {
				album[i].toPrint();
			}
		}

	

	
	/*
 
	public SongTrack() {
		Song[] album = new Song[12];
		//이 상태는 배열의 각 방에 데이터가 채워진 것은 아니고
		//데이터를 채울 방만 준비해 놓은 상태가 된다.
		//따라서 각 방에는 데이터를 new 시켜서 채워 줘야 한다.
		//데이터 준비하고
		String[] songName = {	"INTRO : Calling",  
								"Stay Gold" ,
								"Boy With Luv -Japanese ver.-" , 
								"Make It Right -Japanese ver.-" , 
								"Dionysus -Japanese ver.-" ,
								"IDOL -Japanese ver.-" ,
								"Airplane pt.2 -Japanese ver.-" , 
								"FAKE LOVE -Japanese ver.-" , 
								"Black Swan -Japanese ver.-" , 
								"ON -Japanese ver.-" , 
								"Lights" , 
								"Your eyes tell"};
		String singer =			"방탄소년단";
		String writer = 		"RM";
		String[] runTime = {
				"00:00:30","00:03:07","00:04:05",
				"00:04:05","00:05:02","00:03:30",
				"00:06:05","00:07:30","00:03:30",
				"00:04:50","00:06:54","00:04:20",
		};
		// 각 방에 데이터를 채워넣느다.
		for (int i = 0; i < album.length; i++) {
			album[i] = new Song(songName[i],singer,writer,runTime[i]);
		}
		
		// 출력한다. 이미 클래스 자신의 내용을 출력하는 기능을 구현해놓아씅니
		//사용하면 되겠다.
		for (int i = 0; i < album.length; i++) {
			album[i].toPrint();
		}
		
	}
	*/

	public static void main(String[] args) {
		new SongTrack();
	}

}
