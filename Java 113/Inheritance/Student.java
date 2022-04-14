package Inheritence;

public class Student extends Person {
	
	private int idNum;
	private double studentGPA;
	private double studentHeight;
	
	public void setStudentHeight(double studentHeight) 
	{
		this.studentHeight = studentHeight;
	}
	
	public double getStudentHeight() 
	{
		return studentHeight;
	}
	
	public void setidNum(int idNum) 
	{
		this.idNum = idNum;
	}
	
	public void setStudentGPA(double studentGPA) 
	{
		this.studentGPA = studentGPA;
	}
	
	public int getidNum() 
	{
		return idNum;
	}
	
	public double getStudentGPA() 
	{
		return studentGPA;
	}
	
	@Override
	public String toString() 
	{
		return ("Students ID number is: " + idNum + super.toString());
	}
}
