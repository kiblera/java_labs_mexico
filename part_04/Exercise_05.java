package part_04;

/**

 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.

 */

class EnhancedLoop  {
    public static void main (String args[])  {
        int nums [] = { 2, 7, 4, 3, 6, 5};
        int val = 5;
        boolean found = false;

        for(int x : nums)  {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found);
        System.out.println("Value found!");
    }
}