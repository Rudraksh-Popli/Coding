import java.util.Scanner;

public class PracticeQuestions2
{
    public static void main(String[] args)
    {
        // 1. What will be the result of following expression :
        // float z = 7/4*9/2
        // My Answer : 7.875
        float z = 7/4*9/2;
        System.out.println(z);
        // Actual Answer = 4.0

        // 2. Write a Java Program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
        char grade = 'B';
        grade += (char) 8;
        System.out.println("Encrypted Grade : " + grade);
        grade -= (char) 8;
        System.out.println("Decrypted Grade : " + grade);

        // 3. Use Comparison Operators to find out whether a given number is greater than the user entered number
        // or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        float num = sc.nextFloat();
        System.out.println(num>3126);

        // 4. Write the following expression in a Java Program
        float v = 20;
        float u = 10;
        float a = 10;
        float s = 10;
        float answer = (v*v - u*u)/(2*a*s);
        System.out.println(answer);

        // 5. Find the value of the following expression :
        // int x = 7
        // int a = 7*49/7+35/7
        int a1 = 7*49/7+35/7;
        // My Answer : 54
        System.out.print(a1);
        // Actual Answer : 54
    }
}