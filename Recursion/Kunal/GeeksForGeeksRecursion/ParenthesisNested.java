package GeeksForGeeksRecursion;

//Given a string, return true if it is a nesting of zero or more pairs of parenthesis,
//like "(())" or "((()))". Suggestion: check the first and last chars,
//and then recur on what's inside them.
//
//        nestParen("(())") → true
//        nestParen("((()))") → true
//        nestParen("(((x))") → false
public class ParenthesisNested {
    public static void main(String[] args) {
        boolean result = nestParen("(())");
        System.out.println(result);
        result = nestParen("((((()))))");
        System.out.println(result);
        result = nestParen("(((X))))");
        System.out.println(result);
        result = nestParen("(((X)))");
        System.out.println(result);
    }

    private static boolean nestParen(String str) {

        if (str.isEmpty()) return true;

        if (!(str.equals("(") || str.equals(")"))  && str.length()==1) return true;

        if (str.charAt(0) == '(' && str.charAt(str.length()-1) == ')'){
            return nestParen(str.substring(1,str.length()-1));
        }
        return false;
    }
}
