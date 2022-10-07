package OOPS.Methods;

public class EmptyParam {

    int a;
    int b;

    //1) method may not takes parameters empty parameters
    void sum() {

        System.out.println(a + b);
    }


    public static void main(String[] args) {
        EmptyParam cal = new EmptyParam();
        cal.a = 100;
        cal.b = 200;
        cal.sum();
    }


}
