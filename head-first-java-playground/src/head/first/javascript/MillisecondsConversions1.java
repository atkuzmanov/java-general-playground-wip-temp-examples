package head.first.javascript;

import java.util.Date;

public class MillisecondsConversions1 {

    public static void main(String[] args) {
        long sysTimeMillis = System.currentTimeMillis();

        Date date = new Date();
        long dateTimeMillis = date.getTime();

        System.out.println("> sysTimeMilli: " + sysTimeMillis);
        System.out.println("> dateTimeMilli: " + dateTimeMillis);

        System.out.println(">>> convertDaysInMilli: " + convertDaysInMillis(2));

        System.out.println(">>> convertMillisToDays: " + convertMillisToDays(dateTimeMillis));
    }

    /**
     * Multiplying the number of days by 24 hours by 60 minutes by 60 seconds by 1000 milliseconds.
     *
     * @param days
     * @return daysInMilli
     */
    public static long convertDaysInMillis(int days) {
        long daysInMilli = days * 24 * 60 * 60 * 1000;
        return daysInMilli;
    }

    /**
     * Dividing the milliseconds by (Multiplying 1000 milliseconds by 60 seconds by 60 minutes by 24 hours)
     *
     * @param millis
     * @return days
     */
    public static int convertMillisToDays(long millis) {
        // int days = (int)(millis / (1000 * 60 * 60 * 24));
        int days = Math.round(millis / (1000 * 60 * 60 * 24));
        return days;
    }
}
