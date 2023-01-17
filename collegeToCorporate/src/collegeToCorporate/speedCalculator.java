package collegeToCorporate;
import java.util.Scanner;
public class speedCalculator {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the distance travelled in meters");
		int distance = sc.nextInt();
		
		System.out.println("Enter time taken in hours");
		int hours = sc.nextInt();
		
		System.out.println("Enter the time in minutes");
		int minutes = sc.nextInt();
		
		System.out.println("Enter the time in seconds");
		int seconds = sc.nextInt();
		
		int timeInSeconds = (hours * 3600) + (minutes * 60) + seconds;
		
		double[] speed = calSpeed(distance, timeInSeconds);
		
		System.out.println("The speed in miles per hour is " + speed[0]);
		System.out.println("The speed in kilometers per hour is " + speed[1]);
		System.out.println("The speed in miles per hour is " + speed[2]);
		
		sc.close();
	}
	
	public static double[] calSpeed(int distance, int timeInSeconds)
	{
		double mps, kph, mph;
		
		mps = (double)distance / timeInSeconds;
		kph = (double)(mps * 3.6f);
		mph = (double)(kph / 1.609f);
		
		return new double[] {mps, kph, mph};
	}

}
