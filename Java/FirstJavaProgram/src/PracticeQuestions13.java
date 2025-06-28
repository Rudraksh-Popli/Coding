class Practice13 extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("Good Morning!");
        }
    }
}
class Practice13b extends Thread
{
    public void run()
    {
//        while(false)
//        {
//            try
//            {
//                Thread.sleep(200);
//            }
//            catch (Exception e)
//            {
//                System.out.println(e);
//            }
//            System.out.println("Welcome");
//        }
    }
}

public class PracticeQuestions13
{
    public static void main(String[] args)
    {
        // 1. Write a program to print "Good morning" and "Welcome"
        //      continuously on the screen in Java using threads.
        // 2. Add a step method in the welcome thread of question 1 to delay its execution for 200ms.
        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();
        // 3. Demonstrate getPriority() and setPriority() methods in Java threads.
        // p1.setPriority(6);
        // p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        // 4. How do you get the state of a given thread in Java?
        System.out.println(p2.getState());
        // p1.start();
        p2.start();
        System.out.println(p2.getState());
        // 5. How do you get the reference to the current thread in Java?
        System.out.println(Thread.currentThread().getState());
    }
}