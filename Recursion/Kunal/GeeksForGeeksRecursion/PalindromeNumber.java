package GeeksForGeeksRecursion;

public class PalindromeNumber {
    public static void main(String[] args) {

        int x = 1234321;
        System.out.println(isPalindrome(x));
        x = 123521;
        System.out.println(isPalindrome(x));
    }

    private static boolean isPalindrome(int x) {
        return x==revNum(x);
    }
    private static int revNum(int num) {
        if (num<=9) return num;

        return reverseHelper(num, 0);
    }

    private static int reverseHelper(int num, int reminder) {
        if (num<=9) return (reminder*10) + num;

        reminder = reminder*10;
        reminder = reminder+(num%10);

        return reverseHelper(num/10,reminder);
    }
}
