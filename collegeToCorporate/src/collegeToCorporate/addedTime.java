package collegeToCorporate;
import java.util.*;
public class addedTime {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Current time in hours:minutes:seconds format");
		String[] currentTime = sc.nextLine().split(":");
		
		System.out.println("Enter Time to be added to the current time in hours:minutes:seconds format");
		String[] timeToBeAdded = sc.nextLine().split(":");
		
		int[] newTime = timeDelay(currentTime, timeToBeAdded);
		
		System.out.printf("The new time is %d:%d:%d", newTime[0], newTime[1], newTime[2]);
		
		sc.close();
	}

	public static int[] timeDelay(String[] currentTime, String[] addedTime)
	{
		int[] time = new int[currentTime.length];
		for(int i=0; i < currentTime.length; i++)
		{
			time[i] = Integer.parseInt(currentTime[i]);
		}
		
		int[] timeAdded = new int[addedTime.length];
		for(int i=0; i < addedTime.length; i++)
		{
			timeAdded[i] = Integer.parseInt(addedTime[i]);
		}
		
		int hours = time[0] + timeAdded[0];
		int minutes = time[1] + timeAdded[1];
		int seconds = time[2] + timeAdded[2];
		
		if(seconds >= 60)
		{
			minutes += (seconds / 60);
			seconds = (seconds % 60);
		}
		
		if(minutes >= 60)
		{
			hours += (minutes / 60);
			minutes = (minutes % 60);
		}
		
		if(hours >= 24)
		{
			hours = (hours % 24);
		}
		
		return new int[] {hours, minutes, seconds};
		
	}
}
