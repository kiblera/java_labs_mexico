package part_04;

/**

 Use a for loop to count to 2017. While looping, populate an array with the
 value of your iterator (ie, i). Once populated, print out the odd values
 (ie, 2017, 2015, 2013) of the array in reverse order.

 */

class Exercise_02 {

    public static void main(String[] strings) {

        int i;

        int[] a = new int[2017];

        // use a for loop and print odd numbers between 0 and 2017
         for (i = 0; i < 2017; i++) {
            a[i] = i;
            // odd values generated to the console
        }
        for (i = 2016; i > 0; i -= 2) {
            System.out.println(a[i]-1);

        }
    }
}