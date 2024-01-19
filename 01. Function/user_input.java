import java.util.*;

public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Input is: "+input);

        int number = sc.nextInt();
        System.out.println("Number is:"+number);
        float price = sc.nextFloat();
        System.out.println("Price is: "+price);

    }
}
