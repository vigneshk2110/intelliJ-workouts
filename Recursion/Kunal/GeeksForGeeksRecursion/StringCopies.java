package GeeksForGeeksRecursion;

//Given a string and a non-empty substring sub,
//compute recursively if at least n copies of sub appear in the string somewhere,
//possibly with overlapping. N will be non-negative.
//
//        strCopies("catcowcat", "cat", 2) → true
//        strCopies("catcowcat", "cow", 2) → false
//        strCopies("catcowcat", "cow", 1) → true

public class StringCopies {

    public static void main(String[] args) {
        boolean result = strCopies("catcowcat", "cat", 2) ;
        System.out.println(result);

        result = strCopies("catcowcat", "cow", 2) ;
        System.out.println(result);

        result = strCopies("catcowcat", "cow", 1) ;
        System.out.println(result);
    }

    private static boolean strCopies(String str, String sub, int times) {
        return times == stringCopies(str,sub);


    }

    private static int stringCopies(String str, String sub) {
        if (str.length()<sub.length()) return 0;

        if (str.startsWith(sub)){
            return 1 + stringCopies(str.substring(sub.length()),sub);
        }

        return stringCopies(str.substring(1),sub);

    }

}
