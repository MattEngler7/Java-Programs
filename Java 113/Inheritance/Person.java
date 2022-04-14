package Inheritence;

public class Person {
	private double height;
	private double weight;
	
	public void setHeight(double height) 
	{
		this.height = height;
	}
	public void setWeight(double weight) 
	{
		this.weight = weight;
	}
	public double getWeight() 
	{
		return weight;
	}
	public double getHeight() 
	{
		return height;
	}
	@Override
	public String toString() 
	{
		return (" and is a good student.");
	}
}
