package GeeksForGeeksRecursion;


//Given a string and a non-empty substring sub,
//        compute recursively the largest substring
//        which starts and ends with sub and return its length.

//        strDist("catcowcat", "cat") → 9
//        strDist("catcowcat", "cow") → 3
//        strDist("cccatcowcatxx", "cat") → 9

public class LongestStringWithSubStringsAtBothEnds {

    public static void main(String[] args) {
        int result = strDist("catcowcat", "cat");
        System.out.println(result);
        result = strDist("catcowcat", "cow");
        System.out.println(result);
        result = strDist("cccatcowcatxx", "cat");
        System.out.println(result);

    }

    private static int strDist(String str, String sub) {

        if (str.length()<sub.length()) return 0;

        if (str.startsWith(sub) && str.endsWith(sub)){
              return str.length();
        }
        if (str.startsWith(sub)){
            return strDist(str.substring(sub.length()), sub);
        }
        if (str.endsWith(sub)){
            return strDist(str.substring(1, str.length()-sub.length()),sub);
        }
        return strDist(str.substring(1, str.length()-1),sub);
    }
}
