package OOPS;

import java.util.*;

public class Copy_Constructor {

    public static void main(String[] args) {
        Student2 s = new Student2();

        Student2 s1 = new Student2(s);
        System.out.print(" "+s1.name+" "+s1.roll_no);
    }
}

class Student2 {
     String name;
     int roll_no;

     Student2(Student2 s){
           this.name = "Anujeet";
           this.roll_no = 30;
     }
    Student2() {
        System.out.println("Constructor is called...");
    }
}