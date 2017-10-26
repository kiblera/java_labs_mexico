package part_10;

public class UseNewThread2 {

    public static void main(String args[]) {
        System.out.println("Main thread starting.");

        NewThread2 thrd2 = new NewThread2("Kid #1");

        for(int i=0; i < 50; i++) {
            System.out.print(".");
            try {
            }
            catch(Exception exc) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");
    }
}
