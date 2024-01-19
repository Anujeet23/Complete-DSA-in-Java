package OOPS;

import java.util.*;

public class Constructor {

    public static void main(String[] args) {
        Student1 s = new Student1();

    }
}

class Student1{
    private String name;
    private int roll_no;
    Student1()
    {
        System.out.println("Constructor is called...");
    }
    String getName()
    {
        return this.name;
    }
    void setName(String str)
    {
        name = str;
    }
    int getRoll_no()
    {
        return this.roll_no;
    }
    void setRoll_no(int num)
    {
        roll_no = num;
    }



}