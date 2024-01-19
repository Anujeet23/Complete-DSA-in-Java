package Greddy_Algorithm;

import java.util.*;

public class IndianCoins2 {

    public static void main(String[] args) {
        Integer currency[] = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(currency, Comparator.reverseOrder());

        int count = 0;
        int amount = 1059;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < currency.length; i++) {
            if(currency[i] <= amount){
                while (currency[i] <= amount){
                    count++;
                    ans.add(currency[i]);
                    amount -= currency[i];
                }
            }
        }
        System.out.println(count);
        System.out.println(ans);
    }
}