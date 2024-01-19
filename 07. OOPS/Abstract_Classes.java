package OOPS;

public class Abstract_Classes {


    public static void main(String[] args) {
        //Horse h = new Horse();
        //h.walk();
        //h.eat();
        //System.out.println(h.color);
        //h.changeColor();
        //System.out.println(h.color);

       // System.out.println();

       // Chicken c = new Chicken();
       // c.walk();
        //c.eat();
       // System.out.println(c.color);
       // c.changeColor();
        //System.out.println(c.color);

        Mustang myHorse = new Mustang();


    }
}


abstract class Animal{
    String color;
    void eat()
    {
        System.out.println("Animal Eats");
    }
    abstract void walk();

    Animal(){
        color = "Brown";
        System.out.println("Animal Constructor Called");
    }
}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor()
    {
        color = "Dark Brown";
    }
    void walk()
    {
        System.out.println("Walks on four legs....");
    }
}

class Mustang extends Horse{
     Mustang()
     {
         System.out.println("Mustang Constructor Called");
     }
}
class Chicken extends Animal{
    void changeColor()
    {
        color = "White-Yellow";
    }
    void walk()
    {
        System.out.println("Walks on Two legs");
    }
}