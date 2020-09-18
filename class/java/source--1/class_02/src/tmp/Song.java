package tmp;

public class Song {
	String songName;
	String singer;
	String runTime;
	String writer;
	
	public Song() {
		//생성자 함수는 클래스 이름과 동일한 이름을 사용해야 하고
		//반환값이 존재하면 절대로 안된다.
		
		//만약 모든노래는 블랙핑크의 아무거나로 셋팅이 되게한다면
		/*
		songName = "아무거나..";
		singer = "블랙핑크";
		writer = "테디";
		runTime = "00:04:30";
		*/
	}
	//기본 생성자 함수 오버로딩
	//노래가 가지는 기본 정보를 가지고 객체를 만들도록하려고 하니
	public Song(String songName, String singer, String writer, String runTime) {
		this.songName = songName;
		this.singer = singer;
		this.writer = writer;
		this.runTime = runTime;
	}
	
	//곡의 정보를 출력하는 전담 처리 함수
	public void toPrint() {
		//songName = "";
		//출력에 필요한 정보는 전역변수에 선언이 되어있으므로
		//전역변수에 접근해서 출력하면 된다.
		
		System.out.printf("%-30s - %25s - %25s - %8s\n", songName,singer,writer,runTime);
	}
	
}
