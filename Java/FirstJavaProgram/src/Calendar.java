import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calendar extends Thread
{
    public static void main(String[] args)
    {
        // Calendar c = Calendar.getInstance();
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTimeZone());
        java.util.Calendar c = java.util.Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
        System.out.println(c.get(java.util.Calendar.DATE));
        System.out.println(c.get(java.util.Calendar.SECOND));
        System.out.println(c.get(java.util.Calendar.HOUR));
        System.out.println(c.get(java.util.Calendar.HOUR_OF_DAY) + ":" + c.get(java.util.Calendar.MINUTE) + ":" + c.get(java.util.Calendar.SECOND));
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2018));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}