package SingleDimensionalArray;

public class ArrayExample3 {

    public static void main(String[] args) {
        //int a[]=new int [5];
        int a[] = {100, 200, 300, 400, 500}; // we can store any number of elements
        int sum = 0;
        for (int i : a) {
            System.out.println(i);
            sum = sum + i; //100 300 600 1000 1500

        }

        System.out.println(sum);
    }


}
