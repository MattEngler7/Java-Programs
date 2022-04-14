import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		
		//Collect 5 numbers from keyboard
		Scanner myScanner = new Scanner(System.in);
		Database myDatabase = new Database();
		
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Enter a number: ");
			
			int myNumber = myScanner.nextInt();
			numbers[i] = myNumber;
			
		}
		
		{
			
			//Ascending Numbers	        
	        myDatabase.bubbleSort(numbers);
	        System.out.println("Sorted array in ascending order: ");
	        myDatabase.printArray(numbers);
		
	        //Descending numbers
	        myDatabase.DesBubbleSort(numbers);
	        System.out.println("Sorted array in descending order ");
	        myDatabase.printArray(numbers);
	        
	        System.out.println("Number found at index: " + myDatabase.BinarySearch(numbers, 40));
	    }
		myScanner.close();
		
	}

}