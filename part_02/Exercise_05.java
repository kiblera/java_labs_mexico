package part_02;

import sun.security.x509.OCSPNoCheckExtension;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 *
 *
 */
public class Exercise_05 {

    public static void main(String[] args) {
        System.out.print("Enter a whole number.");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number < 10 && number > 0)  {
            if (number < 9) {
                if (number < 8) {
                    if (number < 7) {
                        if (number < 6)  {
                            if (number < 5)  {
                                if (number < 4)  {
                                    if (number < 3)  {
                                        if (number < 2)  {
                                            System.out.println("ONE");
                                        } else {
                                            System.out.println("TWO");
                                        }
                                    } else {
                                        System.out.println("THREE");
                                    }
                                } else {
                                    System.out.println("FOUR");
                                }
                            } else  {
                                System.out.println("FIVE");
                            }
                        } else  {
                            System.out.println("SIX");
                        }
                    } else {
                        System.out.println("SEVEN");
                    }
                } else {
                    System.out.println("EIGHT");
                }
            } else {
                System.out.println("NINE");
            }
        } else {
            System.out.println("OTHER");
        }
    }

}
