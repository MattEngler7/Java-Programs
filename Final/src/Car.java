
public class Car {
	private String make;
	private String model;
	private String size;
	private String name;
	private String elite;
	
	public Car(String make, String model, String size, String name, String elite) 
	{
		this.make = make;
		this.model = model;
		this.size = size;
		this.name = name;
		this.elite = elite;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setSize(String size) 
	{
		this.size = size;
	}
	public void setMake(String make) 
	{
		this.make = make;
	}
	public void setModel(String model) 
	{
		this.model = model;
	}
	public void setElite(String elite) 
	{
		this.elite = elite;
	}
	public String getName() 
	{
		return name;
	}
	public String getSize() 
	{
		return size;
	}
	public String getMake() 
	{
		return make;
	}
	public String getModel() 
	{
		return model;
	}
	public String getElite() 
	{
		return elite;
	}
}
