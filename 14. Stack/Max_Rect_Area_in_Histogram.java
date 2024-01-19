package Stack;

import java.util.*;

public class Max_Rect_Area_in_Histogram {


    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //Next Smaller Right
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length-1; i >0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nsr[i] = arr.length;
            }
            else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //Next Smaller Left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            //Removing larger values from stack
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nsl[i] = -1;
            }
            else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //Current Area
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int crrArea = height * width;
            maxArea = Math.max(crrArea,maxArea);
        }
        System.out.println("Maximum area in Histogram is: "+maxArea);
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};//Heights
        int arr1[] = {2,4};

        maxArea(arr);
        maxArea(arr1);

    }
}