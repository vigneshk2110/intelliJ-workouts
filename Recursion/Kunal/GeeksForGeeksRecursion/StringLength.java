package GeeksForGeeksRecursion;

public class StringLength {

    public static void main(String[] args) {

        String s = "Vignesh";

        int length = lengthString(s);
        System.out.println(length);

    }

    private static int lengthString(String s) {
        if (s.isEmpty()) return 0;

        return lengthString(s.substring(1)) + 1;
    }
}
