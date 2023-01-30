package Array;

import java.util.Scanner;

public class EnhancedForLoop {

    public static void main(String[]args){

        Scanner S1 =  new Scanner(System.in);
        System.out.println("Please Enter the Number");

        int num1 = S1.nextInt();

        int [] arr = new int[10];

        for(int i = 1;i<=10;i++){

            arr[i-1] = num1*i;
        }

        System.out.println("-----------------------------");

        for(int n : arr){

            System.out.println(n);
        }



    }
}
