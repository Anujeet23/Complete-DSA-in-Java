package Strings;

import java.util.*;

public class Substring {

    public static String subString(String S,int s,int e) {
        String sub = "";
        for (int i = s; i < e; i++) {
            sub += S.charAt(i);
        }
        return sub;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Enter starting and ending index: ");
        int s,e;
        s = sc.nextInt();
        e = sc.nextInt();

        //System.out.println("Substring is: "+subString(str,s,e));
        System.out.println(str.substring(0,5));
    }
}