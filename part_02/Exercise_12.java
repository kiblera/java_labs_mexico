package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */
public class Exercise_12 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles to drive: ");
        double miles = input.nextDouble();

        System.out.print("Enter MPG of the car: ");
        double mpg = input.nextDouble();

        System.out.print("Enter price per gallon of fuel: ");
        double price = input.nextDouble();

        input.close();

        double tripCost = (miles / mpg * price);

        System.out.print("Cost of the trip is $" + tripCost);
    }
}