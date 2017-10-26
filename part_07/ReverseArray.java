package part_07;

public class ReverseArray {

    public static void main(String[] args) {
        int i;

        if (args.length > 0) {
            for (i = 0; i < args.length / 2; i++) {
                String temp = args[i];
                args[i] = args[args.length - 1 - i];
                args[args.length - 1 - i] = temp;
            }
            for (i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
    }
}