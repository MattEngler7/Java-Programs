public class HashTable {
	private int currentSize, maxSize;
	private String[] key;
	private String[] value;
	
	public HashTable(int capacity) 
	{
		currentSize = 0;
		maxSize = capacity;
		key = new String[maxSize];
		value = new String[maxSize];
	}
	
	public boolean fullBucket() 
	{
		return currentSize == maxSize;
	}
	 
	private int hash(String keys) 
	{
		return keys.hashCode()% maxSize;
	}
	
	public void insert(String keys, String vals) 
	{
		int temp = hash(keys);
		int i = temp;
		
		if(key[i]==null) 
		{
			key[i] = keys;
			value[i] = vals;
			currentSize++;
			return;
		}
		if (key[i].equals(keys)) 
		{
			value[i] = vals;
			return;
		}
		i = (i+1)%maxSize;
	}
	
	public String get(String keys) 
	{
		int i = hash(keys);
		while(key[i] != null) 
		{
			if(key[i].equals(key))
				return value[i];
			i = (i+1)%maxSize;
		}
		return null;
	}
	
	public void printHashTable() 
	{
		for (int i = 0; i <maxSize; i++)
			if (key[i] !=null)
				System.out.println(key[i] + " " + value[i]);
				
	}
}