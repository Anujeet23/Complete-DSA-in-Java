package OOPS;

import java.util.*;

public class Inheritance {


    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}
//Base  Class
class Animal{
    String color;
    void eat()
    {
        System.out.println("Eats");
    }

    void breathe()
    {
        System.out.println("Breathes");
    }
}

//Derived Class
class Fish extends Animal{
    int fins;

    void swim()
    {
        System.out.println("Swims in water");
    }
}