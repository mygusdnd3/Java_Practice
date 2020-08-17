package day22;

import java.io.*;
import java.util.*;
public class Test09_My {

	public Test09_My() {
	Properties prop = new Properties();
	
	FileInputStream fin = null;
	
	try{
		fin = new FileInputStream("src/day23/tel.txt");
		
		prop.load(fin);
		
	} catch(Exception e) {
		e.printStackTrace();
	}
	//Set set = prop.entrySet();//Set<Entry<Object,Object>>
	Set set = prop.keySet();
	//Iterator itor = set.iterator();
	//String msg="";
//	while(itor.hasNext()) {
//		Map.Entry ent = (Map.Entry)itor.next();
//		msg = msg +ent.getKey()+" : "+ent.getValue()+"\n";
//	}
	

	for(Object o : set) {
		System.out.println(o+" - "+ prop.get(o));
	}
	//System.out.println(msg);
	
	
	}

	public static void main(String[] args) {
		new Test09_My();
	}

}
