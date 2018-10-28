import java.lang.Math; //to use the basic math operation

public class Prime {
	public static void printPrime(int n) //a function that print all the primes up till the given n
	{
		int size = n+1; //size of the array
		boolean array[]; 
		array = new boolean[size]; //create an array of boolean 
		
		for (int index = 2; index < size; index++) //initialize all the elements in the array to true except for the first and second element
		{
			array[index] = true;
		}
		
		for(int i = 2; i <= Math.sqrt(n); i++)  //iterate from index 2 until the square root of n
		{
			if (array[i] == true) 
			{
				for(int j = i*i; j <= n; j = j+i) //cross out the integers that are not prime numbers
				{
					array[j] = false; //set the value to false
				}
			}
		}
		
		for (int index = 2; index < size; index++) //iterate from index 2 until the end of the array
		{
			if (array[index] == true)//print the index if the element with the respective index is true
			{
				System.out.println(index);
			}
		}
		
	}
}
