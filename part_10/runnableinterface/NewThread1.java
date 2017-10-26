package part_10;


// Create a thread by implementing Runnable.
public class NewThread1 implements Runnable {

    String thrdName;

    NewThread1(String name) {
        thrdName = name;
    }

    // Entry point of thread.
    public void run() {
        System.out.println(thrdName + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                System.out.println("In " + thrdName +
                        ", count is " + count);
            }
        }
        catch(Exception exc) {
            System.out.println(thrdName + " exception.");
        }
        System.out.println(thrdName + " terminating.");
    }
}
