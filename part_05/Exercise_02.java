package part_05;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you ust manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 *
 */

class One {
    public static void main(String[] args) {
    One newObjectOne = new One();

    Two newObjectTwo = new Two();

        newObjectTwo.setX(10);
        newObjectTwo.setY(20);
        newObjectTwo.setZ(50);

        System.out.println(newObjectTwo.toString());

        int x = newObjectTwo.getX();
        int y = newObjectTwo.getY();
        int z = newObjectTwo.getZ();

        newObjectOne.method_01(newObjectTwo);

        System.out.println(newObjectTwo.toString());}

    public void method_01(Two obj) {

        obj.setX(100);
        obj.setY(200);
        obj.setZ(500);

        method_2(obj);}

    public void method_2(Two obj) {
        obj.setX(1000);
        obj.setY(2000);
        obj.setZ(5000);
    }
}

class Two {

    private int x;
    private int y;
    private int z;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public String toString() {
        return "SecondClass{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}