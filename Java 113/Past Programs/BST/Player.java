public class Player {
	private int nationalRank;
	private String name;
	private String height;
	private String weight;
	private String time;
	
	
	public Player(int nationalRank, String name, String height, String weight, String time) {
		this.nationalRank = nationalRank;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.time = time;
		
	}
	public void setNationalRank(int nationalRank) 
	{
		this.nationalRank = nationalRank;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setHeight(String height) 
	{
		this.height = height;
	}
	public void setWeight(String weight) 
	{
		this.weight = weight;
	}
	public void setTime(String time)
	{
		this.time = time;
	}
	public int getNationalRank() 
	{
		return nationalRank;
	}
	public String getName()
	{
		return name;
	}
	public String getHeight() 
	{
		return height;
	}
	public String getWeight() 
	{
		return weight;
	}
	public String getTime() 
	{
		return time;
	}
	public String toString() 
	{
		return ("National Rank: " + nationalRank +" | " + "Name: " + name + " | " + "Height: " + height + " | " + "Weight: " + weight + " | " + "Dash Time: " + time);
	}
}
