package part_06;

public class Superclass {

    private double weight;
    private double height;
    private String name;


    void hey(){
        System.out.println("hey");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;

    }
}

class SubClass extends Superclass {

    //Subclass instance variables
    private boolean something;
    private boolean somehow;


    public SubClass() {
        super.setWeight(39);
        super.setHeight(37);

    }

    public static void main(String[] arg) {
        SubClass total = new SubClass();
        double y = total.anything();
    }

    public double anything () {
        hey();
        return getHeight() * getWeight();

    }
}

class SubClass2 extends SubClass {

    //Subclass instance variables
    private boolean anotherthing;
    private boolean anotherway;

    public double anything2 () {

        hey();
        setHeight(678);
        setWeight(890);
        return getHeight() * getWeight();
    }
}