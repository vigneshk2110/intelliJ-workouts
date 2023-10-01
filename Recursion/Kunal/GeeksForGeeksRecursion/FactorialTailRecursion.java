package GeeksForGeeksRecursion;

public class FactorialTailRecursion {

    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    private static int fact(int n) {

        return factorial(n-1, n*1);
    }

    private static int factorial(int n, int a) {
        if (n<=0) return a;

        return factorial(n-1, n*a);
    }
}
//n | n-1 | a | f(n-1, n*a)
//5 | 4 | 1 | f(4, 5)
//4 | 3 | 5 | f(3, 20)
//3 | 2 | 20 | f(2, 60)
//2 | 1 | 60 | f(2, 120)
//1 | 0 | 120 | f(1, 120)
//0 | - | - | Return a - 120

