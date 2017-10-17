package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */

class Class_1{
    public static void main(String[] args) {

        Class_2 x = new Class_2();
        Class_2 y = new Class_2(9);
        Class_2 z = new Class_2(2, 3);


        y.setA(2);
        y.setB(5);
        y.setC(10);


        int i =10, j = 6;
        x.setA(2);
        x.setB(5);
        x.setC(10);

        y.setB(i);
        z.setC(i*j);

        System.out.println(y.getA());
        System.out.println(y.getB());
        System.out.println(y.getC());
    }
}

class Class_2 {
    //create 3 or more private variables
    private int a;
    private int b;
    private int c;

    //create at least 3 overloaded constructors
    Class_2() {
        System.out.println("Inside Class_2().");
        a = 0;
    }
    Class_2(int a) {
        System.out.println("Inside Class_2(int).");
        b = a;
    }
    Class_2(int i, int j) {
        System.out.println("Inside Class_2(int, int).");
        c = i * j;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}