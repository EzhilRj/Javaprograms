package AccessModifiers;

//private only within the class
//default accessible only within the package ( out side of the package not accessible)
//protected :accessible within the package and outside of the package but through inheritance.
//public: can be accessible everywhere (within the class, withing the package, outside tha package)

class A {
    private int a = 10;

    private void method1() {

        System.out.println(a);

    }


}

public class Private {

    public static void main(String[] args) {

        A aobj = new A();
        // aobj.a = 10;   //cannot access since its private
        // aobj.method1;//cannot access since its private
    }
}
