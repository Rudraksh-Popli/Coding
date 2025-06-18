public class Recursion
{
	// factorial(0) = 1
	// factorial(n) = n * n-1 *....1
	// factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
	// factorial(n) = n * factorial(n-1)
	
	static int factorial(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			return n * factorial(n-1);
		}
	}
	
	static int factorial_iterative(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			int product = 1;
			for (int i=1;i<=n;i++)
			{
				product *= i;
			}
			return product;
		}
	}
	
	static int fib (int n)
	{
		if (n <= 1)
		{
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}
	
	static void fib_iterative(int N)
	{
		int n1 = 0, n2 = 1;
		for (int i = 0; i < N; i++)
		{
			System.out.print(n1 + " ");
			int n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args)
	{
		int x = 15;
		System.out.println("The value of "+x+" factorial is: " + factorial(x));
		System.out.println("The value of "+x+" factorial is: " + factorial_iterative(x));
		int N = 15;
		System.out.println("The first "+N+" terms of the Fibonacci Series are :");
		for (int i = 0; i < N; i++)
		{
			System.out.print(fib(i) + " ");
		}
		System.out.println("\nThe first "+N+" terms of the Fibonacci Series are :");
		fib_iterative(N);
	}
}