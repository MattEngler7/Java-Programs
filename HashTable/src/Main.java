import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File empFile = new File("C:\\Users\\BE.AVC.EDU\\Downloads\\Employees.txt");
		HashTable myTable = new HashTable(7);
		System.out.println("Table Contains:  ");
		try 
		{
			Scanner myScanner = new Scanner(empFile);
			while(myScanner.hasNextLine()) 
			{
				String line = myScanner.nextLine();
				String[] tokens = line.split(",");
				String key = tokens[0];
				String value = tokens[1];
				Integer.parseInt(key);
				myTable.insert(key, value);
				
			}
			myScanner.close();
			myTable.printHashTable();
		}
		catch (Exception e) 
		{
			System.out.println(e.toString());
		}
		
		Scanner search = new Scanner(System.in);
		System.out.println("Enter an ID Num: ");
		System.out.println("Value = "+ myTable.get(search.next()));
		search.close();
		
	}
}