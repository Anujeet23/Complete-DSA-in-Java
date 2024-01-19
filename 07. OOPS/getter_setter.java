package OOPS;

import java.util.*;

public class getter_setter {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Anujeet");
        s1.setRoll_no(30);

        System.out.println("My Name is: "+s1.getName()+" and my Roll Number is: "+s1.getRoll_no());
    }
}
class Student{
    private String name;
    private int roll_no;

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