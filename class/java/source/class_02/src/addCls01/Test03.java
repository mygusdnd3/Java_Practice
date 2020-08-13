package addCls01;

import java.util.*;
public class Test03 {

	public Test03() {
	Object o = "abc";
	System.out.println(o.equals("abc"));
	
	Comparator c1 = new MyComp01();
	System.out.println(c1.compare("abc","ab"));
	
	Comparator[] cArr = new Comparator[3];
	cArr[0] = new MyComp01();
	cArr[1] = new MyComp02();
	cArr[2] = new MyComp03();
	
	for (int i = 0; i < cArr.length; i++) {
		System.out.println(cArr[i].compare("abc", "efg"));
	}
	
	}

	public static void main(String[] args) {
		new Test03();
	}

}

class MyComp01 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		return 1;
	}
	
}
class MyComp02 implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		return 2;
	}
	
}
class MyComp03 implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		return 3;
	}
	
}
