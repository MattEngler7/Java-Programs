import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
        
        public static void displayList(ArrayList<String> list) {
        		
        		//This displays everything in the array
                System.out.println("Your shopping List:");
                
                for(int i=0; i<list.size(); i++) 
                {
                    System.out.println(i + ": " + list.get(i));
                }
                System.out.println();
        	}

        public static void main(String[] args) {
                
                Scanner myScanner = new Scanner(System.in);
                
                ArrayList<String> shoppingList = new ArrayList<>();
                
                System.out.println("Enter Shooping items: ");
                for(int i=0; i<5; i++) 
                {
                     
                     shoppingList.add(myScanner.nextLine());
                }
                
                displayList(shoppingList);

                System.out.println("Search for an item in the list: ");
                String toSearch = myScanner.nextLine();
                
                //Searches the list and checks if the item is in the list
                if(shoppingList.contains(toSearch)) 
                {
                     System.out.println("The item exists in shopping list");
                } 
                else
                {
                     System.out.println("This item do not exist in shopping list");
                }
                System.out.println(); 
                
                System.out.println("Enter an item to delete in shopping list or hit enter: ");
                String toDelete = myScanner.nextLine();
                
                //Checks to see if an item that the user enter is in the list then deletes it
                if(!toDelete.isEmpty()) 
                {
                    if(shoppingList.remove(toDelete)) 
                    {
                        System.out.println("Successfully removed the item from the list.");
                    } 
                    else
                    {
                       System.out.println("Item was not found.");
                    }
                }
                System.out.println();
                
                //Displays shopping list for the user to see
                displayList(shoppingList);
                
                //Asks the user to enter an item to the list
                System.out.println("Enter an item to insert: ");
                String toInsert = myScanner.nextLine();
                
                //Adds the item typed in by user to a specific location of thier choice
                System.out.println("At what position, do you want to insert: ");
                int pos = myScanner.nextInt();
                
                	if(pos < 0) 
                	{
                		pos = 0;
                	}
                	if(pos > shoppingList.size())
                	{
                		pos = shoppingList.size();
                	}
                shoppingList.add(pos, toInsert);

                //Displays list after user has entered item to list
                displayList(shoppingList);

                myScanner.close();
        }

}