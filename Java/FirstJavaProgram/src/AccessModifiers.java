class MyEmployee
{
    private int id;
    private String name;

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        this.name = n;
    }
    public void setId(int i)
    {
        this.id = i;
    }
    public int getId()
    {
        return id;
    }
}

public class AccessModifiers
{
    public static void main(String[] args)
    {
        MyEmployee harry = new MyEmployee();
        // harry.id = 45; --> Throws an error due to private access modifier
        // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.print(harry.getId());
    }
}
