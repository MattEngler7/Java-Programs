
public class Employee {
	private int key;
	private String value;
	
	public Employee()
	{
		key = 0;
		value = " ";
	}
	public Employee(int key, String value) 
	{
		this.key = key;
		this.value = value;
	}
	public int getKey() 
	{
		return key;
	}
	public void setKey(int key) 
	{
		this.key = key;
	}
	public String getValue(String Value) 
	{
		return value;
	}
	public void setValue(String value) 
	{
		this.value = value;
	}
	public String toString() 
	{
		return ("Key: " + getKey() + " " + "Value: " + getValue(value));
	}
}
