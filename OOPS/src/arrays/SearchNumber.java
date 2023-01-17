package arrays;
import java.util.*;
public class SearchNumber {

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
		
		System.out.println("Enter the element you want to search : ");
		int element = sc.nextInt();
		
		int index = searchElement(intArray, element);
		
		if(index < 0)
			System.out.println("Element not found");
		else 
			System.out.println("Element found at index "+ index + " of given array");
		
		sc.close();
	}

	public static int searchElement(int[] intArray, int element) {
		
		int index = Arrays.binarySearch(intArray, element);
		
		return index;
	}
}
