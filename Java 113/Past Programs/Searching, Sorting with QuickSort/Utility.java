
public class Utility {
	static int quickSort(int numbers[], int low, int high) 
	{
		int pivot = numbers[high];
		int i = (low - 1);
		for(int j = low; j<high; j++) 
		{
			if(numbers[j]<pivot) 
			{
				i++;
				
				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
			}
		}
		//swapping numbers in the array
		int temp = numbers[i+1];
		numbers[i+1] = numbers[high];
		numbers[high] = temp;
		
		return i + 1;
		
	}
	
	//Sort array in ascending order
	static void sortAsc(int numbers[], int low, int high) 
	{
		if(low < high) 
		{
			int a = quickSort(numbers, low, high);
			sortAsc(numbers,low,a - 1);
			sortAsc(numbers,a + 1,high);
		}
	}
	
	//sorts array in descending order
	static void sortDes(int numbers[], int low, int high) 
	{
		if(high > low) 
		{
			int d = quickSort(numbers, high, low);
			sortDes(numbers, high, d - 1);
			sortDes(numbers, d + 1, low);
		}
	}
	static void printArray(int arr[]) 
	   { 
	      int n = arr.length; 
	      for (int i=0; i<n; ++i) 
	          System.out.print(arr[i]+" "); 
	      System.out.println(); 
	   }
}
