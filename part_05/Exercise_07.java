package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 should have various instance variables. At least one of
 * must be static. Within class_01 create at least 3 instances of class_02. Set the instance variables of class_02. Then,
 * just once, in one place, set the static instance variable in class_02. Afterwards, print out the value of each instance
 * variable and the static variable for each class.
 */

class Class5 {
    public static void main(String[] args) {

        Class5_2 obj1 = new Class5_2();
        Class5_2 obj2 = new Class5_2();
        Class5_2 obj3 = new Class5_2();

        obj1.setJ(10);
        obj1.setX(4);
        obj1.setI(66);

        obj2.setJ(2);
        obj2.setX(4);
        //obj2.setI(8);

        obj3.setJ(2000);
        obj3.setX(3499);
        //obj3.setI(99);

        System.out.println(obj1.getJ() + " " + obj1.getX() + " " + obj1.getI());
        System.out.println(obj2.getJ() + " " + obj2.getX() + " " + obj2.getI());
        System.out.println(obj3.getJ() + " " + obj3.getX() + " " + obj3.getI());
    }

}

class Class5_2 {
    static int i;
    int j;
    int x;


    public int getI() {
        return i;
    }

    public void setI(int i) {
        Class5_2.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


}