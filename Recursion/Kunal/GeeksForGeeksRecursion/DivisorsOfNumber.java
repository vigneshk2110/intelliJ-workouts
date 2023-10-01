package GeeksForGeeksRecursion;

public class DivisorsOfNumber {

    public static void main(String[] args) {
        int x = 100;
        findDivisors(x, x/2);
    }

    private static void findDivisors(int x, int divisor) {
        if (divisor<=1) {
            System.out.println(x);
            return;
        }
        if (x%divisor == 0) System.out.println(divisor);
        findDivisors(x,divisor-1);
    }
}
