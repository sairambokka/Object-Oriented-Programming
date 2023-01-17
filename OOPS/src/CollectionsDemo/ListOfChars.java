package CollectionsDemo;
import java.util.*;
public class ListOfChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		String str = sc.nextLine();
		
		char[] charArray = str.toLowerCase().toCharArray();
		
		Set<Character> charSet = new TreeSet<Character>();
		
		for(char ch : charArray)
		{
			charSet.add(ch);
		}
		
		System.out.println(charSet);
		
		sc.close();
		
	}

}
