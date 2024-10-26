package com.collection.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String,String> m=new HashMap<String,String>();
		m.put("Apple", "5 kg");
		m.put("Orange","10 kg");
		m.put("mango","1 kg");
		m.put("pomo","2kg");
		m.put("grapes","3kg ");
		
		
		
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		

		for (String value:m.values()) {
			System.out.println(value);
		}
		
		Set<Entry<String, String>> entrySet = m.entrySet();
		
		System.out.println(entrySet);
		System.out.println("***********for each loop***********");
		for(Entry<String,String> kv:m.entrySet()) {
			System.out.println(kv);
		}
		
		System.out.println("***********Iterator***********");
		Iterator<Entry<String, String>> iterator = m.entrySet().iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		m.remove(1);
		System.out.println(m);
		
		
		Map m1=new TreeMap();
		m1.put(1,"raja");
		m1.put(2,"mona");
		m1.put(3,"naailah");
		Object object = m1.get(1);
		System.out.println(object);
		boolean containsKey = m1.containsKey(3);
		boolean containsValue = m1.containsValue("naailah");
		System.out.println(containsKey);
		System.out.println(containsValue);
		
		
		
	}

}
