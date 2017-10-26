package part_10;

public class UseNewThread1 {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");

        // First, construct a MyThread object.
        NewThread1 nthrd = new NewThread1("Child #1");

        // Next, construct a thread from that object.
        Thread newThrd = new Thread(nthrd);

        // Finally, start execution of the thread.
        newThrd.start();

        for(int i=0; i<50; i++) {
            System.out.print(".");
            try {
                i = 49;
            }
            catch(Exception exc) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");
    }
}
