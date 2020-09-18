package tmp;

public class Stud {
	// 이 클래스는 학생 한명의 성적을 기억할 클래스이다.
	// 따라서 각 과목의 점수를 기억할 변ㅅ를 준비해준다.
	int java, oracle, html, jsp, total;

	// 생성자 함수를 만든다.
	public Stud() {
	}

	// 네 과목의 점수를 입력하면
	// 객체가 만들어지도록 하는 생성자 함수.
	public Stud(int java, int oracle, int html, int jsp) {

		this.java = java;
		this.oracle = oracle;
		this.html = html;
		this.jsp = jsp;
		setTotal();
	}

	// 총점을 구해주는 함수
	public void setTotal() {
		total = java + oracle + html + jsp;
	}
	
	// toString() 를 오버라이딩(함수의 재정의)
	
	public String toString() { 
	// 자바에서 자동호출? 클래스함수 프린트로
	//부르면
		return "java :"+java+" |orcvle :" + oracle + " |html:" +html
				+"|jsp :" +jsp+ " |Total : "+total;
	}
	
}
