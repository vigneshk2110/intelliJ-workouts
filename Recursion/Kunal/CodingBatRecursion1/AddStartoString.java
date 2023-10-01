package CodingBatRecursion1;


//Given a string, compute recursively a new string
//        where all the adjacent chars are now separated by a "*".
//
//        allStar("hello") → "h*e*l*l*o"
//        allStar("abc") → "a*b*c"
//        allStar("ab") → "a*b"

public class AddStartoString {
    public static void main(String[] args) {
        String str = "abc";
        String result = addStar(str, '*', "");
        System.out.println(result);

        str = "hello";
        result = addStar(str, '*', "");
        System.out.println(result);

        str = "ab";
        result = addStar(str, '*', "");
        System.out.println(result);

    }

    private static String addStar(String str, char star, String result) {
        if (str.length()==1) return str;

        return ""+str.charAt(0) +star+ addStar(str.substring(1), star, result);
    }
}
