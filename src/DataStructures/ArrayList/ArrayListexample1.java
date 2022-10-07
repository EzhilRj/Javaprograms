package DataStructures.ArrayList;

import java.util.ArrayList;

public class ArrayListexample1{

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
       // adding elements to array list
        list.add("Raj");
        list.add("Ravi");
        list.add("Pavan");
        list.add("Simran");
        list.add("Arvinder");
        System.out.println(list.size()); // returns number of elements in array
        for (String s : list) // reading elements from array list
        {
            System.out.println(s);

        }
    }
}
