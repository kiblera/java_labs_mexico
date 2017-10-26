package part_03;

import sun.security.pkcs11.P11TlsKeyMaterialGenerator;

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
        long totalSeconds = System.currentTimeMillis()/1000;

        // Get the current second within the minute within the hour
        long currentSeconds = totalSeconds % 60;

        // Get total minutes
        long totalMinutes = totalSeconds/60;

        // Get the current minute in the hour
        long currentMinutes = totalMinutes % 60;

        // Get the total hours
        long totalHours = totalMinutes/60;

        // Get the current hour
        long currentHours = totalHours % 24;

        // Display results using a 12 hour clock, include AM or PM
        //if current hour is < 12 hours then am
        //if current hour is >=12 hours then pm

        if (currentHours < 12 ){
            //do something if true
            //identify that this is AM; currenthours < 12 hrs
            //5 am is current hour (you did some kind of calculation to determine it is less than 12 so you are
            //leaving that value  and now assigning AM to that value
            System.out.println(currentHours +  " am.");


 //           System.out.println("The current time is " + currentHours < 12) + "AM");

        } else  {
            // else do something else
            //identify this is PM
            //15 hr 15/12 >1  = 3 pm ....15 - 12 that gives you a va;ue of 3 ...and it also gives you the knowledge
            //that it i pm
            //
//            System.out.println("The current time is " + PM + "PM");
        }
    }
}