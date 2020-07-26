/*
 * Example of recursive loop - Factorial 
 */

public class RecursiveFactorial
{
	public static void main(String[] args)
	{	
		final int FACTORIAL_NUM = 6;
		
		System.out.println("Factorial of NUM_FACTS = " + fact(FACTORIAL_NUM));
	}	
	
	public static int fact(int n)
	{	
		if (n == 1)
			return 1;
		else 
			return n * fact(n-1);
	}

}