package DataStructures.ArrayList;


import java.util.ArrayList;

public class ArrayLIstExample2 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        System.out.println(al.size());

        al.add("Welcome");
        al.add("123");
        al.add("10.523");
        al.add('c');

        System.out.println(al.size());
        System.out.println(al);

        //Inserting values in ArrayList
        al.add(1, '2');
        al.add(2, "Replace");

        System.out.println(al);

        //Removing Elements from the ArrayList

        al.remove("Replace");
        System.out.println(al);


    }


}
