package part_06;
// Demonstrate dynamic method dispatch.

class DynamicMethod {
    void fancyshoes() { System.out.println("shoes() in DynamicMethod"); }
}

class Subclass1 extends DynamicMethod {
    void fancyshoes() { System.out.println("shoes() in Subclass1"); }
}

class Subclass2 extends DynamicMethod {
    void fancyshoes() { System.out.println("shoes() in Subclass2"); }
}

class Demo {
    public static void main(String[] args) {

        DynamicMethod superFashionable = new DynamicMethod();
        Subclass1 heels = new Subclass1();
        Subclass2 flats = new Subclass2();

        DynamicMethod dynamicmethodRef;

        dynamicmethodRef = superFashionable;
        dynamicmethodRef.fancyshoes();

        dynamicmethodRef = heels;
        dynamicmethodRef.fancyshoes();

        dynamicmethodRef = flats;
        dynamicmethodRef.fancyshoes();
    }
}