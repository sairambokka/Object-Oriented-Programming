package CollectionsDemo;
import java.util.*;


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

class Student {
	private int stdId;
	private String name;
	private Address addr;
	private double percentage;
	private int rank;
	
	public Student(int stdId, String name, Address addr, double percentage) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.addr = addr;
		this.percentage = percentage;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public Student() {
		super();
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student : Id -> " + stdId + ", Name -> " + name  + addr + ", Percentage -> " + percentage + "Rank -> " + rank;
	}
	
	
}

public class RankList {

	public static void main(String[] args) {
		
		Address addr1 = new Address("5-6-519", "Vanasthalipuram", "Hyderabad", "India");
		Address addr2 = new Address("A-57", "Pandara Road", "Delhi", "India");
		Address addr3 = new Address("733/S", "Vaidehi Nagar", "Hyderabad", "India");
		Address addr4 = new Address("471A", "Malakpet", "Hyderabad", "India");
		
		Student std1 = new Student(101, "Sairam", addr1, 83.4);
		Student std2 = new Student(102, "Abhishek", addr2, 78.9);
		Student std3 = new Student(103, "Aakash", addr3, 96.8);
		Student std4 = new Student(104, "Manish", addr4, 89.0);
		
		Student[] stdArray = {std1, std2, std3, std4};
		
		List<Student> stdList = new ArrayList<>();
		
		for(Student std : stdArray)
		{
			stdList.add(std);
		}
		
		
		
		Collections.sort(stdList, new compareByPercentage());
		
		for(int i = 0 ; i < stdList.size(); i++)
		{
			stdList.get(stdList.size() - i - 1).setRank(i + 1);
		}
		
		System.out.println("----------Student Details By Percentage----------");
		
		for(int i = 0; i < stdList.size(); i++)
		{
			System.out.println(stdList.get(stdList.size() - i - 1));
		}
		
		Collections.sort(stdList, new compareByID());
		
		System.out.println("----------Student Details By ID----------");
		
		for(Student std : stdList)
		{
			System.out.println(std);
		}

	}

}

class compareByPercentage implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return (int)(s1.getPercentage() - s2.getPercentage());
	}
	
}

class compareByID implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return (s1.getStdId() - s2.getStdId());
	}
	
}
