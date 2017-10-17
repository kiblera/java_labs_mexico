package part_05;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */


class Overload {
    public static void main(String[] args) {
        Overload_2 object1 = new Overload_2();
        object1.overload1(5);
        System.out.println(5);

        Overload_2 object2 = new Overload_2();
        object2.overload1(21.8);
        System.out.println(21.8);

        Overload_2 object3 = new Overload_2();
        object3.overload1(1958.394);
        System.out.println(1958.394);

        }
    }

class Overload_2 {

    public int overload1(int i) {

        System.out.println("The int overloaded version of overload 1: " + i);

        return i;
    }


    public double overload1(double f) {

        System.out.println("The float overloaded version of overload 2: " + f);

        return f;
    }

}