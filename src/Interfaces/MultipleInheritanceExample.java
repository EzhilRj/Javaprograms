package Interfaces;

interface A {

    int a = 10;

    void display();

}

interface b {

    int b = 20;

    void show();

}



public class MultipleInheritanceExample implements A,b {

    public void display(){
        System.out.println(a);
    }

      public void show() {

          System.out.println(b);
    }

    public static void main(String[]args){

        MultipleInheritanceExample me = new MultipleInheritanceExample();
        me.display();
        me.show();
    }
}
