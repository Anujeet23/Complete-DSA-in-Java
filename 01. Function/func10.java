package function;

import java.util.Scanner;

public class func10 {

    public static boolean palindrome(String s) {
        int start = 0;
        int end =  s.length() - 1; // Subtract 1 to get the correct index of the last character

        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++; // Increment the start index
            end--; // Decrement the end index
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine(); // Read input from the user

        if (palindrome(s)) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }

    }
}

