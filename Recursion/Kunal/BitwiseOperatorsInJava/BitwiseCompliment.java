package BitwiseOperatorsInJava;

public class BitwiseCompliment {
    public static void main(String[] args) {
        int i = 15;
        int result = bitwiseComplement(i);
        System.out.println(result);
    }

    private static int bitwiseComplement(int i) {
        return ~i;
    }

}
