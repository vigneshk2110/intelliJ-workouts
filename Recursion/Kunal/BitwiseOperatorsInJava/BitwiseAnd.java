package BitwiseOperatorsInJava;

public class BitwiseAnd {
    public static void main(String[] args) {
        int i = 15;
        int j = 19;
        int result = bitwiseAnd(i,j);
        System.out.println(result);
    }

    private static int bitwiseAnd(int i, int j) {

        return i & j;
    }
}
