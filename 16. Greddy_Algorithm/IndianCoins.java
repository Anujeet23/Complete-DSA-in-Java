package Greddy_Algorithm;

import java.util.*;

public class IndianCoins {

    //Brute Force but the coins are not minimal
    public static void main(String[] args) {
        int currency[] = {1,2,5,10,20,50,100,500,2000};
        int V = 322;

        ArrayList<Integer> l = new ArrayList<>();

        int vRem = V;
        for (int i = currency.length-1; i >= 0 ; i--) {
            for (int j = currency.length-1; j >= 0 ; j--) {
                if(currency[j] <= vRem && vRem != 0){
                    l.add(currency[j]);
                    vRem = vRem - currency[j];
                }
            }
        }
        System.out.println(l);
    }
}