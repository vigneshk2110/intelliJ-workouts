package GeeksForGeeksRecursion;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int biNum =
//                10101110;
        1101;
        int result = convert2Decimal(biNum);
        System.out.println(result);
    }

    private static int convert2Decimal(int biNum) {
        return helper(biNum, 0, 0);
    }

    private static int helper(int biNum, int answer, int power) {
        if (biNum<=0) return answer;

        answer = (int) (answer + ((biNum%10)  * Math.pow(2,power)));

        return helper(biNum/10, answer, power+1);
    }

}
