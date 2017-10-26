package part_07;

//1) Write one super class with at least 3 private instance variables and at least 3 public methods
//        2) Write three subclasses (with at least 3 methods each that not getters and setters) that extend the super
//class. Make sure each subclass can manipulate the private variables in the super class. One subclass should
//        extend another subclass which extends the super class. Each subclass should only have variables and methods
//        that apply to that subclass, ie Animal -> Mammal -> Whale.
//        3) Make use of the keyword "super" in at least two constructors.
//        4) Write an interface with at least 3 methods. Have the superclass implement this interface.


interface ExerciseInterface {

    public void exerciseIsFun();

    public void loseWeight();

    public void funHobby();


}

public class Exercise implements ExerciseInterface{

    //creating variables of super class
    private double caloriesburned;
    private double minutes;
    private int targetbpm;
    private String name;

    Exercise(double caloriesburned, double minutes, int targetbpm, String name) {
        this.caloriesburned = caloriesburned;
        this.minutes = minutes;
        this.targetbpm = targetbpm;
        this.name = name;
    }

    Exercise(){

    }


    //creating at least 3 public methods
    public void exerciseIsFun() {
        System.out.println("I'm having fun!");

    }

    @Override
    public void loseWeight() {

    }

    @Override
    public void funHobby() {

    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;

    }

    public double getCaloriesburned() {
        return caloriesburned;
    }

    public void setCaloriesburned(double caloriesburned) {
        this.caloriesburned = caloriesburned;
    }

    public double getMinutes() {
        return minutes;
    }

    public void setMinutes(double minutes) {
        this.minutes = minutes;
    }

    public int getTargetbpm() {
        return targetbpm;
    }

    public void setTargetbpm(int targetbpm) {
        this.targetbpm = targetbpm;
    }
}

class Aerobic extends Exercise {

    private String cardio;
    private String sneakers;

    Aerobic(String cardio, String sneakers){
        super();
        this.cardio = cardio;
        this.sneakers = sneakers;
    }

    public String moveAround(){
        return "Move around!";
    }

    public void defaultName() {
        setName("Running");
    }


}

class Dance extends Aerobic {

    private String music;

    Dance(String music, String cardio, String sneakers) {

        super(cardio, sneakers);
        System.out.println("Inside constructor");
        this.music = music;
    }

    public void defaultMinutes() {

        Aerobic newobj = new Aerobic("medium", "Blue");
        Dance danOb = new Dance("pitbull", "high", "Heel");

        setMinutes(60);
    }

}

