package day12;

/*
 	1.
 	1 노래 한곡을 저장할 클래스를 정의하고
 	2 앨범 한장(12곡) 을 저장할 배열을 만들고
 	3 내용을 출력하는 프로그램을 작성하세요
 	 
 	 2. 곡 명을 입력하면 해당 곡의 정보를 출력하도록 하세요
 */
public class Ex01 {

	Track[] track;
	String[] title;
	String[] artist;
	String[] genre;

	public Ex01() {
		setArr();
		setTrack();
		toPrint();
	}

	// track = new Track[12];
	public void setArr() {

		title = new String[] { "다시 여기 바닷가", "마리아", "How You Like That","Summer Hate (Feat. 비)","Downtown Baby","에잇","홀로","아로하","보라빛밤","Dolphin","어떻게지내","Memories" };
		artist = new String[] { "싹쓰리", "화사", "BlackPink","ZICO","블루" ,"아이유","이하이","조정석","선미","오마이걸","오반","Maroon5"};
		genre = new String[] { "댄스", "댄스,발라드", "랩,힙합","랩,힙합","랩/힙합,인디","록/메탈","R&B/Soul","발라드","댄스","댄스,발라드","랩,힙합","POP" };
		
	}

	public void setTrack() {
		//setArr();
		track = new Track[title.length];
		
		
		for (int i = 0; i < track.length; i++) {
			track[i] = new Track();
			track[i].setTrack(title[i], artist[i], genre[i]);
			
		}
	}
	
	public void toPrint() {
		for (int i = 0; i < track.length; i++) {
			System.out.println((i+1)+"번째 트랙");
			track[i].toPrint();
		}
	}

	

	public static void main(String[] args) {
		new Ex01();
	}

}

class Track { // 트랙이 12개가 앨범 1장.

	String title; // 제목
	String artist; //
	String genre;

	// 접근해서 내용 변경할수 있는 함수
	public void setTrack(String title, String artist, String genre) {
		this.title = title;
		this.artist = artist;
		this.genre = genre;
	}
	public void toPrint() {
//		System.out.printf("곡명 : %s \t 아티스트 : %s \t 장르 : %s"+this.title,this.artist,this.genre);
		//System.out.println("노래 제목 :"+this.title+"\t|\t가   수 :"+this.artist+"|\t장    르 :"+this.genre);
		//System.out.printf("노래 제목 : %-15s |가    수 : %-10s \t 장    르 : %-10s\n",this.title,this.artist,this.genre);
		System.out.println("노래 제목 : " + this.title);
		System.out.print("가     수 : " + this.artist+"\t");
		System.out.println("장     르 : " + this.genre);
		System.out.println("----------------------------------------------------------------------");
		
	}

}

class MyAlbum { // ?
	Track[] track = new Track[12];

}
