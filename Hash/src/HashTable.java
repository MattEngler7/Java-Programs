import java.util.Hashtable;

public class HashTable {
	private int currentSize, maxSize;
	private String[] keys;
	private String[] vals;
	Hashtable<String, Integer> HashTable = new Hashtable<String, Integer>();
		
	public HashTable() {
		currentSize = 0;
		keys = new String[maxSize];
		vals = new String[maxSize];
	}

	public void makeEmpty() {
		currentSize = 0;
		keys = new String[maxSize];
		vals = new String[maxSize];
	}
	
	//Tells the user the size of the HashTable.
	public int getSize() {
		return currentSize;
	}
	//Tells the user if the Table is Full.
	public boolean isFull() {
		return currentSize == maxSize;
	}
	//Tells the user if the Table is Empty.
	public boolean isEmpty() {
		return getSize() == 0;
	}
	public boolean contains(String key) {
		return get(key) != null;
	}
	private int hash(String key) {
		return key.hashCode() % maxSize;
	}
	public
	
}
