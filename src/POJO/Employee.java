package POJO;

//POJO - Plain Old Java Object
public class Employee {
	
	private String name;
	private  String id;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(String name, String id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}		

}

//The POJO class must be public.
//It must have a public default constructor.
//It may have the arguments constructor.
//All objects must have some public Getters and Setters to access the object values by other Java Programs.
//The object in the POJO Class can have any access modifies such as private, public, protected. But, all instance variables should be private for improved security of the project.
//A POJO class should not extend predefined classes.
//It should not have any pre specified annotation.
