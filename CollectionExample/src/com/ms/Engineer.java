package com.ms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Eng  {
	
	private int id;
	private String name;
	
	
	
	public Eng(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Eng [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
	
}

public class Engineer {
	
	public static void main(String args[]) {
		Eng eng4=new Eng(13,"India");
		Eng eng=new Eng(1,"India");
		Eng eng1=new Eng(102,"India");
		Eng eng2=new Eng(199,"India");
		Eng eng3=new Eng(41,"India");
		List<Eng> al=new ArrayList<Eng>();
		al.add(eng);
		al.add(eng1);
		al.add(eng2);
		al.add(eng3);
		al.add(eng4);
		
		
		System.out.println(al);
		
		Collections.sort(al,new IdComparator() );
		
		for(Eng s:al) {
			
			System.out.println(s.getId()+""+s.getName());
			
		}
		
		
		
		
	}

}
