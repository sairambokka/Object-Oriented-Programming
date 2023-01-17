package collegeToCorporate;
import java.util.*;
public class ExerciseTime {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the day number : ");
		int day = sc.nextInt();
		
		int workoutTime = calWorkoutTime(day);
		
		System.out.println("The workout time for " + day + "th day is " + workoutTime);
		
		sc.close();
	}
	
	public static int calWorkoutTime(int day)
	{
		if(day < 4)
			return day;
		
		int day1 = 1;
		int day2 = 2;
		int day3 = 3;
		int dayn = 0;
		
		for(int i = 4; i <= day; i++)
		{
			dayn = day1 + day2 + day3;
			day1 = day2;
			day2 = day3;
			day3 = dayn;
		}
		
		return dayn;
	}

}
