package collegeToCorporate;
import java.util.Scanner;
public class NextPrimeNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number");
		int num = sc.nextInt();
		
		int nextPrime = nextPrimeNum(num);
		
		System.out.println("The next closest prime number to "+ num + " is " + nextPrime);
		
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
	
	
	public static int nextPrimeNum(int num)
	{
		for(int i = num + 1;;i++)
		{
			if(checkPrime(i))
				return i;
		}
	}
}
