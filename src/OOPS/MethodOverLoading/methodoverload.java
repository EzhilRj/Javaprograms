package OOPS.MethodOverLoading;

public class methodoverload {

    int a;
    int b;

    void sum() {

        a = 10;
        b = 10;
        System.out.println(a + b);

    }

    void sum(int x, int y) {

        int a = x;
        int b = y;
        System.out.println(a + b);

    }

    void sum(int x, int y, int z) {
        int a = x;
        int b = y;
        int c = z;
        System.out.println(a + b + c);
    }

    void sum(int x, double y) {

        int a = x;
        double b = y;
        System.out.println(a+b);

    }

    public static void main(String[] args) {

        methodoverload cal = new methodoverload();
        cal.sum();
        cal.sum(100, 200);
        cal.sum(100, 200, 300);
        cal.sum(10, 10.5);

    }

}
