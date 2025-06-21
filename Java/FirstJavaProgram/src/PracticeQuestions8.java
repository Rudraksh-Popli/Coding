class Employee1
{
    int salary;
    String name;
    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public String setName(String newName)
    {
        name = newName;
        return name;
    }
}

class CellPhone
{
    public void ring()
    {
        System.out.println("Ringing...");
    }
    public void vibrate()
    {
        System.out.println("Vibrating...");
    }
    public void callFriend()
    {
        System.out.println("Calling John Wick...");
    }
}

class Square
{
    int side;
    public int area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return 4*side;
    }
}

class Rectangle
{
    int length, breadth;
    public int area()
    {
        return length*breadth;
    }
    public int perimeter()
    {
        return 2*(length+breadth);
    }
}

class Tommy
{
    public void hit()
    {
        System.out.println("Hitting the enemy");
    }
    public void run()
    {
        System.out.println("Running from the enemy");
    }
    public void fire()
    {
        System.out.println("Firing on the enemy");
    }
}

class Circle
{
    int radius;
    public float area()
    {
        return 3.14f*radius*radius;
    }
    public float perimeter()
    {
        return 3.14f*2*radius;
    }
}

public class PracticeQuestions8
{
    public static void main(String[] args)
    {
        // 1. Create a class Employee with the following properties and methods:
        //      Salary (property) (int)
        //      getSalary (method returning int)
        //      name (property) (String)
        //      getName (method returning String)
        //      setName (method changing name)

        // 2. Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.

        // 3. Create a class Square with a method to initialize its side, calculating area, perimeter etc.

        // 4. Create a class Rectangle & problem 3.

        // 5. Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.

        // 6. Repeat problem 4 for a circle.
    }
}