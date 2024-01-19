package Heaps;

import java.util.*;

public class Insert {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            //Add at last idx
            arr.add(data);
            int child = arr.size() - 1;
            int par = (child-1)/2;
            while (arr.get(child) < arr.get(par)){
                int temp = arr.get(child);
                arr.set(child,arr.get(par));
                arr.set(par,temp);
                
                child = par;
                par = (child - 1) / 2;
            }
        }

        public int peek(){
            return arr.get(0);
        }
    }

    public static void main(String[] args) {


    }
}