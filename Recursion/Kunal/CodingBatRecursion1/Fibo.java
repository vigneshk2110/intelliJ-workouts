package CodingBatRecursion1;


public class Fibo {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    private static int fib(int n) {
        if (n == 0 )
            return n;

        if (n==1 || n==2)
            return 1;

        return fib(n-1)
                +
                fib(n-2);
    }

}
