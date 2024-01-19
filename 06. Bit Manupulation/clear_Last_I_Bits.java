package Bit_Manupulation;

import java.util.*;


public class clear_Last_I_Bits {


    public static int clearBits(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearBits(10,2));
    }

}

