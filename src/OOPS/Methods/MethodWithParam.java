package OOPS.Methods;

public class MethodWithParam {

    //Method takes Parameter
    int a;
    int b;

    void Sum(int x, int y) {

        a = x;
        b = y;
        System.out.println(a + b);

    }

    public static void main(String[] args) {

        MethodWithParam cal = new MethodWithParam();
        cal.Sum(100, 200);


    }
}
