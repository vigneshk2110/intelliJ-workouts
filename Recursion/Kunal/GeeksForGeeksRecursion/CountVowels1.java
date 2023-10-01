package GeeksForGeeksRecursion;

public class CountVowels1 {
    public static void main(String[] args) {
        String s1 = "aaaVigeeooneshiii";
        int res =      countVowels(s1, s1.length());
        System.out.println(res
        );
    }

    private static int countVowels(String s1, int index) {
        if (index == 1) {
            return isVowel(s1.charAt(0));
        }

        return countVowels(s1, index-1)
                +
                isVowel(s1.charAt(index-1));
    }


    private static int isVowel(char a) {
        a = Character.toUpperCase(a);
        if (a == 'A'||a == 'E'||a == 'I'||a == 'O'||a == 'U' ){
            return  1;
        }

        return 0;
    }
}
