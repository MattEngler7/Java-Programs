
public class HashTable {
	private int arr;
	private Employee employ[];
	
	public HashTable(int size) 
	{
		arr = size;
		//creates array of any size.
		employ = new Employee[arr];
	}
	
	//when called form main, this adds the employee object to the table.
	public void insert(Employee keys) 
	{
		int v = keys.hashCode();
		int index = Math.abs(v%arr);
		employ[index]=keys;
		
	}
	
	//Returns the employee object from the table with the number.
	public Employee getKey(int key) 
	{
		Employee emp = null;
		for(Employee temp: employ) 
			if(temp!=null)
				if(temp.getKey()==key)
					return temp;
		return emp;
		
	}
	
	//prints the table and all of its contents.
	public void printHashTable() 
	{
		for (int i = 0; i <arr; i++)
			if (employ[i] !=null)
				System.out.println(employ[i]);
				
	}
}
