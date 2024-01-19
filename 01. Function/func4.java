package function;

public class func4 {

    public static int fact(int n) {
        int factorial = 1;
        while(n!=0)
        {
            factorial = factorial * n;
            n--;
        }
        return factorial;
    }
    public static void main(String[] args) {
        System.out.println("Factorial is: "+fact(4));
    }

}
