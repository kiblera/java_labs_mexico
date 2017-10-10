package part_04;

/**

 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.

 */

class EnhancedLoop  {
    public static void main (String args[]) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int x : array) {
            System.out.println((array[x - 1]));
        }
    }
}