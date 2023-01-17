package Concepts;
class Employee
{
	private int empId;
	private String empName;
	private int annualSal;
	private static int idGen = 100;
	
	public Employee(String empName, int annualSal) {
		super();
		this.empId = ++idGen;
		this.empName = empName;
		this.annualSal = annualSal;
	}
	
	public Employee() {
		super();
		this.empId = ++idGen;
	}
	
	double calTax()
	{
		double tax = 0;
		if(this.annualSal <= 500000)
			tax = (0.1 * this.annualSal);
		else if(this.annualSal > 500000)
		{
			tax = (0.1 * 500000);
			tax += (0.2 * (this.annualSal - 500000));
		}
		
		else if(this.annualSal > 1000000)
		{
			tax = (0.1 * 500000);
			tax += (0.2 * 500000);
			tax += (0.3 * (this.annualSal - 1000000));
		}
		
		return tax;
		
	}

	@Override
	public String toString() {
		return empId + "----" + empName + "----" + annualSal + "----" + calTax();
	}
	
	
}
public class Organization {

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("Sairam", 500000);
		Employee emp2 = new Employee("Manish", 800000);
		Employee emp3 = new Employee("Revanth", 1200000);
		
		System.out.println("EmpId ---- EmpName ---- EmpCTC ---- Tax Applicable");
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
	}

}
