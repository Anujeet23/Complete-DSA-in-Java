package Bit_Manupulation;

import java.util.*;

public class getBit {
    public static int getIthBit(int n,int i) {
        int bitMask = 1<<i;

        if ((n & bitMask) == 0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    public static void main(String[] args) {
        getIthBit(10,2);
    }
}