package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */
public class Exercise_04 {

    public static void main(String[] args) throws java.io.IOException {
        {Scanner input = new Scanner(System.in);
            System.out.print("Enter a number in pounds: ");

            double pound = input.nextDouble();
            System.out.println("The number of kilos is " + (.454 * pound));
        }
    }
}
