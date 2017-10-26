package part_08;

public class ClassA {

    public static void main(String[] args) {
        ClassB arrayException = new ClassB();

        try {ClassB.arrayException();
        }
            catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Index out of bounds!");
        }
    }
}
