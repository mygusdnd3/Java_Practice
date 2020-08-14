package my_practice;

class Stud {
	private String name;
	private int java, db, web, jsp, total;
	/*
		이 클래스는 단순히 학생의 이름과 점수를 저장만하고 있다.
		이 형태의 클래스를 VO(Value Object)클래스 라고 말하고
		이런 클래스들은 주로 데이터를 전달할 목적으로 사용되어진다.
		따라서 DTO(Data Transfer Object)라고 부르기도 한다.
		
		장점 ]
			1. 여러타입의 데이터를 한번에 전달 할 수 있다.
			2. 데이터를 꺼낼때 형변환을 해서 사용하지 않아도 된다.
		
	 */
	public String getName() {
		return name;
	}
	/*
	public void setName(Object o) {
		this.name = (String) o;
		// 이렇게 해도 처리는 되지만 이름에 다른 타입의 데이터가 입력될 수도 있으므로 이 방법은 피하는 것이 좋겠다.
	}
	*/
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = java + db + web + jsp;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Stud : name=" + name + ", java=" + java + ", db=" + db + ", web=" + web + ", jsp=" + jsp + ", total="
				+ total ;
	}
}