package whats_new_in_java10;

import java.util.Scanner;

public class Var_Keyword {

    String str6;
    //var str7; -> Var Not Allowed Here

    public static void main(String[] args) {

        int num1 = 100;

        var num2 = 200;

        var str1 = "rdtfyghj";

        var num3 = 12.998;

        Scanner s1 = new Scanner(System.in);

        var s2 = new Scanner(System.in);

        int x = add(500,600);

        var y = add(100,200);

        int [] arr = new int[10];

        var arr2 = new int [10];

        int [] arr3 = {10,20,30,40,50};

        //var arr4 = {10,20,30,40}; -> Var Not Allowed Here

    }


    public static int add(int a, int b) {
        return a+b;
    }

}
