public class Loops
{
	public static void main(String[] args)
	{
		// While loop
		
		System.out.println("Using While Loop to print natural numbers from 100 to 200 :");
		int q = 100;
		while(q<=200)
		{
			System.out.println(q);
			q++;
		}
		System.out.println("Finished Running While Loop!");
		/*
		while(true)
		{
			System.out.println("I am an infinite while loop!");
		}
		*/

		// do-While loop
		
		/*
		int b = 10;
		do
		{
			System.out.println(b);
			b++;
		}
		while(b<5);
		*/
		System.out.println("Using do-While Loop to print natural numbers from 1 to 45 :");
		int c = 1;
		do
		{
			System.out.println(c);
			c++;
		}
		while(c<=45);
		System.out.println("Using do-While Loop to print natural numbers from 100 to 200 :");
		int d = 100;
		do
		{
			System.out.println(d);
			d++;
		}
		while(d<=200);
		System.out.println("Finished Running do-While Loop!");
		
		// for loop
		
		System.out.println("Using for Loop to print natural numbers from 1 to 10 :");
		for (int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		System.out.println("Using for Loop to print first 3 odd numbers :");
		// 2i = Even Numbers = 0, 2, 4, 6, 8
		// 2i+1 = Odd Numbers = 1, 3, 5, 7, 9
		int n = 3;
		for (int j=0; j<n; j++)
		{
		    System.out.println(2*j+1);
		}
		System.out.println("Using for Loop to count in reverse from 5 to 1 :");
		for(int k=5; k!=0; k--)
		{
			System.out.println(k);
		}
		System.out.println("Finished Running for Loop!");
		
		// break and continue
		
		//using for Loop
		System.out.println("Using for Loop to count in reverse from 10 to 0 but stopping at 8 :");
		for(int i=10;i>=0;i--)
		{
			if(i==7)
			{
				System.out.println("Ending the for loop");
				break;  // break the loop
			}
			System.out.println(i);
		}
		System.out.println("Using for Loop to count from 1 to 50 along with \"Java is great\" but stopping at 2 :");
        for (int i=1;i<=50;i++)
		{
            System.out.println(i);
            System.out.println("Java is great");
            if(i==2)
			{
                System.out.println("Ending the for loop");
                break;
            }
        }
		System.out.println("Using for Loop to count in reverse from 7 to 0 but skipping 3 :");
		for(int i=7;i>=0;i--)
		{
			if(i==3)
			{
				continue;   // continue skips the rest statement
			}
			System.out.println(i);
		}
		System.out.println("for Loop ends here");
		System.out.println("Using for Loop to count from 1 to 50 along with \"Java is great\" but skipping the second instance :");
		for(int i=1;i<=50;i++)
		{
			if(i==2)
			{
				System.out.println("Ending the for Loop");
				continue;
			}
			System.out.println(i);
			System.out.println("Java is great");
		}
		System.out.println("for Loop ends here");
		//using do-While Loop
		System.out.println("Using do-While Loop to count from 1 to 5 along with \"Java is great\" but stopping at the second instance :");
        int f=0;
        do
		{
			f++;
            System.out.println(f);
            System.out.println("Java is great");
            if(f==2)
			{
                System.out.println("Ending the do-While Loop");
                break;
            }
        }
		while(f<5);
		System.out.println("Using do-While Loop to count from 1 to 5 along with \"Java is great\" but skipping the second instance :");
		int i=0;
		do
		{
			i++;
			if(i==2)
			{
				System.out.println("Ending the do-While loop");
				continue;
			}
			System.out.println(i);
			System.out.println("Java is great");
		}
		while(i<5);
		System.out.print("do-While Loop ends here");
	}
}