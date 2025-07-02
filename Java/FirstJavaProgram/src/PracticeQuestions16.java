import java.io.FileWriter;
import java.io.IOException;

class MyDeprecated
{
    @Deprecated
    void meth1()
    {
        System.out.println("I am method 1");
    }
}
interface MyInt
{
    void display();
}

public class PracticeQuestions16
{
    public static void main(String[] args)
    {
        // 1. Create a class and a method with deprecated annotation.
        //      What is its effect on program execution?
        MyDeprecated d1 = new MyDeprecated();
        d1.meth1();
        // 2. Suppress the warning generated in question number 1.
        @SuppressWarnings("deprecation")
        MyDeprecated d2 = new MyDeprecated();
        d2.meth1();
        // 3. Create an interface and generate an instance from it.
        MyInt inter = () -> System.out.println("I am display");
        inter.display();
        // 4. Write a Java program to generate a multiplication table of a given number
        //      and write it to a file.
        int i = 19;
        String table = "";
        for (int j = 0; j < 10; j++)
        {
            table += i + "X"+(j+1) + "=" + i*(j+1);
            table += "\n";
        }
        try
        {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}