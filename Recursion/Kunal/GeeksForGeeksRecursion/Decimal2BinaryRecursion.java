package GeeksForGeeksRecursion;

public class Decimal2BinaryRecursion {
    public static void main(String[] args)
    {
        int N = 6; // Number to find
        System.out.print(N + " in Binary: " + getBinary(N));
    }

    private static int getBinary(int n) {

            if (n == 0)
                return 0;

            return (n % 2 + 10 * getBinary(n / 2));

    }
}
