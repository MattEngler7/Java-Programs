public class Database {
	
	//Takes 5 numbers and puts them in ascending order 
	public void bubbleSort(int[] arr)
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    // swap temp and arr[i]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	    }
	 //Takes 5 numbers and puts them in descending order   
	 public void DesBubbleSort(int[] arr) 
	  {
		  int t = arr.length;
	        for (int i = 0; i < t-1; i++)
	        	for (int j = 0; j < t-i-1; j++)
	        		if (arr[j] < arr[j+1]) 
	        		{
	        			int Destemp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = Destemp;
	        		} 
	  }

	    //Prints Array of numbers
	    public void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 

	public int BinarySearch(int[] arr, int key)
	    {
	    	   int mid = 2;
	    	   int low = 0;
	    	   int high = arr.length - 1;
	    	   
	    	   while (high >= low)
	    	   {
	    	      if (arr[mid] < key) {
	    	         low = mid + 2;
	    	         return low;
	    	      }
	    	      else if (arr[mid] > key) {
	    	         high = mid - 2;
	    	         return high;
	    	      }
	    	      else {
	    	         return mid;
	    	      }
	    	   }
	    	   return -1;
	    }
}