package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Run this app at least 3 times with different Strings/sentences.
 */

class Varargs {

    public static void main(String[] args) {
        Varargs vars1 = new Varargs();
        vars1.vaTest( 1, 2, 3, 5);
    }

    void vaTest(int ... v) {
        System.out.println("Number of args: " + v.length);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < v.length; i++){
            sb.append(v[i]).append(" ");
        }

        System.out.println(sb.toString());

    }
}