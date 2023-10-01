package GeeksForGeeksRecursion;

import java.util.Arrays;

public class CopyString {
    public static void main(String[] args) {
        String s1 = "vignesh";
        char[] c1 =s1.toCharArray();
        char[] c2 = new char[c1.length];

        copy1to2(c1,c2,0);

//        System.out.println(Arrays.toString(c2));
        System.out.println(String.valueOf(c2));

    }

    private static void copy1to2(char[] c1, char[] c2, int i) {
        if (i == c1.length) return;

        c2[i] = c1[i];
        copy1to2(c1, c2, ++i);

    }
}
