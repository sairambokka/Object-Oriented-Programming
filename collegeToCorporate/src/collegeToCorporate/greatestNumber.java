package collegeToCorporate;
import java.util.Scanner;
public class greatestNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers");
		String[] numbers = sc.nextLine().split(" ");
		
		int maxNumber = calMaximum(numbers);
		
		System.out.println("The greatest of all numbers is " + maxNumber);
		
		sc.close();
	}
	
	public static int calMaximum(String[] numbers)
	{
		int max = Integer.parseInt(numbers[0]);
		
		for(int i = 1;i < numbers.length; i++)
		{
			int num = Integer.parseInt(numbers[i]);
			if(num > max)
				max = num;
		}
		
		return max;
	}

}
