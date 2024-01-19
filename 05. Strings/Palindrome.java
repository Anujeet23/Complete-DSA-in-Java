package Strings;

import java.util.*;

public class Palindrome {

    public static boolean palindrome(String s) {
            int start = 0;
            int end = s.length()-1;

            while (start<end)
            {
                if(s.charAt(start) != s.charAt(end))
                {
                    return false;
                }
                start++;
                end--;
            }
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        if (palindrome(str))
        {
            System.out.println(str+" is a palindrome");
        }
        else
        {
            System.out.println(str+" is a palindrome");
        }
    }
}