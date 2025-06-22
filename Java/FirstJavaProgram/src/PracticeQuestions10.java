class Circle10
{
    public int radius;
    Circle10()
    {
        System.out.println("I am none parameter of circle10");
    }
    Circle10(int r)
    {
        System.out.println("I am circle10 parameterized constructor");
        this.radius = r;
    }

    public double area()
    {
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle10
{
    public int height;
    Cylinder1(int r, int h)
    {
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume()
    {
        return Math.PI*this.radius*this.radius*this.height;
    }
}
class Rectangel
{
    public int length,breadth;
    Rectangel()
    {
        System.out.println("I am none parameter of Rectangel");
    }
    Rectangel(int l, int b)
    {
        System.out.println("I am Rectangel parameterized constructor");
        this.length = l;
        this.breadth = b;
    }
    public double area()
    {
        return length*breadth;
    }
}
class Cuboid extends Rectangel
{
    public int height;
    Cuboid(int l, int b, int h)
    {
        super(l,b);
        System.out.println("I am Cuboid parameterized constructor");
        this.length =l;
        this.breadth = b;
        this.height = h;
    }
    public double volume()
    {
        return length*breadth*height;
    }
}

public class PracticeQuestions10
{
    public static void main(String[] args)
    {
        // 1. Create a class circle and use inheritance to create another class cylinder from it

        // 2. Create a class rectangle and use inheritance to create another class cuboid,
        //      try to keep it as close to the real-world scenario as possible

        // 3. Create a method for area and volume in 1

        // 4. Create methods for area & volume in 2 also create getters and setters

        // 5. What is the order of constructor execution for the following inheritance hierarchy
        //                    Base
        //                   Derived 1
        //                   Derived 2
        //      Derived obj = new Derived 2( );
        //    Which constructor(s) will be executed & in what order?

        //      Answer - Base -> Derived1 -> Derived 2
    }
}