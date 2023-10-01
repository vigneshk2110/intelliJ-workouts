package GeeksForGeeksRecursion;

public class PrimeOrNot {

    public static void main(String[] args) {
        int num = 533;

        boolean res = isPrime(num);
        System.out.println(res);
    }

    private static boolean isPrime(int num) {

        return helper(num,2);

    }

    private static boolean helper(int num, int i) {
        if (i >= num/2) return true;

        return !(num%i == 0) && helper(num, ++i);
    }
}
