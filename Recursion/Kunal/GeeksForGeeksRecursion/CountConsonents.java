package GeeksForGeeksRecursion;

public class CountConsonents {
    public static void main(String[] args) {
//        String s1 = "aaaVigeeooneshiii";
        String s1 = "VI--H";
        int res = countConsonents(s1,0);
        System.out.println(res);
    }

    private static int countConsonents(String s1, int index) {
        if (index == s1.length()-1) return  isConsonents(s1.charAt(index));
        return countConsonents(s1, index+1) + isConsonents(s1.charAt(index));
    }

    private static int isConsonents(char a) {

        a = Character.toUpperCase(a);
        if (a == 'A'||a == 'E'||a == 'I'||a == 'O'||a == 'U' ){
            return  0;
        }
        if (a < 65 || a>90) {
            return  0;
        }
        else {
            return 1;
        }


    }
}
