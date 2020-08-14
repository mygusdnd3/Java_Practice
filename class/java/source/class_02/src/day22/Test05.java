package day22;

import java.util.HashSet;

public class Test05 {

	public Test05() {
		HashSet set = new HashSet();
		set.add("고길동");
		set.add("고길둥");
		set.add("둘셋");
		set.add("둘넷");
		set.add("둘다섯");
		set.add("둘여섯");
		set.add("둘일곱");
		set.add("둘여덜곱");
		set.add("둘아홉곱");
		set.add("둘열곱");
		set.add("고길둥");
		set.add("1");
		
		for(Object o : set) {
			//System.out.println(o + " | "+o.hashCode());
			System.out.println(String.format("%5s", o)+ " | "+String.format("%10d", o.hashCode()));
		}
	}

	public static void main(String[] args) {
		new Test05();
	}

}
