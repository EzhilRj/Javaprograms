package ExceptionHandling;

public class HandleUncheckedExceptions {

    public static void main(String[] args) {

        int a = 20;

        try {
            System.out.println(a / 0);

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());
        }

        String s = null;

        try {

            System.out.println(s.length());

        } catch (NullPointerException n) {

            System.out.println(n.getMessage());
        }
    }


}