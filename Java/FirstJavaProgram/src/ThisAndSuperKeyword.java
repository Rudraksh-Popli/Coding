import javax.print.Doc;

class EkClass
{
    int a;
    public int getA()
    {
        return a;
    }
    EkClass(int a)
    {
        this.a = a;
    }
    public int returnnone()
    {
        return 1;
    }
}

class DoClass extends EkClass
{
    DoClass(int c)
    {
        super(c);
        System.out.println("I am a constructor");
    }
}

public class ThisAndSuperKeyword
{
    public static void main(String[] args)
    {
        EkClass e = new EkClass(65);
        DoClass d = new DoClass(5);
        System.out.println(e.getA());
    }
}