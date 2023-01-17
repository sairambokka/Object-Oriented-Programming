package CollectionsDemo;
import java.util.*;
class Employee{
	private int empId;
	private String name;
	private int salary;
	private static int idGen = 100;
	public Employee(String name, int salary) {
		super();
		this.empId = ++idGen;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
		this.empId = ++idGen;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee : empId -> " + empId + ", name -> " + name + ", salary -> " + salary;
	}
	
}
public class EmployeeDetails {
	
	public static void main(String[] args)
	{
		Employee emp1 = new Employee("Manish", 50000);
		Employee emp2 = new Employee("Sharan", 40000);
		Employee emp3 = new Employee("Revanth", 20000);
		Employee emp4 = new Employee("Shankar", 10000);
		Employee emp5 = new Employee("Joseph", 70000);
		
		List<Employee> Employees = new ArrayList<>();
		List<Employee> frshEmployees = new ArrayList<>();
		
		Employee[] empArray = {emp1, emp2, emp3, emp4, emp5};
		
		for(Employee emp : empArray)
		{
			Employees.add(emp);
		}
		
		System.out.println("---------EMPLOYEES----------");
		
		for(Employee emp : Employees)
		{
			System.out.println(emp);
		}
		
		for(Employee emp : Employees)
		{
			if(emp.getSalary() <= 20000)
				frshEmployees.add(emp);
		}
		
		Employees.removeAll(frshEmployees);
		
		System.out.println("---------FRESHERS-----------");
		
		for(Employee emp : frshEmployees)
		{
			System.out.println(emp);
		}
		
		System.out.println("----------EXPERIENCED-----------");
		
		for(Employee emp : Employees)
		{
			System.out.println(emp);
		}
	}
}
	
	
	
	


