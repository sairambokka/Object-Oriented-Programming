package arrays;
import java.util.Scanner;
public class MultipleOfTen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array : ");
		int len = sc.nextInt();
		
		int[] intArray = new int[len];
		System.out.println("Enter the elements of the array : ");
		
		for(int i=0; i < intArray.length; i++)
		{
			intArray[i] = sc.nextInt();
		}
		
		checkMultipleofTen(intArray);
		
		for(int number : intArray)
			System.out.println(number);
		
		sc.close();
	}
	
	public static void checkMultipleofTen(int[] intArray)
	{
		for(int i=0; i < intArray.length; i++)
		{
			while(!(intArray[i] % 10 == 0))
			{
				intArray[i] += (10 - (intArray[i] % 10));
			}
		}
	}

}
