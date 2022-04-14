import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File empFile = new File("C:\\Users\\matts\\Downloads\\Employees.txt");
		HashTable myTable = new HashTable(7);
		System.out.println("Table Contains:  ");
		try 
		{
			Scanner myScanner = new Scanner(empFile);
			while(myScanner.hasNextLine()) 
			{
				String line = myScanner.nextLine();
				String[] tokens = line.split(",");
				int key = Integer.parseInt(tokens[0]);
				String value = tokens[1];
				//inserts items from .txt file into HashTable.
				myTable.insert(new Employee(key,value));
				
			}
			myScanner.close();
			//prints out HashTable when everything is put into it.
			myTable.printHashTable();
		}
		catch (Exception e) 
		{
			System.out.println(e.toString());
		}
		//reads in user input for comparison for the table.
		Scanner search = new Scanner(System.in);
		System.out.println("Enter an ID Num: ");
		
		//parses user input for comparison.
		int idNumber = Integer.parseInt(search.nextLine());
		
		//.getKey is called to find the number inputed but the user.
		Employee emp = myTable.getKey(idNumber);
		
		//checks to see if the users input is the same as a number in the table.
		if(emp != null) 
		{
			System.out.println("Employee is in the List");
			System.out.println(emp.toString());
		}
		//if input does not match item in table this is what is displayed to the user.
		else 
		{
			System.out.println("Value " + idNumber + " " + "was not found in the list");
		}
		search.close();
	}
}
