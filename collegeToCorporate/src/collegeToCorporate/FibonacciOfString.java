package collegeToCorporate;
import java.util.*;
public class FibonacciOfString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string to find fibonacci sum : ");
		String str = sc.next();
		
		int sum = checkPosAndCalSum(str);
		
		System.out.println("The sum of fibonacci series created by " + str + " is " + sum);
		
		sc.close();
	}
	
	public static int checkPosAndCalSum(String str)
	{
		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int[] fibArray = fibArray(alphabets.length());
		int sum = 0;
		for(int i = 0; i < str.length(); i++)
		{
			sum += fibArray[alphabets.indexOf(str.charAt(i))];
		}
		
		return sum;
			
	}
	
	public static int[] fibArray(int size)
	{
		int[] fibArray = new int[size];
		fibArray[0] = 0;
		fibArray[1] = 1;
		
		for(int i = 2; i < fibArray.length; i++)
		{
			fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
		}
		
		return fibArray;
	}

}
