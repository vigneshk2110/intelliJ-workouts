package CodingBatRecursion1;

public class Factorial {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.print(factorial(i)+ " ");
        }
    }

    private static int factorial(int i) {

        if (i<=0)
            return 1;

        return i
                *
                factorial(i-1);
    }
}
