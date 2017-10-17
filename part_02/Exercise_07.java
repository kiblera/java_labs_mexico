package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *  Use do while
 */
public class Exercise_07 {

    public static void main(String args[])
        throws java.io.IOException {
        double i;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in minutes, up to 1,000,000,000.");

        double minutes = input.nextInt();

        double years = (minutes / 60 / 24 / 365);
        double days = (minutes / 60 / 24);

        // find the number of minutes
        double remainingMinutes = minutes % days;


        System.out.println("The number of minutes you entered equals " + days
                + " days" + " or " + years + " years");



    }
}