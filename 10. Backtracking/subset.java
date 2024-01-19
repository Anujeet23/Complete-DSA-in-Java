package Backtracking;

import java.util.*;

public class subset {

    public static void findSubset(String str,String ans,int i) {
        //Base Case
        if(i == str.length()){
            if (ans.length()==0){
                System.out.println("NULL");
            }
            System.out.println(ans);
            return;
        }

        //Recursion
        //Character will be a part of String
        findSubset(str,ans + str.charAt(i),i+1);
        //Character will not be a part of String
        findSubset(str,ans,i+1);

    }
    public static void main(String[] args) {
        String str = "abc";
        findSubset(str,"",0);
    }
}