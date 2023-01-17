package Interface;

interface shape
{
	double calArea();
	double PI = 3.14;
}

class Circle implements shape
{
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}
	
	public double calArea()
	{
		return (double)PI * radius * radius;
	}
	
	public String toString()
	{
		return "CIRCLE : RADIUS " + radius + " AREA : " + calArea();
	}
	
}

public class AreaCalculator {

	public static void main(String[] args) {
		Circle cir1 = new Circle(5);
		
		System.out.println(cir1);

	}

}
