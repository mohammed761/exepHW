package Exceptions;

public class Employee {
	private static int SALARY_MAXIMUM=40000;
	private String name;
	private int age;
	private double salary;
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		try {
			setSalary(salary);
		}
		catch(InvalidEmployeeSalaryException e){
			System.out.println("Incorrect salary"+ e.getMessage());
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) throws InvalidEmployeeSalaryException {
		if(salary>SALARY_MAXIMUM||salary<0)
			throw new InvalidEmployeeSalaryException("Incorrect salary");
		this.salary=salary;
	}
	@Override
	public String toString() {
		return " Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
}
