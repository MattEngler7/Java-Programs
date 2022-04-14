import java.util.ArrayList;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> myArraylist = new ArrayList<String>();
	    Scanner myScanner = new Scanner(System.in);
	    System.out.print("Enter 5 items to the shopping list: ");
	    
	    //add items on ArrayList
	    for (int i = 0; i < 5; i++) 
	     {
	    	myArraylist.add(myScanner.next());
	     }
	    
	    //search ArrayList for item
	    String userInput;
	    System.out.println("Search an item in the list: ");
	    userInput = myScanner.next();
	    for(String item : myArraylist) 
	    {
	    	if(item.contains(userInput))
	    		System.out.println("Item was found: " + item);
	    	break;
	    }
	    
	    System.out.println("Remove and item from the list:");
	    for(String delItem : myArraylist) 
	    {
	    	if(delItem.contains(userInput))
	    		myArraylist.remove(delItem);
	    	System.out.println("Item removed");
	    }
	    myScanner.close();
	          
	}
	

}
