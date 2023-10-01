package GeeksForGeeksRecursion;

public class SeparateIdenticalFromString {
    public static void main(String[] args) {
        String str = "Hello";
        String result = separateIdenChar(str, '*');
        System.out.println(result);
    }

    private static String separateIdenChar(String str, char c) {
        if (str.length() == 1) return "" + str.charAt(0);

        String result = "";

        if (str.charAt(0) == str.charAt(1)) {
            result = str.charAt(0) + "*";
        } else {
            result = str.charAt(0) + "";
        }
        return result + "" + separateIdenChar(str.substring(1), c);
    }
}
