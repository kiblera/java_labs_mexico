package part_08;

public class ClassB {
    static void arrayException() {
        int nums[] = new int[8];

        System.out.println("Before exception generates");
        nums [9] = 17;
        System.out.println("This will not show");
    }
}
