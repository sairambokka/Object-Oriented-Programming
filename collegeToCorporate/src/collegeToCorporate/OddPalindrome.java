package collegeToCorporate;
import java.util.Scanner;
public class OddPalindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the starting number : ");
		int start = sc.nextInt();
		
		System.out.println("Enter ending number : ");
		int end = sc.nextInt();
		
		for(int i = start + 1; i < end; i++)
		{
			if(checkPalindrome(i) && checkOddDigits(i))
				System.out.print(i + " ");
		}
		
		sc.close();
	}
	
	public static boolean checkPalindrome(int num)
	{
		int reverseNum = 0;
		int temp = num;
		while(temp > 0)
		{
			int digit = temp % 10;
			reverseNum = (reverseNum * 10) + digit;
			temp = temp / 10;
		}
		
		if(num == reverseNum)
			return true;
		else 
			return false;
	}
	
	public static boolean checkOddDigits(int num)
	{
		while(num > 0)
		{
			int digit = num % 10;
			if(digit % 2 == 0)
				return false;
			num = num / 10;
		}
		return true;
	}
	

}
