package folder.folderl1.folderl2;
import java.util.Scanner;

class Calculator
{
    public void calculate(int a , int b)
    {
        System.out.println("This is your result is : " + a+b);
    }
}
class ScCalculator
{
    public void calculate(int a , int b)
    {
        System.out.println("This is your result is : " + Math.sin(a+b));
    }
}
class HybridCalculator
{
    public void calculate(int a , int b)
    {
        System.out.println("This is your result is : " + a+b);
        System.out.println("This is your result is : " + Math.sin(a+b));
    }
}
class Display
{
    void inputAndOutput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        String input1 = sc.nextLine();
        System.out.println("Line Entered : "+input1);
    }
}
class c1 extends PracticeQuestions12
{
    void PracticeQuestions12()
    {
        System.out.println(proInt);
        System.out.println(defInt);
    }
}
public class PracticeQuestions12
{
    protected int proInt = 4;
    int defInt = 41;
    public static void main(String[] args)
    {
        System.out.println("I am main method");
        // 1. Create three classes calculator , Sc calculator and Hybrid calculator and group them into a package
        // 2. Use a build-in package in java to write a class which displays a message ( by using sout )
        //      after taking input from the user
        Display obj = new Display();
        obj.inputAndOutput();
        // 3. Create a package in class with three package levels folder , folderL1 , folderL2
        // 4. Prove that you cannot access default property but can access protected properly from the subclass.
        c1 c = new c1();
    }
}
