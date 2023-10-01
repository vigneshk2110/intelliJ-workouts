package GeeksForGeeksRecursion;

//Count recursively the total number of "abc" and "aba"
//substrings that appear in the given string.


public class CountABCorABA {
    public static void main(String[] args) {
        int result = countAbc("abc") ;
        System.out.println(result);
        result =   countAbc("abcxabc") ;
        System.out.println(result);
        result =   countAbc("abaxxab");
        System.out.println(result);
    }

    private static int countAbc(String str) {
        if (str.length()<3) return 0;

        if (str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba") ){
            return  1+ countAbc(str.substring(3));
        }
        return countAbc(str.substring(1));
    }
}
