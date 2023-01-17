package CollectionsDemo;
import java.util.*;
public class OccurenceOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numbers of your choice in order : ");
		System.out.println("Enter ok to exit");
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		while(sc.hasNextInt())
		{
			numbers.add(sc.nextInt());
		}
		
		Set<Integer> newNumbers = new TreeSet<>();
		
		for(int num : numbers) {
			newNumbers.add(num);
		}
		
		for(int num : newNumbers)
		{
			System.out.println(num + " occurs " +Collections.frequency(numbers, num) + " times");
		}
		
		sc.close();
	}
	
	

}
