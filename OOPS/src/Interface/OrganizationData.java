package Interface;

class Address
{
	private String HouseNo;
	private String locality;
	private String city;
	private String country;
	
	public Address(String houseNo, String locality, String city, String country) {
		super();
		HouseNo = houseNo;
		this.locality = locality;
		this.city = city;
		this.country = country;
	}
	
	public Address() {
		super();
	}

	public String getHouseNo() {
		return HouseNo;
	}

	public void setHouseNo(String houseNo) {
		HouseNo = houseNo;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString()
	{
		return HouseNo + ", " + locality + ", " + city + ", " + country + ".";
	}
	
}

class Employee
{
	private int empId;
	private String name;
	private Address address;
	private static int idGen = 100;
	
	public Employee(String name, Address address) {
		super();
		this.empId = ++idGen;
		this.name = name;
		this.address = address;
	}

	public Employee() {
		super();
		this.empId = ++idGen;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String toString()
	{
		return "Employee : " +empId +"---"+ name + "---" + address;
	}
	
}

public class OrganizationData {

	public static void main(String[] args) 
	{
		Address addr1 = new Address("5-6-519", "Vanasthalipuram", "Hyderabad", "India");
		Address addr2 = new Address("A-57", "Pandara Road", "Delhi", "India");
		
		Employee emp1 = new Employee("Sairam", addr1);
		Employee emp2 = new Employee("Shivani", addr2);
		
		Employee[] empArray = {emp1, emp2};
		
		System.out.println("----------EMPLOYEE DATA-----------");
		
		for(Employee emp : empArray)
			System.out.println(emp);
	}

}
