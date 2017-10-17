package part_05;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */

class Class_01 {

    //this is a static method and cannot call an instance method without a object
    public static void main(String[] args){
        //create instance of object
        Class_01 obj1 = new Class_01();
        //call instance method using object
        obj1.someMethod();

        Class_02 obj2 = new Class_02();
        obj2.setB(10);
        obj2.setA(20);
        int result = obj2.multiplyAB();
        System.out.println(result);

        obj2.setY("Y");
        obj2.anotherMethod();

    }

    private void someMethod(){
        System.out.println("Moving to class 2...");
    }

}// end class SomeName

class Class_02 {
    private int b;
    int a;
    private String y;
    private String z;


    public int multiplyAB(){
        return a * b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if (b >= 0 && b <= 100) {
            this.b = b;
        }
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;

        //instance method
    }

    public void anotherMethod(){
        System.out.println("Moving to class 3...");
        Class_03 c = new Class_03();
        c.setE(40);
        c.setJ("30");

    }
}

class Class_03 {
    private int e;
    int d;
    private int i;
    private String j;

    public int multiplyDE() {
        return e * d;
    }

    public int getE() {
        return e;
    }

    public void setE(int a) {
        this.e = e;
    }

    public int getD() {
        return d;
    }

    public void setD(String z) {
        this.d = d;
    }

    public String getJ() {
        return j;
    }

    public void setJ(String j) {
        this.j = j;
    }

    public void setI(int i) {
        if (i >= 0 && i <= 100) {
            this.i = i;
        }
    }

    public int getI() {
        return i;
    }

    public void setX(int x) {
        this.i = x;
    }
}