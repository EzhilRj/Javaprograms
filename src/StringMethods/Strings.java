package StringMethods;

public class Strings {

    public static void main(String[] args) {

        String s = "Welcome";
        System.out.println(s.length()); // 7- number of characters in the string
        //concatenation
        String s1 = "welcome to";
        String s2 = " training";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));
        System.out.println("welcome to" + "training");
        System.out.println("welcome".concat("training"));

        //Equals - comparing two strings
        String s3="WELCOME";
        String s4="welcome";
        System.out.println(s3.equals(s4)); // false
        System.out.println(s3.equalsIgnoreCase (s4)); //true
         //contains()
        System.out.println(s3.contains ("ABC")); //false
         //substring
        System.out.println(s.substring(0,3)); // WEL
        System.out.println(s.substring(2,5)); // L CO
        System.out.println(s.substring(4,7)); // O ME

        //replace
        System.out.println(s.replace('e', 'a'));
        System.out.println(s.replace("come", "kame"));
    }


}
