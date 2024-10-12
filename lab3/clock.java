
import java.util.Calendar;

public class clock{
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
        System.out.println(t.toString());
        System.out.println(t.toMilitaryString());

        long timeNow = Calendar.getInstance().get(Calendar.MINUTE);  // Get the current minute
        long start = System.currentTimeMillis();  // Get the current time in milliseconds
        
        while(Calendar.getInstance().get(Calendar.MINUTE) == timeNow)  // Continuously check the current minute
        {   
            long current = System.currentTimeMillis();
            if(current - start >= 1000)  // Check if 1 second has passed
            {
                t.tick();  // Increment the time by 1 second
                System.out.println(t.toString());  // Print the updated time
                start = current;  // Reset the start time
            }
        }
        

    }
}

