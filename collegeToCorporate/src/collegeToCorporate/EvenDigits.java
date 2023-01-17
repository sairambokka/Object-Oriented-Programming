package collegeToCorporate;
import java.util.Scanner;
public class EvenDigits {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		
		if(checkEvenDigits(num))
			System.out.println(num + " has all even digits");
		else
			System.out.println(num + " does not have all even digits");
		
		sc.close();
	}
	
	public static boolean checkEvenDigits(int num)
	{
		while(num > 0)
		{
			int digit = num % 10;
			if(digit % 2 != 0)
				return false;
			num = num / 10;
		}
		
		return true;
	}

}
