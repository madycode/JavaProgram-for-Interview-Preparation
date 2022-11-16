package com.ms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee600 {
	 
    private String name;
    private String account;
    private Integer salary;
 
    public Employee600(String name, String account, Integer salary) {
        super();
        this.name = name;
        this.account = account;
        this.salary = salary;
    }
 
    @Override
    public String toString() {
 
        return "name: "+ this.name +" | account: "+ this.account +" | salary: "+this.salary;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getAccount() {
        return account;
    }
 
    public void setAccount(String account) {
        this.account = account;
    }
 
    public Integer getSalary() {
        return salary;
    }
 
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}

public class StreamAPITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values=Arrays.asList(1,101,300,21,80);
	//	values.stream().filter(x)
		
		//values.stream()
          //      .noneMatch(e -> values.stream().filter(x->x.toString().charAt(0)));
		
	//List list=	values.stream().filter(e->e.toString().startsWith("1").collect(Collectors.toList()));
	
	//list.forEach(System.out::println);
	
	// list.forEach(System.out::println);
	
//	System.out.println(list);
		
	//	System.out.println(oi.isPresent()? "Found: "+oi.getAsInt() : "Not found");
	
	
	
	 List<Employee600> empList = new ArrayList<>();
     empList.add(new Employee600("Nataraja G", "Accounts", 8000));
     empList.add(new Employee600("Nagesh Y", "Admin", 15000));
     empList.add(new Employee600("Vasu V", "Security", 2500));
     empList.add(new Employee600("Amar", "Entertinment", 12500));
     
     empList.stream().filter(x->x.getSalary()>10000).forEach(System.out::println);
     
                                               
	}

}
