
public class Database {

	public Database(int[] array) {
		//for array
	}
	
	//Takes 5 numbers and puts them in ascending order 
	void bubbleSort(int[] arr)
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

	    //Prints Array
	    void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 
	 //Takes 5 numbers and puts them in descending order   
	 void DesBubbleSort(int[] arr) 
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
	
	public int BinarySearch(int[] arr, int l, int r, int x)
	    {
		if (r>=l) 
        { 
            int mid = l + (r - l)/2; 

            if (arr[mid] == x) 
               return mid; 
 
            if (arr[mid] > x) 
               return BinarySearch(arr, l, mid-1, x); 
   
            return BinarySearch(arr, mid+1, r, x); 
        } 
  
        return -1;
	    }
}
