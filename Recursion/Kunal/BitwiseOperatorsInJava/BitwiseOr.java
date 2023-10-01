package BitwiseOperatorsInJava;

public class BitwiseOr {
    public static void main(String[] args) {
        int i = 15;
        int j = 19;
        int result = bitwiseOr(i,j);
        System.out.println(result);
    }

    private static int bitwiseOr(int i, int j) {
        return i|j;
    }
}
