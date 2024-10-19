package com.collection.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*List l1 = new ArrayList();
		l1.add(100);
		// l1.add("raja");
		l1.add(200);
		l1.add(300);
		l1.add(200);
		l1.add(500);
		// l1.add("");
		Collections.sort(l1);

		Object object = l1.get(0);
		System.out.println(object);
		l1.remove(1);
		// l1.clear();
		l1.set(0, 1000);
		System.out.println(l1);
		l1.isEmpty();
		int size = l1.size();
		System.out.println(size);
		int indexOf = l1.indexOf(5);
		System.out.println(indexOf);
//		String string = l1.toString();
//		System.out.println(string);
//	
		List l2 = new ArrayList();
		l1.addAll(l2);
		boolean equals = l1.equals(l2);
		System.out.println(equals);
		Iterator iterator = l1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		ListIterator listIterator = l1.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}*/
		
		
		
		
		
		
		
		
		List l3=new LinkedList();
		l3.add(1000);
		l3.add(1);
		l3.add(0, 3);
		l3.add(1);
		System.out.println(l3);
		Object object = l3.get(1);
		System.out.println(object);
		
		List l4=new Vector();
		//l4.add("raja");
		l4.add(12);
		l4.add(12);
		l4.add(2);
		Collections.sort(l4);
		System.out.println(l4);

	}

}
