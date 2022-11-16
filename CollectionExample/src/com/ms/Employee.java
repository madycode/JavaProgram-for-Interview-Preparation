package com.ms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

class Test200 implements Comparable<Test200>{
	
	private int id;
	private String name;
	private String country;
	private String profession;
	
	
	
	
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




	public String getCountry() {
		return country;
	}




	public void setCountry(String country) {
		this.country = country;
	}




	public String getProfession() {
		return profession;
	}




	public void setProfession(String profession) {
		this.profession = profession;
	}




	public Test200(int id, String name, String country, String profession) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.profession = profession;
	}




	@Override
	public int hashCode() {
		return Objects.hash(country, id, name, profession);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test200 other = (Test200) obj;
		return Objects.equals(country, other.country) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(profession, other.profession);
	}




	@Override
	public int compareTo(Test200 o) {
		// TODO Auto-generated method stub
		
		if(id==o.id) {
			return 0;
		}else if(id>o.id){
			return 1;
		} 
		return -1;
		
	}
	
	
	
	
	
	
}


public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Test200> al=new ArrayList<Test200>();  
		
		
		Test200 t=new Test200(100,"Mahadev","India","SoftwareEngineer");
		Test200 t1=new Test200(1,"Mahadev","India","SoftwareEngineer");
		
		al.add(t1);
		al.add(t);
		
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());
		
		Collections.sort(al);

		
		for(Test200 tt:al) {
			System.out.println(tt.getId()+" "+tt.getName()+" "+tt.getCountry()+" "+tt.getProfession());
		}
		//HashMap<Test200,Integer> hm=new HashMap<Test200,Integer>();
		//hm.put(t1, 200);
		//hm.put(t, 300);
	}

}
