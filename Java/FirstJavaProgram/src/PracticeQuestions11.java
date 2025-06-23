abstract class Pen
{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen
{
    void write()
    {
        System.out.println("Write");
    }
    void refill()
    {
        System.out.println("Refill");
    }
    void changeNib()
    {
        System.out.println("Changing the nib");
    }
}

class Monkey
{
    void jump()
    {
        System.out.println("Jumping...");
    }
    void bite()
    {
        System.out.println("Biting...");
    }
}
interface BasicAnimal
{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal
{
    void speak()
    {
        System.out.println("Hello sir!");
    }
    @Override
    public void eat()
    {
        System.out.println("Eating");
    }
    @Override
    public void sleep()
    {
        System.out.println("Sleeping");
    }
}

interface TVRemote
{
    void turnOn();
    void increaseVolume();
    void decreaseVolume();
}
interface SmartTVRemote extends TVRemote
{
    void TurnOnNetflix();
    void TurnOnHotstar();
}
class TV implements TVRemote
{
    @Override
    public void turnOn()
    {
        System.out.println("Turning on the TV");
    }
    @Override
    public void increaseVolume()
    {
        System.out.println("Increasing Volume");
    }
    @Override
    public void decreaseVolume()
    {
        System.out.println("Decreasing Volume");
    }
    public void changeChannel()
    {
        System.out.println("Changing Channel");
    }
}

public class PracticeQuestions11
{
    public static void main(String[] args)
    {
        // 1. Create an abstract class pen with methods write () and refill () as abstract methods
        // 2. Use the pen class from Q1 to create a concrete class fountain pen
        //      with additional method change Nib ()
        // 3. Create a class monkey with jump ( ) and bite ( ) methods
        // 4. Create a class human which inherits this monkey class and implements basic animal interface with eat ( )
        //      and sleep ( ) methods
        // 5. Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods
        //      create another class smart telephone and demonstrate polymorphism
        // 6. Demonstrate polymorphism using monkey class from Q3
        Monkey monk = new Human();
        // monk.speak(); // Error
        // monk.eat();   // Error
        // monk.sleep(); // Error
        monk.jump();
        monk.bite();
        // 7. Create an interface TV remote and use it to inherit another interface smart TV remote
        // 8. Create a class TV which implements TV remote interface from Q7
    }
}