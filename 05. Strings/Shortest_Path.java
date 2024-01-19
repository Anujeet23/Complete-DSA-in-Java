package Strings;

import java.util.*;

public class Shortest_Path {

    public static double getShortestPath(String S) {
            int x = 0;
            int y = 0;
        for (int i = 0; i < S.length(); i++) {
            char dir = S.charAt(i);
            if(dir == 'N')
            {
                y = y + 1;
            }
            else if(dir == 'S')
            {
                y = y - 1;
            }
            else if (dir == 'E')
            {
                x = x + 1;
            }
            else
            {
                x = x - 1;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return Math.sqrt(X2+Y2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Sortest Path is: "+getShortestPath(str));
    }
}