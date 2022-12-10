package ques3;


public class Employee {
	
	int id;
	String name;
	int salary;
	int year;
	public Employee(int id, String name, int salary, int year) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.year = year;
	}
	
	public void inc()
	{
		if(year>=3)
		{
			System.out.println(salary = salary + (salary*10)/100);
		}
	}
	
	

}