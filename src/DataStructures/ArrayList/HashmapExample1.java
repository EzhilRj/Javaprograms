package DataStructures.ArrayList;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample1 {

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("Ezhil", 200);
        hm.put("Priyan", 300);
        hm.put("Sudha", 210);
        hm.put("Vishal", 1900);
        hm.put("Ayyappa", 5800);

        System.out.println(hm);

        for (Map.Entry m : hm.entrySet()) {

            System.out.println(m.getKey() + "  " + m.getValue());


        }


    }
}
