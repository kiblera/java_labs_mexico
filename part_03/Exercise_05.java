package part_03;


import java.util.Scanner;

/**
 *
 */
public class Exercise_05 {

    public static void main(String[] strings) {

        // read an integer from the user >=1 and <= 999,999,999
        int i, a, b;
        System.out.print("Enter any number between 1 and 999,999,999.");

        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        a = 4;
        b = 7;

            // use the && operator to see if the user's number is divisible by both 4 and 7
            if ((userNumber%a == 0) && (userNumber%b == 0)) {
                System.out.println("Your number is divisible by both 4 and 7.");

                // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively
            } else if ((userNumber%a == 0) ^ (userNumber%b == 0)) {
                System.out.println("Your number is divisible by 4 or 7 exclusively.");

            } else {
                System.out.println("Your number is not divisible by 4 or 7.");
                // print out the results
                // use the || operator to see if the user's number is divisible by 4 or 7
                //  if ((userNumber%a == 0) || (userNumber%b == 0))
                //      System.out.println("Your number is divisible by 4 or 7.");
        }
    }
}