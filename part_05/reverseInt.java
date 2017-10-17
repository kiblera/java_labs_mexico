package part_05;

//create a class to print out integers in reverse order of input
public class reverseInt {

//main argument
    public static void main(String[] strings) {
        if (strings.length > 0) {
            for (int i = 0; i < strings.length / 2; i++) {
                String t = strings[i];
                strings[i] = strings[strings.length - 1 - i];
                strings[strings.length - 1 - i] = t;
            }
            for (String s : strings) {
                System.out.println(s);
            }
        } else {
            //Order of input
            int nums[] = {8, 58, 19, 5, 29, 10, 28, 73, 83, 1};

            //for loop takes in integers in the order they are received, and sorted
            for (int i = 0; i < nums.length / 2; i++) {
                //define new temporary integer of arrays
                int t = nums[i];
                //sort arrays in reverse order
                nums[i] = nums[nums.length - 1 - i];
                nums[nums.length - 1 - i] = t;
            }
            //print input of array in reverse order
            for (int t = 0; t <= nums.length - 1; t++) {
                System.out.println(nums[t]);
            }
        }
    }
}