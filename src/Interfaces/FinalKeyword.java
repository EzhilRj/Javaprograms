package Interfaces;

class Test {

    final int a = 10;

    final void m1() {

        //a=20; // not valid bcoz a is final varaible
        System.out.println(a);
    }
}

class Test123 extends Test {

   /* void m1() //Not a Valid bcoz m1 is Final Method
    {
        System.out.println("m1 is overriden");
    }
}*/

}
