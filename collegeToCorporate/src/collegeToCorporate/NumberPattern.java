package collegeToCorporate;
import java.util.*;
public class NumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int end = sc.nextInt();
		
		printPattern(end);
		
		sc.close();
	}
	
	public static void printPattern(int maxRow)
	{
		for(int row = 1; row <= maxRow; row++) {
            for(int spaces = 1; spaces <= maxRow - row; spaces++) {
                System.out.print("1 ");
            }
            for(int num = 1; num <= row; num++) {
                System.out.print(num + " ");
            }
            System.out.print("");
        }

	}
}
