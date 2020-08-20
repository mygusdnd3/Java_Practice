package day25;

import java.io.FileWriter;

/*
 	문자 단위로 파일에 데이터를 저장하는 프로그램을 작성해보자.
 */
public class Test03 {

	public Test03() {
		FileWriter fw = null;
		try {
			// ㅅ트림 만들고
			fw = new FileWriter("src/day25/doc/fileTest01.txt");
			
			//1. 한글자(2바이트)만 저장해보자
			char ch = '않';
			fw.write(ch);
			char ch2 ;
			String str = "2020년 8월 19일 수요일\r\n" + 
					"[W] [오전 11:47] 저희집 앞 목감천은...\r\n" + 
					"[서 현웅] [오전 11:47] 사진\r\n" + 
					"[서 현웅] [오전 11:47] 그..\r\n" + 
					"[서 현웅] [오전 11:47] 신정교앞에\r\n" + 
					"[서 현웅] [오전 11:47] 차로오셔가지고\r\n" + 
					"[서 현웅] [오전 11:47] 타셔도 될거같은데욤?\r\n" + 
					"[W] [오전 11:47] ㅋㅋㅋㅋㅋㅋ\r\n" + 
					"[서 현웅] [오전 11:47] 이모티콘\r\n" + 
					"[W] [오전 11:48] 살수차로 자도나 인도쪽을 세척하는데\r\n" + 
					"[W] [오전 11:48] 물이 그 이상 차거 그런지\r\n" + 
					"[W] [오전 11:49] 오물냄세도 좀 나고 그러더라구요...\r\n" + 
					"[서 현웅] [오전 11:49] 언능 안장도 확인해보시구 해보셔야죵..\r\n" + 
					"[서 현웅] [오전 11:49] 아직도\r\n" + 
					"[서 현웅] [오전 11:49] 아직도똥내나요?ㄷㄷㄷㄷ\r\n" + 
					"[서 현웅] [오전 11:49] 미르스틴\r\n" + 
					"[W] [오전 11:49] 비가 한번 더 와야 하는데\r\n" + 
					"[W] [오전 11:49] 소나기 같은걸로...\r\n" + 
					"[W] [오전 11:49] 그리고 이번에 도싸보니...\r\n" + 
					"[W] [오전 11:50] 앞으로 세파스 쪽은 걸러야 겠더군요...\r\n" + 
					"[서 현웅] [오전 11:50] 가관이던데요?\r\n" + 
					"[서 현웅] [오전 11:50] ㅋㅋㅋㅋ전용 싯포스트가 ㅋㅋㅋ\r\n" + 
					"[서 현웅] [오전 11:50] 저걸 힘으로 돌리는 ㄸㄹㅇ들..\r\n" + 
					"[W] [오전 11:50] 미친거죠...\r\n" + 
					"[W] [오전 11:50] 거기에 크랙까지..\r\n" + 
					"[서 현웅] [오전 11:50] 이래서 수입사가 진짜 이미지 개똥망시키는거같아여\r\n" + 
					"[서 현웅] [오전 11:50] 대진바바여\r\n" + 
					"[서 현웅] [오전 11:50] 씹새끼들\r\n" + 
					"[W] [오전 11:50] ㅋㅋㅋㅋㅋㅋ\r\n" + 
					"[서 현웅] [오전 11:50] 답은..\r\n" + 
					"[서 현웅] [오전 11:51] 스페셜인가...\r\n" + 
					"[W] [오전 11:51] 슾샬이나 트렉쪽으로...\r\n" + 
					"[서 현웅] [오전 11:51] 트렉터는 프레임도 교환용 프레임 따로 재고 있는거같더라구용?\r\n" + 
					"[W] [오전 11:52] ㅋㅋㅋ근데 아직 기변은 나중에 생각해야죠ㅋㅋ\r\n" + 
					"[서 현웅] [오전 11:52] 그죠그죠 ㅋㅋ\r\n" + 
					"[서 현웅] [오전 11:52] 일단 이슈있을때 묻어가기위해서\r\n" + 
					"[서 현웅] [오전 11:52] 언능 문제확인이 필요하다~\r\n" + 
					"[서 현웅] [오전 11:52] 이런 이야기죠 !\r\n" + 
					"[W] [오전 11:52] 그렇죠...ㅋㅋ\r\n" + 
					"[W] [오전 11:53] 아직까지는 괜찮은거 같은데\r\n" + 
					"[W] [오전 11:53] 세파스 미케닉을 일단 느껴봤으니\r\n" + 
					"[W] [오전 11:53] 요즘 자장구 못타면서 느끼는건데\r\n" + 
					"[W] [오전 11:53] 사람 몸이 이렇게 안좋아질 수 있구나 싶더군요..ㅋㅋㅋ\r\n" + 
					"[W] [오전 11:54] 살만찌고 소화불량 자주 오고\r\n" + 
					"[서 현웅] [오전 11:54] 유산소가\r\n" + 
					"[서 현웅] [오전 11:54] 전혀 안되니까요 ㅠ..\r\n" + 
					"[W] [오전 11:54] 진짜 계단오르기랑 다른 차원의 운동이니..\r\n" + 
					"[W] [오전 11:55] 글고 망할놈의 코로나는 왜 또\r\n" + 
					"[W] [오전 11:55] 이정도 날씨에는 자도 한가한데 일하면서 지나가다보면 그렇지도 않더라구요...\r\n" + 
					"[서 현웅] [오전 11:56] 코로나 어우...쓰블..\r\n" + 
					"[서 현웅] [오전 11:56] 자도에 사람 많나보죵?\r\n" + 
					"[W] [오전 11:58] 주로 동쪽\r\n" + 
					"[W] [오전 11:58] 그니까 잠실이나 탄천쪽인데\r\n" + 
					"[W] [오전 11:58] 그쪽은 좀 보이더라구요\r\n" + 
					"[서 현웅] [오전 11:58] 아\r\n" + 
					"[서 현웅] [오전 11:58] 아무래도 그쪽이 길이 넓어서\r\n" + 
					"[서 현웅] [오전 11:59] 복구ㅏㄱ 좀 빠른거같아요\r\n" + 
					"[서 현웅] [오전 11:59] 잠수교도 그러혹\r\n" + 
					"[W] [오전 11:59] 그리고 서울공항은 팩라때가...\r\n" + 
					"[서 현웅] [오전 11:59] 남산가는사람들 있던데요?\r\n" + 
					"";
			char[] chArr = str.toCharArray();
			fw.write(str);	//??????????되네?
			
			/*
			  	char 단위는 텍스트 데이터만 처리하도록 되어 있기 때문에
			  	기본함수에 + 문자 처리기능이 추가되어 있다.
			 
			 */
//			for(int i = 0; i < str.length(); i++) {
//				ch2 = str.charAt(i); 
//				fw.write(ch2);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}