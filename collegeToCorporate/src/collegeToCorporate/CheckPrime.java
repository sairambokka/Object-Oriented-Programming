package collegeToCorporate;
import java.util.Scanner;
public class CheckPrime {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number : ");
		int number = sc.nextInt();
		
		if(checkPrime(number))
			System.out.println(number + " is a prime number");
		else
			System.out.println(number + " is not a prime number");
		
		sc.close();
	}

	public static boolean checkPrime(int number)
	{	
		for(int i = 2; i < number; i++)
		{
			if(number % i == 0)
				return false;
		}
		
		return true;
		
		
	}
}
