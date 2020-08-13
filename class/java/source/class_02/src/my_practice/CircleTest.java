package my_practice;

import java.util.*;
public class CircleTest {

	public CircleTest() {
		Vector v = new Vector();
		for (int i = 0; i <3; i++) {
			int rad =(int)(Math.random()*11);
			
			Circle c = new Circle();
			c.setRad(rad);
			c.setArround();
			c.setArea();
			v.add(c);
		}
	}

	public static void main(String[] args) {
		new CircleTest();
	}

}
