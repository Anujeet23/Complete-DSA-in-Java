package function;

public class func9 {

    public static void decToBin(int n) {
        int pow = 0;
        int bin = 0;
        while (n != 0)
        {
            int digit = n % 2;
            bin =  bin + (digit * (int)Math.pow(10,pow) );

            pow++;
            n = n / 2;
        }
        System.out.println("Binary Number is: "+bin);
    }

    public static void main(String[] args) {
        decToBin(8);
    }
}