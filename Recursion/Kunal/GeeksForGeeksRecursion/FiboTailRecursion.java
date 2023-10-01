package GeeksForGeeksRecursion;

public class FiboTailRecursion {

    public static void main(String[] args) {
        int n = 9;
        System.out.println("fib(" + n +") = "+ fib(n,0,1) );
    }

    private static int fib(int n, int i, int j) {
        if (n == 0)
            return  i;

        if (n==1 || n == 2)
            return  i+j;

        return  fib(n-1, j , i+j);

    }
}
