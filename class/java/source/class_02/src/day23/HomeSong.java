package day23;

import day23.source.*;
import java.util.*;

/*
 	가수를 와 노래를 넣고 출력하는 TreeMap
 */
public class HomeSong {

	List<String> artist = new ArrayList<String>();
	public HomeSong() {
		
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

		artist.add("ITZY");
		artist.add("세정");
		artist.add("드림캐쳐");
		
		
		
		List<String> itzySong = new ArrayList<String>();
		itzySong.add("Not Shy");
		itzySong.add("Don’t Give A What");
		itzySong.add("Louder");
		itzySong.add("iD");
		
		
		setSong(itzySong);
//		Set<String> set = new HashSet<String>();
		
		
		
		
		
	}
	public void setSong(List<String> song) {
		
		Songs songs = new Songs(artist.get(0),song);
						
	}

	public static void main(String[] args) {
		new HomeSong();

	}

}

