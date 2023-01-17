package collegeToCorporate;
import java.util.*;
public class NextPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find the next palindrome to it");
		int num = sc.nextInt();
		int nextPalindrome = num + 1;
		
		while(!(isPalindrome(nextPalindrome))) {
			nextPalindrome++;
		}
		
		System.out.println("The next palindrome number is " + nextPalindrome);
		
		sc.close();
	}
	
	public static boolean isPalindrome(int num) {
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
