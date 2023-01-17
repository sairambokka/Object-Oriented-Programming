package collegeToCorporate;
import java.util.Scanner;
public class gradeCalculator {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of subjects");
		int num = sc.nextInt();
		
		int[] subjectMarks = new int[num];
		
		for(int i = 0;i < num; i++)
		{
			if(sc.hasNextInt())
				subjectMarks[i] = sc.nextInt();
			else
			{
				System.out.println("You did not enter marks of all the subjects");
				break;
			}
		}
		
		System.out.println("Enter total maximum marks");
		int maxMarks = sc.nextInt();
		
		char grade = calGrade(subjectMarks, maxMarks);
		
		System.out.println("The grade obtained is " + grade);
		
		sc.close();
	}
	
	public static double calPercentage(int marks, int maxMarks)
	{
		return (double)(marks * 100) / maxMarks;
	}
	
	public static char calGrade(int[] marks, int maxMarks)
	{
		char grade;
		int sum = 0;
		
		for(int i=0; i < marks.length; i++)
		{
			sum += marks[i];
		}
		
		double percentage = calPercentage(sum, maxMarks);
		
		if(percentage >= 90)
			grade = 'A';
		else if (percentage >= 70)
			grade = 'B';
		else if (percentage >= 50)
			grade = 'C';
		else
			grade = 'F';
		
		return grade;
	}
}
