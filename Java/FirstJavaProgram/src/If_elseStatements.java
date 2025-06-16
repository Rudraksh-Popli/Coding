import java.util.Scanner;

public class If_elseStatements
{
	public static void main(String[] args)
	{
		/*
		if (condition-to-be-checked)
		{
			statements-if-condition-true;
		}
		else
		{
			statements-if-condition-false;
		}
		*/
		
		// Else block is optional
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		boolean cond = (age >= 18);
		if (cond)
		{
			System.out.print("You can drive");
		}
		else
		{
			System.out.print("You are underage!");
		}
		
		/*
		if (condition1)
		{
            // Statements;
		}
		else if
		{
            // Statements;
		}
		else
		{
            // Statements;
		}
		*/
	}
}