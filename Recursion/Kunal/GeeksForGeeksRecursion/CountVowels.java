package GeeksForGeeksRecursion;

public class CountVowels {
    public static void main(String[] args) {
       String s1 = "aaaVigeeooneshiii";
       int res =      countVowels(s1);
        System.out.println(res
        );
    }

    private static int countVowels(String s1) {
        return helper(s1,0,0);
    }

    private static int helper(String s1, int index, int count) {
        if (index == s1.length()) return count;

        if(isVowel(s1.charAt(index))) {
            return helper(s1, index + 1, count + 1);
        }

        return helper(s1,index+1,count);
    }

    private static boolean isVowel(char a) {

//        if (a == 'a'||a == 'e'||a == 'i'||a == 'o'||a == 'u' ){
//            return  true;
//        }
        a = Character.toUpperCase(a);
        if (a == 'A'||a == 'E'||a == 'I'||a == 'O'||a == 'U' ){
            return  true;
        }

        return false;
    }
}
