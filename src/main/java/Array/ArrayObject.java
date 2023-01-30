package Array;

public class ArrayObject {

    public static void main(String[]args){

        String[] Days = new String[7];
        Days[0] = "Monday";
        Days[1] = "Tuesday";
        Days[2] = "Wednesday";
        Days[3] = "Thursday";
        Days[4] = "Friday";
        Days[5] = "Saturday";
        Days[6] = "Sunday";

        for(int i = 0;i<=Days.length-1;i++){

            System.out.println(Days[i]);
        }


    }
}
