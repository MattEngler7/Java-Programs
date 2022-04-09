class Database
	{
	int[] arr;
	Database(int[] a)
		{
			this.arr = a;
		}
	  
		//bubble sort in ascending order
		void bubbleSort()
		{
			int n = arr.length;
	
			for (int i = 0; i < n-1; i++)
			{
				for (int j = 0; j < n-i-1; j++)
				{
					if (arr[j] > arr[j+1])
					{
						// swap temp and arr[i]
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
		}
		
		//Sorts the array is descending order
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
	  
		//find minimum number in the array
		int min()
		{
			int min=arr[0];
			for (int i = 1; i < arr.length; i++)
			{
				if(arr[i]<min)
					min=arr[i];
			}
			return min;
		}
		
		//find max value in array
		int max()
		{
			int max=arr[0];
			for (int i = 1; i < arr.length; i++)
			{
				if(arr[i]>max)
					max=arr[i];
			}
			return max;
		}
		
		//calculates the average of the array
		double average()
		{
			double sum=0;
			for (int i = 0; i < arr.length; i++)
			{
				sum+=arr[i];
			}
			return sum/arr.length;
		}
		
		//searches the array for a certain number and returns its index
		public int BinarySearch(int[] arr, int key)
	    {
	    	   int mid = 0;
	    	   int low = 0;
	    	   int high = arr.length - 1;
	    	   
	    	   while (high > low)
	    	   {
	    		  mid = (high + low)/2;
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
	  
		//print the array of numbers 
		void printArray()
		{
			for (int i=0; i<arr.length; ++i)
				System.out.print(arr[i] + " ");
	
			System.out.println();
		}
	}