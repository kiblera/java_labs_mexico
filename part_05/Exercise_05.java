package part_05;

/**
 * Write one class. This class must have two methods, a main() + a recursive method. The recursive method must take in
 * an integer as a parameter. The recursive method must then print out "Hello Recursion!" as many times as the "initial"
 * input parameter dictates. For instance if the int passed to the recursive method is 10. The recursive method must print
 * out "Hello Recursion!" 10 times.
 *
 */

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Enter an integer. ");
        int input = stdIn.nextInt();

        stdIn.close();
        recursive(input);
    }

    public static void recursive (int i) {
        if (i == 0)  {
            return;
        }
        recursive(i-1);
        System.out.println("Hello Recursion!");
    }
 }