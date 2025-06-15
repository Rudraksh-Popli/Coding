import java.util.Scanner;

public class Excercise1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum marks : ");
        float max = sc.nextFloat();
        System.out.println("Enter the marks of student in 5 subjects : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        float sum = a+b+c+d+e;
        float percentage = (sum/(max*5))*100;
        System.out.print("The percentage of the student is : ");
        System.out.print(percentage);
        System.out.print("%");
    }
}