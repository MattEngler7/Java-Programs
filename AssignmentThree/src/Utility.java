
public class Utility{ 
	static void Quicksort(numbers, i, k) {
		   int j = 0;
		   
		   // Base case: If there are 1 or zero elements to sort,
		   // partition is already sorted
		   if (i >= k) {
		      return;
		   }
		   
		   // Partition the data within the array. Value j returned
		   // from partitioning is location of last element in low partition.
		   int j = Partition(numbers, i, k);
		   
		   // Recursively sort low partition (i to j) and
		   // high partition (j + 1 to k)
		   Quicksort(numbers, i, j);
		   Quicksort(numbers, j + 1, k);
		}

}