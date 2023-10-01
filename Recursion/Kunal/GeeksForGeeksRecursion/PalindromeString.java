package GeeksForGeeksRecursion;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalindrome(s));
        s = "levele";
        System.out.println(isPalindrome(s));

    }

    private static boolean isPalindrome(String s) {
        return  s.equals(reverseString(s));
    }

    private static String reverseString(String s1) {
        return reverseHelper(s1, s1.length()-1);
    }

    private static String reverseHelper(String s1, int index) {

        if (index == 0)
            return s1.charAt(index)+"";

        return s1.charAt(index)
                +
                reverseHelper(s1.substring(0,index), index-1);
    }
}
