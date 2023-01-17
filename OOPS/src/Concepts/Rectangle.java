package Concepts;

public class Rectangle {

	
	private int rectId;
	private int length;
	private int breadth;
	private static int idGen = 100;
	
	public Rectangle() {
		super();
		this.rectId = ++idGen;
	}

	@Override
	public String toString() {
		return "Rectangle of rectId=" + rectId + ", length = " + length + ", breadth = " + breadth + ", has an area of = " + area()
				+ ", and a perimeter of = " + perimeter();
	}

	public Rectangle(int length, int breadth) {
		super();
		this.rectId = ++idGen;
		this.length = length;
		this.breadth = breadth;
	}

	int area()
	{
		return (length * breadth);
	}
	
	int perimeter()
	{
		return (2*(length + breadth));
	}
	
	
	public static void main(String[] args)
	{
		Rectangle rect1 = new Rectangle(24, 50);
		
		Rectangle rect2 = new Rectangle();
		rect2.length = 15;
		rect2.breadth = 55;
		
		Rectangle rectBig = compareSize(rect1, rect2);
		
		System.out.println("The Larger Rectangle is " + rectBig);
	}
	
	public static Rectangle compareSize(Rectangle rec1, Rectangle rec2)
	{
		if(rec1.area() > rec2.area())
			return rec1;
		return rec2;
	}

}
