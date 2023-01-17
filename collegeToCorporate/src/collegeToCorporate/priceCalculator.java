package collegeToCorporate;
import java.util.Scanner;
public class priceCalculator {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter price of the item : ");
		int price = scan.nextInt();
		
		double priceAfterDiscount = calSellingPrice(price);
		
		System.out.println("The final selling price of the item is : " + priceAfterDiscount);
		
		scan.close();
		
	}
	
	public static int calDiscount(int price)
	{
		
		if(price < 0)
		{
			return -1;
		}
		
		
		int discount;
		if(price < 10000)
			discount = 10;
		else if(price < 20000)
			discount = 20;
		else
			discount = 25;
		
		return discount;
			
	}
	
	public static double calSellingPrice(int price)
	{
		int discount = calDiscount(price);
		
		double sellingPrice = (double)(price - (discount * price) / 100.0);
		
		return sellingPrice;
	}

}
