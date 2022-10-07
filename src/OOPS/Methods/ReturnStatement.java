package OOPS.Methods;

public class ReturnStatement {

    int a;
    int b;

    int sum() {

        return (a + b);
    }

    public static void main(String[] args) {

        ReturnStatement cal = new ReturnStatement();
        cal.a = 200;
        cal.b = 100;
        int r = cal.sum();
        System.out.println(r);

    }
}
