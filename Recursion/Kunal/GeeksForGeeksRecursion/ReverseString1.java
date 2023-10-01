package GeeksForGeeksRecursion;

public class ReverseString1 {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println();
        System.out.println(strRev(s));
    }

    private static String strRev(String s) {

        if(s.isEmpty()) return  "";

        return strRev(s.substring(1)) + s.charAt(0);
    }
}
