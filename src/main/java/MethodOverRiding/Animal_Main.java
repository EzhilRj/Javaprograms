package MethodOverRiding;

public class Animal_Main {

    public static void main(String[] args) {

        Animal a;

        a = new Animal();
        a.whoAmI();

        a = new Dog();
        a.whoAmI();

        a = new Cat();
        a.whoAmI();

    }
}
