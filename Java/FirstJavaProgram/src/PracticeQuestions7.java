public class PracticeQuestions7
{
	// 1. Write a Java method to print the multiplication table of a number n.
	static void tableOfN(int n)
	{
		for (int j = 0; j <= 10; j++)
		{
			System.out.println(n+"x"+j+"="+n*j);
		}
	}
	// 2. Write a program using functions to print the following pattern:
	//  *
	//  **
	//  ***
	//  ****
	static void pattern1(int n)
	{
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < i + 1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// 3. Write a recursive function to calculate the sum of first n natural numbers.
	static int sumRec(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		return n + sumRec(n - 1);
	}
	// 4. Write a function to print the following pattern:
	//  ****
	//  ***
	//  **
	//  *
	static void pattern2(int n)
	{
		for (int i = n; i > 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// 5. Write a function to print the nth term of the Fibonacci series using recursion.
	static int fib(int n)
	{
        /*
        if(n==1)
        {
            return 0;
        }
        else if(n==2)
        {
            return 1;
        }
        */
		if (n == 1 || n == 2)
		{
			return n - 1;
		}
		else
		{
			return fib(n - 1) + fib(n - 2);
		}
	}
	// 6. Write a function to find the average of a set of numbers passed as arguments.
	static float average(float ... arr)
	{
		float total = 0;
		for (float a : arr)
		{
			total = total + a;
		}
		return (total/arr.length);
	}
	// 7. Repeat problem 4 using Recursion.
	static void pattern2Rec(int n)
	{
		if (n > 0)
		{
			for (int i = n; i > 0; i--)
			{
				System.out.print("*");
			}
			System.out.println();
			pattern2Rec(n-1);
		}
	}
	// 8. Repeat problem 2 using Recursion.
	static void pattern1Rec(int n)
	{
		if (n > 0)
		{
			pattern1Rec(n - 1);
			for (int i = 0; i < n; i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// 9. Write a function to convert Celsius temperature into Fahrenheit.
	static double ctf(double celsius)
	{
		double fahrenheit = (celsius * 1.8) + 32;
		return fahrenheit;
	}
	// 10. Repeat problem 3 using an iterative approach.
	static int sum(int n)
	{
		int total = 0;
		for (int i = 0; i <= n; i++)
		{
			total+=i;
		}
		return total;
	}

	public static void main(String[] args)
	{
		// 1. Write a Java method to print the multiplication table of a number n.
		tableOfN(34);
		// 2. Write a program using functions to print the following pattern:
		//  *
		//  **
		//  ***
		//  ****
		pattern1(4);
		// 3. Write a recursive function to calculate the sum of first n natural numbers.
		System.out.println("Sum of first 3126 natural numbers : "+sumRec(3126));
		// 4. Write a function to print the following pattern:
        //  ****
        //  ***
        //  **
        //  *
		pattern2(4);
		// 5. Write a function to print the nth term of the Fibonacci series using recursion.
		System.out.println("15th term of the Fibonacci series : "+fib(15));
		// 6. Write a function to find the average of a set of numbers passed as arguments.
		System.out.println(average(4,5,6,78,9,10));
		// 7. Repeat problem 4 using Recursion.
		pattern2Rec(4);
		// 8. Repeat problem 2 using Recursion.
		pattern1Rec(4);
		// 9. Write a function to convert Celsius temperature into Fahrenheit.
		System.out.println("45 degree Celsius in Fahrenheit is : "+ctf(45));
		// 10. Repeat problem 3 using an iterative approach.
		System.out.print("Sum of first 3126 natural numbers : "+sum(3126));
	}
}
