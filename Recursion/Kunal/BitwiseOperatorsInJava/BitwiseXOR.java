package BitwiseOperatorsInJava;

public class BitwiseXOR {

    public static void main(String[] args) {
        int i = 15;
        int j = 19;
        int result = bitwiseXOR(i,j);
        System.out.println(result);
    }

    private static int bitwiseXOR(int i, int j) {

        return i^j;
    }
}
