import java.util.Scanner;
import java.util.InputMismatchException;

class MaxTry extends Exception
{
    @Override
    public String toString()
    {
        return "Maximum number of attempts reached.";
    }
}

public class PracticeQuestions14
{
    public static void main(String[] args)
    {
        // 1. Write a java program to demonstrate syntax, logical 2 runtime errors.
        // Syntax Error - int a = 7
        int age = 78;
        int year_born = 2000-78; // Logical error
        // System.out.println(6/0);

        // 2. Write a java program that prints "HaHa" during Arithmetic exception and "HeHe"
        //      during an Illegal argument exception.
        try
        {
            int a = 666/0;
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("HeHe");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Haha");
        }

        // 3. Write a program that allows you to keep accessing an array until a valid index is given.
        //      If max retries exceed 5 print "error".
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner Sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i<5)
        {
            try
            {
                System.out.println("Enter the value of index");
                index = Sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e)
            {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=5)
        {
            System.out.println("Error");
        }

        // 4. Modify program in Q3 to throw a custom Exception if max retries are reached.
        // 5. Wrap the program in Q3 inside a method which throws your custom Exception.
        int[] arr = {3, 2, 5, 1, 9};
        boolean check = true;
        int l = 0;
        try
        {
            while (check)
            {
                l++;
                if (l > 5)
                {
                    throw new MaxTry();
                }
                try
                {
                    System.out.println("Guess an index:");
                    int j = Sc.nextInt();
                    try
                    {
                        System.out.println("Correct! Value at index " + j + " is " + arr[j]);
                        check = false;
                    }
                    catch (ArrayIndexOutOfBoundsException e)
                    {
                        System.out.println("Error: Invalid index.");
                    }
                }
                catch (InputMismatchException e)
                {
                    System.out.println("Error: Please enter an integer.");
                    Sc.nextLine(); // clear the invalid input
                }
            }
        }
        catch (MaxTry e)
        {
            System.out.println(e.toString());
        }
    }
}