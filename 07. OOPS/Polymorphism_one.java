package OOPS;

import java.util.*;

public class Polymorphism_one {

    public static void main(String[] args) {
       Calculator  c = new Calculator();
        System.out.println(c.sum(2,4));
        System.out.println(c.sum((float) 3.4,(float) 1.1));
        System.out.println(c.sum(1,2,3));
    }
}

class Calculator{
    int sum(int a,int b)
    {
        return (a+b);
    }

    float sum(float a, float b){
        return (a+b);
    }

    int sum(int a,int b,int c)
    {
        return (a+b+c);
    }
}