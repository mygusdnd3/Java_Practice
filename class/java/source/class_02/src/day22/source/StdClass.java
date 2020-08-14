package day22.source;

public class StdClass {
	private String name;
	private int ban;
	private int score;
	public StdClass(String name) {
		this.name = name;
	}
	public void setData(int ban, int score) {
		this.ban = ban;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ban;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		
		return true;
	}
	@Override
	public String toString() {
		return "StdClass : name=" + name + ", ban=" + ban + ", score=" + score;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
