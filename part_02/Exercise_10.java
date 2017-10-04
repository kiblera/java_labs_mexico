package part_02;


/**
 * Part 2 Exercise 10:
 *
 *      Write a program that prints out every prime number between 1 and 100
 *
 */
public class Exercise_10 {
    public static void main(String args[]) {

        int count, d;
        boolean isPrime = true;

        for (count = 2; count <= 100; count++) {
            isPrime = true;

            for (d = 2; d <= count - 1; d++) {
                if (count % d == 0) {
                    isPrime = false;
                }
            }
            if (isPrime)
            System.out.println(count + " is prime");
        }
    }
}