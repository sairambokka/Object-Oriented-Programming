package collegeToCorporate;
import java.util.Scanner;
public class averageOfNumbers {

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers to find average");
		String[] numbers  = sc.nextLine().split(" ");
		
		double average = calAverage(numbers);
		
		System.out.println("Average of given numbers is : " + average);
		
		sc.close();
	}
	
	public static double calAverage(String[] numbers)
	{
		int sum = 0;
		int len = numbers.length;
		for(int i = 0;i < len; i++)
		{
			int num = Integer.parseInt(numbers[i]);
			sum += num;
		}
		
		return (double)sum / len;
	}

}