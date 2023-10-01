package GeeksForGeeksRecursion;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int n = 1234;
        double result =  isArmstrongNUm(n,  (int)Math.log10(n) +1);
        System.out.println(result == (double)n);

        n = 153;
        result =  isArmstrongNUm(n,  (int)Math.log10(n) +1);
        System.out.println(result == (double)n);
    }

    private static double isArmstrongNUm(int n, int digits) {

        if (n<=9) return Math.pow(n, digits);

        return  Math.pow(n%10, digits) + (isArmstrongNUm(n/10, digits));

    }
}
