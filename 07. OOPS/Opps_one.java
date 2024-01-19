package OOPS;

import java.util.*;

public class Opps_one {

    public static void main(String[] args) {
        College s1 = new College();
        s1.setName("Anujeet");
        s1.setRoll_no(30);

        System.out.println("My Name is: "+s1.name+" and my Roll Number is: "+s1.roll_no);
    }
}

class College{
      String name;
      int roll_no;

      void setName(String str)
      {
          name = str;
      }

      void setRoll_no(int num)
      {
          roll_no = num;
      }

}