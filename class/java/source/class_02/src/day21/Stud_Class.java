package day21;

public class Stud_Class implements Comparable {
	String name;
	int java, db, web, jsp, total;
	@Override
	public String toString() {
		return "점수표 : name=" + name + ", java=" + java + ", db=" + db + ", web=" + web + ", jsp=" + jsp
				+ ", total=" + total;
	}
	public String getName() {
		return name;
	}
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
	public void setTotal(int total) {
		this.total = total;
	}
	public void setTotal() {
		this.total = java+db+web+jsp;
	}
	@Override
	public int compareTo(Object o) {
		Stud_Class std = (Stud_Class)o;
		int total = std.getTotal();
		return this.total- total>0?1:-1;
	}
}
