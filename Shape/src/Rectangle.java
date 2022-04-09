
public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) 
	{
		area = length * width;
		perimeter = 2*(length * width);
	}
}
