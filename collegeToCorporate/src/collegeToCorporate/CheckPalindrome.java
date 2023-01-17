package collegeToCorporate;
import java.util.*;
public class CheckPalindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you number : ");
		int num = sc.nextInt();
		
		if(checkPalindrome(num))
			System.out.println(num + " is a palindrome number");
		else
			System.out.println(num + " is not a palindrome number");
		
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

}
