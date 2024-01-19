package Stack;

import java.util.*;


public class DuplicateParentheses {


    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //Closing Case
            if (ch == ')'){
                int count = 0;
                while (s.peek() != '('){
                    s.pop();
                    count++;
                }
                if (count<1)
                    return true;
                else
                    s.pop();
            }
            else
            {
                //Opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))";
        String str1 = "(a-b)";

        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str1));
    }
}