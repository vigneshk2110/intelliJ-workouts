package GeeksForGeeksRecursion;

public class SumOfDigits {
    public static void main(String[] args) {

        int n = 12345;
        System.out.println(sumOfDigits(n));

    }

    private static int sumOfDigits(int n) {
        if (n<=9)return n;

        return  sumOfDigits(n/10) + n%10;
    }
}
