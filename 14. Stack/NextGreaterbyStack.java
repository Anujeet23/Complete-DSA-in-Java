package Stack;

import java.util.*;

public class NextGreaterbyStack {

    public static void nextGreater(int arr[], Stack<Integer> s) {
        for (int i = arr.length-1; i >=0; i--) {

        }
    }

    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for (int i = arr.length-1; i >=0; i--) {
            //While loop
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            //If-Else
            if (s.isEmpty()){
                nxtGreater[i] = -1;
            }
            else
            {
                nxtGreater[i] = arr[s.peek()];
            }

            //Push in stack
            s.push(i);
        }

        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
    }
}