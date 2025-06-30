import java.util.Date;

public class DateTime
{
    public static void main(String[] args)
    {
        System.out.println(System.currentTimeMillis()/1000/3600/24 + " days");
        System.out.println(System.currentTimeMillis()/1000/3600/24/7 + " weeks");
        System.out.println(System.currentTimeMillis()/1000/3600/24/30 +" months");
        System.out.println(System.currentTimeMillis()/1000/3600/24/365 + " years");
        // System.out.println(Long.MAX_VALUE);
        // System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
    }
}
