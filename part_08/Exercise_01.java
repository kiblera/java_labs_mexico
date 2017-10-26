package part_08;

public class Exercise_01 {

    public static void main(String[] args) {
        int nums[] = new int[4];
        try {
            System.out.println("Before exception");
            nums[5] = 20;
            System.out.println("This won't show.");
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out of bounds!");
        }
        System.out.println("After catch");
    }
}
