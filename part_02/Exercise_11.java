package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble() / 100;

        System.out.print("Enter number of years: ");
        double years = input.nextDouble();

        input.close();

        double futureInvestmentValue = calculateFutureInvestment(
                investmentAmount, annualInterestRate, years);

        System.out.print("Accumulated value is $" + futureInvestmentValue);}

    private static double calculateFutureInvestment(double investmentAmount,
                                                    double annualInterestRate, double years) {
        double futureInvestmentValue = investmentAmount
                * Math.pow((1 + (annualInterestRate / 12)), (years * 12));
        return futureInvestmentValue;
    }

}