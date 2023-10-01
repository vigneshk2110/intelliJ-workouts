package GeeksForGeeksRecursion;


//Given a string and a non-empty substring sub,
//compute recursively the number of times that sub appears in the string,
// without the sub strings overlapping.
//        strCount("catcowcat", "cat") → 2
//        strCount("catcowcat", "cow") → 1
//        strCount("catcowcat", "dog") → 0

public class CountSubString {
    public static void main(String[] args) {
        int count =  strCount("catcowcat", "cat");
        System.out.println(count);
        count =  strCount("catcowcat", "cow");
        System.out.println(count);
        count =  strCount("catcowcat", "dog");
        System.out.println(count);
    }

    private static int strCount(String str, String sub) {
        if (str.length()<3) return 0;

        if (str.startsWith(sub)){
            return 1 + strCount(str.substring(3), sub);
        }
        return strCount(str.substring(1), sub);
    }
}
