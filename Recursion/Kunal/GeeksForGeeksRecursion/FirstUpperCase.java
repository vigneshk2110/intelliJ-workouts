package GeeksForGeeksRecursion;

public class FirstUpperCase {
    public static void main(String[] args) {
        String s = "vigebtyhG";
        System.out.println(firstUpperCase(s,0));
    }

    private static char firstUpperCase(String s, int i) {
        if (i == s.length()) return '-';

        if (Character.isUpperCase(s.charAt(i))) return s.charAt(i);

        return firstUpperCase(s,++i);
    }
}
