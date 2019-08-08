package com.myzee.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class AddIntegerStringInList {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add(4);
		l.add(8);
		l.add("nagaraj");
		l.add(new HashMap<Integer, String>());
		
		Collections.sort(l);
		System.out.println(l);
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(4);
		l1.add(8);
		l1.add("nagaraj");
		
		Collections.sort(l1);
		System.out.println(l1);
		
	}

}
