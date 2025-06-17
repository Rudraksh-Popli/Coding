public class PracticeQuestions5
{
	public static void main(String[] args)
	{
		// 1.  Write a program to print the following pattern :
		//  ****
		//  ***
		//  **
		//  *
		for (int i = 4; i > 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 2. Write a program to sum first n even numbers using a while loop.
		int n = 4;
		int i = 0;
		int sum = 0;
		while (i<n)
		{
			sum+=(i*2);
			i++;
		}
		System.out.println("\n"+sum+"\n");   // First 4 even numbers = 0,2,4,6
		
		// 3. Write a program to print the multiplication table of a given number n.
		int num=23;
		for (int j = 0; j <= 10; j++)
		{
			System.out.println(num+"x"+j+"="+num*j);
		}
		System.out.println();
		
		// 4. Write a program to print a multiplication table of 10 in reverse order
		int ten=10;
		for (int j = 10; j >= 0; j--)
		{
			System.out.println(ten+"x"+j+"="+ten*j);
		}
		System.out.println();
		
		// 5. Write a program to find the factorial of a given number using for loops.
		int facN = 9;
		int factorial = 1;
		for (int j = 1; j <= facN; j++)
		{
			factorial*=j;
		}
		System.out.println(factorial);
		System.out.println();
		
		// 6. Repeat problem 5 using a while loop.
		int facNum = 9;
		int factorialTotal = 1;
		int counter = 1;
		while(counter<=facNum)
		{
			factorialTotal *= counter;
			counter++;
		}
		System.out.println(factorialTotal);
		System.out.println();
		
		// 7. Repeat problem 1 using for/while loop.
		int stars = 4;
		while(stars>=0)
		{
			for (int j = 0; j < stars; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			stars--;
		}
		
		// 8. What can be done using one type of loop can also be done using the other two types of loops -
		// True or False.
		// Answer - True.
		
		// 9. Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
		int num8=8;
		int sumOf8Table = 0;
		for (int j = 0; j <= 10; j++)
		{
			sumOf8Table+= num8*j;
		}
		System.out.println(sumOf8Table);
		
		// 10. A do-while loop is executed:
		//      At least once
		//      At least twice
		//      At most once
		// Answer : At least once
		
		// 11. Repeat problem 2 using for loop.
		int n2 = 4;
		int sum2 = 0;
		for (int j = 0; j < n2; j++)
		{
			sum2+=(j*2);
		}
		System.out.print("\n"+sum2);   // First 4 even numbers = 0,2,4,6
	}
}
