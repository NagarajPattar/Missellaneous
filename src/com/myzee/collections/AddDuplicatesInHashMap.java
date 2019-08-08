package com.myzee.collections;

import java.util.HashMap;
import java.util.Map;

public class AddDuplicatesInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m = new HashMap<Integer, String>();
		m.put(new Integer(1), "nagaraj");
		m.put(new Integer(1), "pattar");	// HashMap dont allow duplicates.
		
		System.out.println(m);
	}

}
