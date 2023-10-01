package BasicRecursions;

public class SumOfDigits {
    public static void main(String[] args) {
        int result =   digitSum(134269);
        System.out.println(result);
    }

    private static int digitSum(int n) {

        if (n<=9){
            return n;
        }

        return digitSum(n/10) + n%10;
    }
}
