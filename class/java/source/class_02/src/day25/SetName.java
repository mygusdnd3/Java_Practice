package day25;

import java.util.ArrayList;

public class SetName {

	public ArrayList<String> setName() {
		//rand = new ArrayList<String>();
		ArrayList<String> setRand = new ArrayList<String>();
		ArrayList<String> rand = new ArrayList<String>();
		rand.add("청하");
		rand.add("우지윤");
		rand.add("화사");
		rand.add("아이유");
		rand.add("조정석");
		rand.add("이하이");
		rand.add("지코");
		rand.add("브리트니스피어스");
		rand.add("크리스티나아길레나");
		rand.add("에이브릴라빈");
		rand.add("스테이시오리코");
		rand.add("켈리클락슨");
		rand.add("스위트박스");
		rand.add("힐러리더프");
		rand.add("M2M");
		rand.add("아쿠아");
		rand.add("스파이스걸스");
		rand.add("아토믹키튼");
		rand.add("알리샤키스");
		rand.add("제니퍼로페즈");
		rand.add("핑크");
		rand.add("비욘세");
		rand.add("자멜리아");
		rand.add("에반에센스");
		rand.add("아샨티");
		rand.add("마이클잭슨");
		rand.add("비틀즈");
		rand.add("비틀즈");
		rand.add("퀸");
		rand.add("엘비스프레슬리");
		rand.add("마돈나");
		rand.add("셀린디온");
		rand.add("머라이어캐리");
		rand.add("휘트니휴스턴");
		rand.add("사라맥라클란");
		rand.add("카펜터즈");
		rand.add("보이즈투맨");
		rand.add("웨스트라이프");
		rand.add("백스트리트보이즈");
		System.out.println(rand.size());
		for(int i = 0; i < 7; i++) {
			int a = (int)(Math.random()*38+1-1)-1;
			System.out.println(a);
			setRand.add(rand.get(i+a));
		}
	
		return setRand;
		
		
	}
}
