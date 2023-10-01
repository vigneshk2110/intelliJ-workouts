package BitwiseOperatorsInJava;

public class BitwiseRightShift {
    public static void main(String[] args) {
        int n = 15;
        int result = bitwiseRightShift(n, 2);
        System.out.println(result);
    }

    private static int bitwiseRightShift(int n, int shifts) {
        return n>>shifts;
    }
}
