package RegEx;

public class Character_Classes {

    public static void main(String[]args){

        String patt = "\\d{4}";

        String str = "6787";

        System.out.println(str.matches(patt));

    }
}
