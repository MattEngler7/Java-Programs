public class Sort {

		public static <T> int quickSort(T[] numbers, int low, int high) 
        {
            T pivot = numbers[high];
            int i = (low - 1);
            for(int j = low; j < high; j++) 
            {
                if(((String) numbers[j]).compareTo((String) pivot) < 0) 
                {
                    i++;
                    
                    T temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            //swapping numbers in the array
            T temp = numbers[i+1];
            numbers[i+1] = numbers[high];
            numbers[high] = temp;
            
            return i + 1;
            
        }
        public void sorting(String num[], int low, int high) 
        {
            if(low < high) 
            {
                int p = quickSort(num,low,high);
                
                sorting(num, low, p - 1);
                sorting(num, p + 1, high);
            }
        }
         
    
    public static <T extends Comparable<T>> T[] sort(T[] inputArray) 
    {
        if(inputArray.length != 2) 
        {
            return inputArray;
        }
        else if(inputArray[0].compareTo(inputArray[1]) > 0) 
        {
            T temp = inputArray[1];
            inputArray[1] = inputArray[0];
            inputArray[0] = temp;
        }
    
        return inputArray;
    }
	
}