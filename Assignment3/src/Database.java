import java.util.*;
class Main
{
   public static void main (String[] args)
   {
       System.out.print("Enter 5 Numbers: ");
       int[] numbers = new int[5];
       Scanner myScanner = new Scanner(System.in);
       int n = numbers.length;
      
       //read 5 numbers
       for(int i=0;i<5;i++)
       numbers[i]=myScanner.nextInt();
      
       //Pass data in the constructor
       Database myDatabase = new Database(numbers);
      
       //Ascending Numbers
       myDatabase.bubbleSort();
       System.out.print("Sorted array in Ascending order: ");
       myDatabase.printArray();
       
       //Descending Numbers
       myDatabase.DesBubbleSort(numbers);
       System.out.print("Sorted array in Descending order ");
       myDatabase.printArray();
       
       //QuickSort Ascending
		Utility.sortAsc(numbers, 0, n-1);
		System.out.print("Quicksort Array Ascending: ");
		Utility.printArray(numbers);
		
		//QuickSort Descending
		Utility.sortDes(numbers, 0, n-1);
		System.out.print("Quicksort Array Descending: ");
		Utility.printArray(numbers);
		
		//Minimum, Max, Average
       System.out.println("Minimum: "+myDatabase.min());
       System.out.println("Maximum: "+myDatabase.max());
       System.out.println("Average: "+myDatabase.average());
      
       //Index Search
       System.out.println("Search for 10, INDEX = : " + myDatabase.BinarySearch(numbers, 10));
      
       myScanner.close();
   }
   
}