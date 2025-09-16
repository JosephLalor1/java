// Student Name 	: Joseph Lalor
// Student Id Number: 
// Date 			: 16/09/25
// Purpose 			:
import java.util.Calendar;

public class Clock 
{
    public static void main (String args[])
        {
            Calendar cal = Calendar.getInstance();
            Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
            long count;
            long index;

            count = System.currentTimeMillis();
            index = System.currentTimeMillis();
            System.out.println(t.toString());

            while (System.currentTimeMillis() < (index + (1000 * 60)))
                {
                    if (System.currentTimeMillis() > (count + 1000))
                        {
                            t.tick();
                            System.out.println(t.toString());
                            count = System.currentTimeMillis();
                        }
                }
        }
}
