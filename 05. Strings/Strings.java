package Strings;

import java.util.*;

public class Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter strings simultaneously: ");
        String str = sc.nextLine();
        String str1 = sc.nextLine();

        if(str.equals(str1))
            System.out.println("They are same");
        else
            System.out.println("They are not same");

        System.out.println("Length of String is: "+str.length());
        System.out.println("Character at: "+str.charAt(0));
    }
}