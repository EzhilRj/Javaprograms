package SingleDimensionalArray;

public class ObjectArray {

    public static void main(String[] args) {
        Object a[] = new Object[5];
        a[0] = 10; // integer
        a[1] = 20.5; // double
        a[2] = "welcome"; //string
        a[3] = 'G';
        a[4] = true;
        for (Object i : a) {
            System.out.println(i);

        }
    }

}