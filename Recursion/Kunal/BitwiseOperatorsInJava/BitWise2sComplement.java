package BitwiseOperatorsInJava;

public class BitWise2sComplement {
    public static void main(String[] args) {
        int i = 12;
        int result = bitwise2sComplement(i);
        System.out.println(result);
    }

    private static int bitwise2sComplement(int i) {
        return -(256-i);
    }
}
