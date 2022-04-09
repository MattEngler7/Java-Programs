import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		
		//Collect 5 numbers from keyboard
		Scanner myScanner = new Scanner(System.in);
		Database myDatabase = new Database(numbers);
		
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
	    }
		myScanner.close();
		
		int arr[] = numbers;
		int n = arr.length;
		int x = 45;
		int result = myDatabase.BinarySearch(arr,0,n-1,x);
		if (result == -1)
			System.out.println("Number is not present.");
		else
			System.out.println("Element Found at index " + result);
	}

}
