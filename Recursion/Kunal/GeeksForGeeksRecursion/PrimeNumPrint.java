package GeeksForGeeksRecursion;

public class PrimeNumPrint {
    public static void main(String[] args) {
        for (int i = 3; i < 100; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }

        }
    }

    private static boolean isPrime(int num) {

        return helper(num,2);

    }

    private static boolean helper(int num, int i) {
        if (i >= num/2) return true;

        return !(num%i == 0) && helper(num, ++i);
    }
}
