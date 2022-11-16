package com.mp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ExHashMap {
	
	
	public static void main(String args[]) {
		
		Map<String,Integer> hm=new HashMap<String,Integer>();
		
		hm.put("mahadev", 100);
		hm.put("china", 300);
		hm.put("Bangalaore", 103);
		hm.put("Bidar", 106);
		hm.put("Mysore", 130);
		hm.put("Kalburgi", 500);
		
		
		System.out.println(hm);
		
		Iterator it=hm.entrySet().iterator();
		
		while(it.hasNext()) {
			
			 Map.Entry me = (Map.Entry) it.next();
			 System.out.println(me.getKey()+""+me.getValue());
		}
		
		System.out.println("---------iterate for loop value---------");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
		
		
	}

}
