public class Methods
{
	static int logic(int x, int y)
	{
		int z;
		if(x > y)
		{
			z = x + y;
		}
		else
		{
			z = (x + y) * 5;
		}
		x = 566;
		return z;
	}
	
	// Method Overloading
	
	static void foo()
	{
		System.out.println("Good Morning bro!");
	}
	static void foo(int a)
	{
		System.out.println("Good morning " + a + " bro!");
	}
	static void foo(int a, int b)
	{
		System.out.println("Good morning " + a + " bro!");
		System.out.println("Good morning " + b + " bro!");
	}
	static void foo(int a, int b, int c)
	{
		System.out.println("Good morning " + a + " bro!");
		System.out.println("Good morning " + b + " bro!");
	}
	static void change(int a)
	{
		a = 98;
	}
	static void change2(int [] arr)
	{
		arr[0] = 98;
	}
	static void tellJoke()
	{
		System.out.println("I invented a new word!\nPlagiarism!");
	}
	
	public static void main(String[] args)
	{
		int a = 5;
		int b = 7;
		int c;
		// Method invocation using Object creation
		// Methods obj = new Methods();
		// c = obj.logic(a, b);
		c = logic(a, b);
		System.out.println(a + " " + b);
		int a1 = 2;
		int b1 = 1;
		int c1;
		// c1 = obj.logic(a1, b1);
		c1 = logic(a1, b1);
		System.out.println(c);
		System.out.println(c1);
		
		// Method Overloading
		
		tellJoke();
		// Case 1: Changing the Integer
		int x = 45;
		change(x);
		System.out.println("The value of x after running change is : " + x);
		// Case 1: Changing the Array
		int [] marks = {52, 73, 77, 89, 98, 94};
		change2(marks);
		System.out.println("The value of x after running change is : " + marks[0]);
		// Method Overloading
		foo();
		foo(3000);
		foo(3000, 4000);
		// Arguments are actual!
	}
}