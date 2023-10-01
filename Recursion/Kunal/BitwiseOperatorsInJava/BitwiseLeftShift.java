package BitwiseOperatorsInJava;

public class BitwiseLeftShift {
    public static void main(String[] args) {
        int n = 15;
        int result = bitwiseLeftShift(n, 10);
        System.out.println(result);
    }

    private static int bitwiseLeftShift(int n, int shifts) {
        return n<<shifts;
    }

}
