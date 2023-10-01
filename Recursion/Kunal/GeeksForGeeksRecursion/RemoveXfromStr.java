package GeeksForGeeksRecursion;

public class RemoveXfromStr {
    public static void main(String[] args) {
        String str = "ABCxbuixokLxrty";
        String result = removeX(str,'x');
        System.out.println(result);
    }

    private static String removeX(String str, char x) {
        if (str.isEmpty()) return "";

        if (str.charAt(0) == x){
            return removeX(str.substring(1), x);
        }
        return str.charAt(0) + removeX(str.substring(1), x);
    }
}
