package OOPS;

import java.util.*;

public class Opps_two {

    public static void main(String[] args) {
           bankAccount b1 = new bankAccount();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the username: ");
           b1.username = sc.nextLine();
           System.out.println("Enter Password: ");
           String pwd = sc.nextLine();
           b1.setPassword(pwd);

           System.out.println("Username is: "+b1.username);
    }
}

class bankAccount{
    public String username;
    private String password;

    void setPassword(String pwd)
    {
        password = pwd;
    }
}