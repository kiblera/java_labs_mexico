package part_10;

public class NewThread2 extends Thread {

    // Construct a new thread.
    NewThread2(String name) {
        super(name); // name thread
        start(); // start the thread
    }

    // Begin execution of new thread.
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                count = 9;
                System.out.println("In " + getName() +
                        ", count is " + count);
            }
        }
        catch(Exception exc) {
            System.out.println(getName() + " exception.");
        }

        System.out.println(getName() + " terminating.");
    }
}
