package Bit_Manupulation;

import java.util.*;

public class clear_bits_in_range {
    public static int clearBitsInRange(int n, int i,int j) {
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a | b;

        return bitMask & n;
    }

    public static void main(String[] args) {
        System.out.println(clearBitsInRange(10,2,4));
    }
}
