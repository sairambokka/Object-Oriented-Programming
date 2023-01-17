package arrays;
import java.util.*;
public class LargestNumber {

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
		
		System.out.println("The largest number in given array is : " + calMax(intArray));
		
		sc.close();

	}

	public static int calMax(int[] intArray) {
		
		int max = intArray[0];
		
		for(int num : intArray)
			if(num > max)
				max = num;
		
		return max;
	}
	
}
