package Interfaces;

interface Testinter{

    int a =12;
    void display();
}

public class InterfaceExample implements Testinter {

    public void display(){

        System.out.println(a);
    }
    public static void main(String[]args){

        InterfaceExample ie =  new InterfaceExample();
        ie.display();



    }


}
