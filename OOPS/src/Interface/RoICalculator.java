package Interface;

interface Bank
{
	double calcROI();
}

class Customer
{
	private int investment;
	private int tenureInYears;
	
	public Customer(int investment, int tenureInYears) {
		super();
		this.investment = investment;
		this.tenureInYears = tenureInYears;
	}
	
	public int getInvestment() {
		return investment;
	}

	public void setInvestment(int investment) {
		this.investment = investment;
	}

	public int getTenureInYears() {
		return tenureInYears;
	}

	public void setTenureInYears(int tenureInYears) {
		this.tenureInYears = tenureInYears;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer investment = " + investment + ", tenureInYears = " + tenureInYears;
	}
	
	
	
	
}

class SBI implements Bank
{
	private Customer customer;
	private double rateOfInterest;
	
	public SBI(Customer customer, double rateOfInterest) {
		super();
		this.customer = customer;
		this.rateOfInterest = rateOfInterest;
	}

	public SBI() {
		super();
	}
	
	public double calcROI()
	{
		return  (customer.getInvestment() * customer.getTenureInYears() * rateOfInterest) / 100.0;
	}

	@Override
	public String toString() {
		return "SBI customer = " + customer + ", rateOfInterest = " + rateOfInterest + ", calcROI() = " + calcROI();
	}
	
	
	
}

class ICICI implements Bank
{
	private Customer customer;
	private double rateOfInterest;
	
	public ICICI(Customer customer, double rateOfInterest) {
		super();
		this.customer = customer;
		this.rateOfInterest = rateOfInterest;
	}
	
	public ICICI() {
		super();
	}
	
	public double calcROI()
	{
		return (customer.getInvestment() * customer.getTenureInYears() * rateOfInterest) / 100.0;
	}

	@Override
	public String toString() {
		return "ICICI customer = " + customer + ", rateOfInterest = " + rateOfInterest + ", calcROI() = " + calcROI();
	}
	
	
	
}

public class RoICalculator {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer(10000, 5);
		Customer cust2 = new Customer(7000, 3);
		Customer cust3 = new Customer(8500, 2);
		Customer cust4 = new Customer(20000, 10);
		
		SBI customer1 = new SBI(cust1, 5.5);
		SBI customer2 = new SBI(cust3, 3);
		
		SBI[] custArray1 = {customer1, customer2};
		
		System.out.println("-------------SBI---------------");
		
		for(SBI cust : custArray1)
			System.out.println(cust);
		
		ICICI customer3 = new ICICI(cust2, 7);
		ICICI customer4 = new ICICI(cust4, 6);
		
		ICICI[] custArray2 = {customer3, customer4};
		
		System.out.println("------------ICICI-------------");
		
		for(ICICI cust : custArray2)
			System.out.println(cust);
		

	}

}
