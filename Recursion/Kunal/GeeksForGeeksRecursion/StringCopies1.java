package GeeksForGeeksRecursion;

//Given a string and a non-empty substring sub,
//compute recursively if at least n copies of sub appear in the string somewhere,
//possibly with overlapping. N will be non-negative.
//
//        strCopies("catcowcat", "cat", 2) → true
//        strCopies("catcowcat", "cow", 2) → false
//        strCopies("catcowcat", "cow", 1) → true

public class StringCopies1 {
    public static void main(String[] args) {
        boolean result = strCopies("catcowcat", "cat", 2) ;
        System.out.println(result);

        result = strCopies("catcowcat", "cow", 2) ;
        System.out.println(result);

        result = strCopies("catcowcat", "cow", 1) ;
        System.out.println(result);
    }

    private static boolean strCopies(String str, String sub, int n) {
        if (str.length()<sub.length()) return n==0;

        if (str.startsWith(sub)){
            return strCopies(str.substring(sub.length()), sub, n-1);
        }
        return strCopies(str.substring(1), sub, n);
   }
}
