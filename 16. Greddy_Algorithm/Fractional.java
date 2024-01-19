package Greddy_Algorithm;

import java.util.*;

public class Fractional {

    public static void main(String[] args) {
        int value[] = {60, 100,120};
        int weight[] = {10,20,30};
        int capacity = 50;

        double pwRatio[][] = new double[value.length][2];

        for (int i = 0; i < value.length; i++) {
            //Original Index
            pwRatio[i][0] = i;
            pwRatio[i][1] = value[i]/(double)weight[i];
        }

        //Lambda Function -> ShortForm
        //Sorted in Ascending Order
        Arrays.sort(pwRatio, Comparator.comparingDouble(o -> o[1]));
        int wtRemaining = capacity;
        double profit = 0;
        for (int i = pwRatio.length-1; i >=0; i--) {
            int idx = (int)pwRatio[i][0];

            if(weight[idx] <= wtRemaining){
                //Including full item
                profit = profit + value[idx];
                wtRemaining = wtRemaining - weight[idx];
            }
            else {
                //Including Fractional Item
                 profit = (double) profit + (double)(pwRatio[i][1] * wtRemaining);
                 capacity = 0;
                 break;
            }
        }
        System.out.println("Total Profit Earned: "+profit);
    }
}