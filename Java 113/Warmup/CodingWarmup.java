import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodingWarmup {

	public static void main(String[] args) 
	{
		
	}
	
	//reverse the array no matter if its even or odd.
	public static void reverseArray(int[] array) 
	{
		
		for(int i = 0; i < array.length/2; i++) 
		{
			
			int temp = array[i];
			array[i]= array[array.length-i-1];
			array[array.length-i-1] = temp;
			
		}
		
	}
	
	public static long factorial(long n) 
	{
		int num = (int) n;
		long factorial = 1;
		if((long)num == 0)
			return 0;
		else if (num > 0)
			for(int i = 1; i <= num; i++) 
			{
				factorial = factorial * i;
			}
		
		return factorial;
	}
	
	public static int getNumCollatzSteps(int startingNumber) 
	{
		int steps = 1;
		int n = startingNumber;
		while(n != 1) 
		{
			//count the number of steps by increasing steps by 1 every time it loops though.
			steps ++;
			//odd number.
			if((n & 1) == 1)
				n = 3 * n + 1;
			//even number.
			else
				n = n/2;
		}
		return steps;
	}
	
	public static int[] getPrimeFactors(int number) 
    {
		int[] prime = new int[0];
		
		if(number == 1) 
		{
			int[] num = new int[1];
			num[0] = 1;
			return num;
		}
		else 
		{
			for(int i = 2; i <= number; i++) 
			{
             while(number % i == 0) 
             {
                number = number/ i;
                prime = Arrays.copyOf(prime, prime.length+1);
                prime[prime.length-1] = i;
             }
			}
		}
        return prime;
    }
			
	
	public static int getNthFibonacci(int n) 
	{
		if(n <= 1)
			return n;
		return getNthFibonacci(n-1) + getNthFibonacci(n-2);
	}
	
	public static String arrayToString(int[] array) 
	{
		
		int[] number = array;
		
		return Arrays.toString(number);
	}

}
