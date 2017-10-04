package part_03;

import com.sun.prism.shader.Solid_ImagePattern_Loader;
import sun.plugin2.message.JavaScriptMemberOpMessage;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task.

 */

class RunningController {

    public static void main(String[] args) {

        Runner ryan = new Runner();
        ryan.setShoeColor("blue");
        ryan.setMph(2);
        ryan.setBpm(120);
        System.out.println("Ryan's shoes are " + ryan.getShoeColor() + " and his mph is " + ryan.getMph() + ".");
        System.out.println("Ryan can run " + ryan.calculateDistance(2) + " miles in 2 hours.");
        System.out.println("Ryan had " + ryan.calculateHeartbeats(120) + " heartbeats during the run.");

    }
}

class Runner {

    String shoeColor;
    int mph;
    int bpm;

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    // write a method that takes an int "time in hours" as a parameter and returns the total distance run
    public int calculateDistance(int runningTime){
        return runningTime * mph;

    }

    //write a method that calculates total heartbeats over entire run based on bpm
public int calculateHeartbeats(int runningTime){
        return runningTime * bpm;
}


    public String getShoeColor() {
        return shoeColor;
    }

    public void setShoeColor(String shoeColor) {
        this.shoeColor = shoeColor;
    }

    public int getMph() {
        return mph;
    }

    public void setMph(int mph) {
        this.mph = mph;
    }
}