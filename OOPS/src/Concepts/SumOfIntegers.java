package Concepts;
import java.util.Scanner;
public class SumOfIntegers {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements you want to add : ");
		int len = sc.nextInt();
		
		int[] numbers = new int[len];
		
		System.out.println("Enter elements to be added");
		
		for(int i=0; i < numbers.length; i++)
			numbers[i] = sc.nextInt();
		
		System.out.println("Sum : " + calSum(numbers));
		
		sc.close();
	
	}
	
	public static int calSum(int[] numbers)
	{
		int sum = 0;
		for(int number : numbers)
			sum += number;
		return sum;
	}

}
