package OOPS;

import java.util.*;

public class Inheritance2 {

    public static void main(String[] args) {
       cat c1 = new cat();
       c1.eat();
       c1.sleep();
       c1.setLimbs(4);
        System.out.println("My limbs are:  "+c1.setLimbs());
    }
}

class Animal{
    void eat()
    {
        System.out.println("Eating");
    }
    void feed()
    {
        System.out.println("Feeding");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swimming");
    }
    void run(){
        System.out.println("Running");
    }
}

class Shark extends Fish{
    void attack()
    {
        System.out.println("Attacking");
    }
    void mood(String mood)
    {
        System.out.println("Shark's mood: "+mood);
    }

}

class Bird extends Animal {
    void fly() {
        System.out.println("Bird is flying");
    }

    void inNest(String nest) {
        System.out.println("Are you in nest?" + nest);
    }
}

class peacock extends Bird{
    void dance()
    {
        System.out.println("Dancing");
    }
}

class Mammel extends Animal{
     int limbs;
     void setLimbs(int n)
     {
         this.limbs = n;
     }
     int setLimbs()
     {
         return this.limbs;
     }
}

class cat extends Mammel{
    void sleep()
    {
        System.out.println("I am sleeping");
    }
}