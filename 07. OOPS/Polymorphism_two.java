package OOPS;

import java.util.*;

public class Polymorphism_two {

    public static void main(String[] args) {
        College1 c = new College1();
        Student6 s = new Student6();

        c.study();
        s.study();
    }
}

class College1{
    void study()
    {
        System.out.println("For learning new things students go to college");
    }
}

class Student6 extends  College1{
    void study()
    {
        System.out.println("Student should focus on studies");
    }
}