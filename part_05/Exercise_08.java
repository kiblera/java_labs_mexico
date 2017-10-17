package part_05;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, set the access variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int. Add these
 * two ints together and set a final instance variable in the outer with this value.
 */

class Outer {
    private  int num = 5;

    public static void main(String[] args) {
        Outer o = new Outer();
        o.analyze();
    }

    void analyze() {
        Inner obj1 = new Inner();
        obj1.accessOuter();

    }

    class Inner {

        String str;
        int i;

        public int accessOuter () {
            num = 10;
            analyze();
            return 0;
        }

    }
}