import java.util.Scanner;

public class PracticeQuestions1
{
    public static void main(String[] args)
    {
        // 1. Write a code to add three numbers in Java
        int a = 45;
        int b = 31;
        int c = 26;
        System.out.println("Sum : " + (a+b+c));

        // 2. Write a program to calculate CGPA using marks of three subjects (out of 100)
        float marks1 = 79;
        float marks2 = 80;
        float marks3 = 97;
        float cgpa = (marks1+marks2+marks3)/30;
        System.out.println("CGPA : " + cgpa);

        // 3. Write a program which asks the user to enter their name and greets them with
        // "Hello <name>, have a good day" text
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", have a good day");

        // 4. Write a program to convert kilometers to miles
        System.out.print("Enter distance in kilometers : ");
        float km = sc.nextFloat();
        float miles = km/1.609f;
        System.out.println("Distance in miles : " + miles + " miles");

        // 5. Write a program to detect whether a number entered by the user is integer or not
        System.out.print("Enter a number : ");
        boolean check = sc.hasNextInt();
        if (check)
        {
            System.out.print("Entered number is an integer");
        }
        else
        {
            System.out.print("Entered number is not an integer");
        }
    }
}
