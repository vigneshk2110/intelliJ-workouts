package GeeksForGeeksRecursion;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = "vicky";
        System.out.println(reverseString(s1));
    }

    private static String reverseString(String s1) {
        return reverseHelper(s1, s1.length()-1);
    }

    private static String reverseHelper(String s1, int index) {

        if (index == 0)
            return Character.toString(s1.charAt(index));

        return s1.charAt(index)
                +
                reverseHelper(s1.substring(0,index), index-1);
    }
}
