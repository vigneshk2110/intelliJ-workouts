package BasicRecursions;

public class PalindromeOrNot {
    static int digit;
    public static void main(String[] args) {
        boolean result = palindromeOrNot(123454321);
        System.out.println(result);
    }

    private static boolean palindromeOrNot(int n) {

        return n == reverse(n);
    }

    private static int reverse(int n) {

        if (n<=0){
            return 0;
        }
        digit =(digit * 10) + n%10 ;
        reverse(n/10);
        return digit;
    }
}
