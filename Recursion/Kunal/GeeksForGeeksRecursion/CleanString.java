package GeeksForGeeksRecursion;

//Given a string, return recursively a "cleaned" string where adjacent chars
//that are the same have been reduced to a single char. So "yyzzza" yields "yza".

public class CleanString {
    public static void main(String[] args) {
       String result =  stringClean("yyzzza");
        System.out.println(result);
        result =  stringClean("abbbcdd") ;
        System.out.println(result);
        result =  stringClean("Hello");
        System.out.println(result);

    }

    private static String stringClean(String str ) {
        if (str.length()<=1) return str;

        if (str.charAt(0)==str.charAt(1)){
            return   stringClean(str.substring(1));
        }
        return  str.charAt(0) + stringClean(str.substring(1));
    }
}
