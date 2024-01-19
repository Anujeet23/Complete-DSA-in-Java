package OOPS;

public class Interface_two {

    public static void main(String[] args) {
       Bear b = new Bear();

       b.herbs();
       b.meat();
       b.eat();
    }
}


interface Herbivorous{
    void herbs();
}

interface Carnivorous{
    void meat();
}

class Bear implements Herbivorous, Carnivorous{

    public void herbs()
    {
        System.out.println("I am eating Veg.");
    }

    public void meat()
    {
        System.out.println("I am eating Non-Veg");
    }

    void eat()
    {
        System.out.println("I love eating veg as well as non-veg");
    }
}