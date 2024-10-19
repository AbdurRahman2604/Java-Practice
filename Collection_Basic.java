package com.collection.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection c1=new ArrayList();
		c1.add(100);
		c1.add(100);
		c1.add(200);
		c1.add("raja");
		c1.remove(100);
		
		boolean contains = c1.contains(100);
		System.out.println(c1);
		System.out.println(contains);
		Iterator iterator = c1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Collection c2=new ArrayList();
		c2.addAll(c1);
		System.out.println(c2);
		boolean equals = c1.equals(c2);
		System.out.println(equals);
		boolean containsAll = c2.containsAll(c1);
		System.out.println(containsAll);
		//c2.clear();
		int size = c2.size();
		System.out.println(size);
		}

	}


