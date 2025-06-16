import java.util.Random;
import java.util.Scanner;

public class PracticeQuestions4
{
	public static void main(String[] args)
	{
		// 1. What will be the output of the program :
		// int a = 10
		// if(a=11)
		// System.out.println("I am 11")
		// else
		// System.out.println("I am not 11")
		
		// My Answer : Error in line 2 ("=" should be replaced with "==")
		
		// 2. Write a program to find out whether a student is pass or fail :
		// if it requires a total of 40% and at least 33% in each subject to pass.
		// Assume 3 subjects and take marks as input from the user.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks in 1st Subject (out of 100) : ");
		float marks1 = sc.nextFloat();
		System.out.print("Enter marks in 2nd Subject (out of 100) : ");
		float marks2 = sc.nextFloat();
		System.out.print("Enter marks in 3rd Subject (out of 100) : ");
		float marks3 = sc.nextFloat();
		float percentage = (marks1+marks2+marks3)/3;
		if (percentage >= 40 && marks1 >= 33 && marks2 >= 33 && marks3 >= 33)
		{
			System.out.println("Student Passed");
		}
		else
		{
			System.out.println("Student Failed");
		}
		
		// 3. Calculate income tax paid by an employee to the government as per the slabs mentioned below:
		//      Income Slab	    Tax
		//      2.5L – 5.0L  	05%
		//      5.0L – 10.0L 	20%
		//      Above 10.0L	    30%
		// Note that there is not tax below 2.5L. Take the input amount as input from the user.
        System.out.print("Enter your income in Lakhs per annum : ");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5)
		{
            tax = tax + 0;
        }
        else if(income>2.5f && income <= 5f)
		{
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income <= 10.0f)
		{
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10.0f)
		{
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("The total tax paid by the employee is: " + tax);
		
		// 4. Write a program to find out the day of the week given the number
		//    [1 for Monday, 2 for Tuesday … and so on!]
		System.out.print("Enter the number of the day of the week : ");
		int day = sc.nextInt();
        switch (day)
        {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
		
		// 5. Write a Java program to find whether a year entered by the user is a leap year or not.
		System.out.println("Enter year to check for leap year : ");
		int year = sc.nextInt();
		if(year%4 == 0 && year%100 != 0)
		{
			System.out.println(year+" is a leap year");
		}
		else if(year%100 == 0)
		{
			if(year%400 == 0)
			{
				System.out.println(year+" is a leap year");
			}
		}
		else
		{
			System.out.println(year+" is not a leap year");
		}
		
		// 6. Write a program to find out the type of website from the URL:
		//      .com – commercial website
		//      .org – organization website
		//      .in – Indian website
		System.out.print("Enter the URL of the website : ");
		String website = sc.nextLine();
        if(website.endsWith(".org"))
		{
            System.out.println("This is an Organizational website");
        }
        else if(website.endsWith(".com"))
		{
            System.out.println("This is a Commercial website");
        }
        else if(website.endsWith(".in"))
		{
            System.out.println("This is an Indian website");
        }
		
		// Random
		Random r = new Random();
		int a = r.nextInt();
		System.out.print(a);
	}
}