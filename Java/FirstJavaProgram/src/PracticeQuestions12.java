package calc;

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
public class PracticeQuestions12
{
    public static void main(String[] args)
    {
        System.out.println("I am main method");
        // 1. Create three classes calculator , Sc calculator and Hybrid calculator and group them into a package
        // 2. Use a build-in package in java to write a class which displays a message ( by using sout )
        //      after taking input from the user
        // 3. Create a package in class with three package levels folder , folderL1 , folderL2
        // 4. Prove that you cannot access default property but can access protected properly from the subclass.
    }
}