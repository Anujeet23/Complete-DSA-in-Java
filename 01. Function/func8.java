package function;

public class func8 {

    public static void binToDec(int n){
        int pow = 0;
        int dec = 0;
        int copy = n;
        while (n > 0)
        {
            int last_digit = n % 10;
            dec = dec + (last_digit * (int)Math.pow(2,pow));
            pow++;
            n = n /10;
        }
        System.out.println("Decimal is: "+dec);
    }

    public static void main(String[] args)
    {
        binToDec(10);
    }
}
