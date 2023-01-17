package ArrayListProblems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OddandEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> LIST = new ArrayList<Integer>();
		
		System.out.println("Enter numbers of your choice in order : ");
		System.out.println("enter ok to exit");
		
		while (sc.hasNextInt()) 
		{
		    int i = sc.nextInt();
		    LIST.add(i);
		}
		
		int oddCount = checkOddCount(LIST);
		
		System.out.println("The number of odd numbers in given list are : " + oddCount);
		System.out.println("The number of even numbers in given list are : " + (LIST.size() - oddCount));
		
		sc.close();

	}
	
	public static int checkOddCount(ArrayList<Integer> numberList)
	{
		int oddCount = 0;
		Iterator<Integer> itr = numberList.iterator();
		
		while(itr.hasNext())
		{
			int num = itr.next();
			if(num % 2 != 0)
				oddCount++;
		}
		
		return oddCount;
	}

}
