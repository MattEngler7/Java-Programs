public class Employee {
	private int key;
	private String value;
	
	public Employee(int key, String value)
	{
		this.key = key;
		this.value = value;
	}
	public int getKey(int key) 
	{
		return key;
	}
	public String getValue(String value) 
	{
		return value;
	}
	public void setValue(String value) 
	{
		this.value = value;
	}
}