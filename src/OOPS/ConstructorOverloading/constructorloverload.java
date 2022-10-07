package OOPS.ConstructorOverloading;

import OOPS.Constructor;

public class constructorloverload {

    int a = 0;
    int b = 0;
    double c = 0;

    //First Constructor
    constructorloverload() {

        a = 10;
        b = 20;
        c = 20.5;

    }
    //second Constructor
    constructorloverload(int x, int y) {

        a = x;
        b = y;

    }
    //Third Constructor
    constructorloverload(int x, double z) {

        a = x;
        c = z;

    }

    //fourth Constructor
    constructorloverload(int x, int y, double z) {

        a = x;
        b = y;
        c = z;

    }

    void display() {

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    public static void main(String[] args) {

        //constructorloverload sum = new constructorloverload();  // Calling First Constructor
        //constructorloverload sum = new constructorloverload(10,20);// Calling Second Constructor
        //constructorloverload sum = new constructorloverload(10,20.5);// Calling Third Constructor
        constructorloverload sum = new constructorloverload(10,20,20.5);// Calling Fourth Constructor
        sum.display();

    }


}
