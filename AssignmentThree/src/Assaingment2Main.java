import java.util.Scanner;

public class Assaingment2Main {

	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		 
		Scanner myScanner = new Scanner(System.in);//Collect 5 random numbers from the user
		Database myDatabase;
		
		System.out.println("Enter 5 Randome Numbers: ");
		for (int i = 0; i < 5; i++) {
		
			int myNumber = myScanner.nextInt();
			numbers[i] = myNumber;
			
		}
		myDatabase = new Database(numbers);
		
		//myDatabase.SortDescend();
		myDatabase.SortAscend();
		
		
		System.out.println("Numers Sorted in Ascending Order: " + myDatabase.SortAscend());
		
		
		myScanner.close();
		

		
	}	
}
