package collegeToCorporate;
import java.util.Scanner;
public class SumOfFactors {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		int sumOfFactors = calSumOfFactors(num);
		
		System.out.println("The sum of factors of " + num + " is "+ sumOfFactors);
		
		sc.close();
	}
	
	public static int calSumOfFactors(int num)
	{
		int sum = 0;
		
		for(int i = 1; i <= Math.sqrt(num); i++)
		{
			if(num % i == 0)
				sum = sum + i + (num / i);
		}
		
		return sum;
	}

}
