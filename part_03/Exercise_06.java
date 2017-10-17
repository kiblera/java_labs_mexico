package part_03;

import java.util.Calendar;
import java.util.Scanner;

class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);
        Calendar now = Calendar.getInstance();

        System.out.print("Enter the time zone offset to GMT (ie, -8 or 8): ");
        long timeZoneChange = input.nextInt();

        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();

        // Get total seconds since midnight, 1/1/1970
        long totalSeconds = System.currentTimeMillis();

        // Get the current second within the minute within the hour
        now.get(Calendar.SECOND);

        // Get total minutes
        long totalMinutes = System.currentTimeMillis();

        // Get the current minute in the hour
        now.get(Calendar.MINUTE);

        // Get the total hours
        long totalHours = System.currentTimeMillis();

        // Get the current hour
        now.get(Calendar.HOUR);


        // Display results using a 12 hour clock, include AM or PM
        // System.out.println("  "+Calendar.getTime());

    }
}
