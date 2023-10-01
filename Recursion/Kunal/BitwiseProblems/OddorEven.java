package BitwiseProblems;

public class OddorEven {
    public static void main(String[] args) {
        int n = 15;
        String result = oddOrEven(n);
        System.out.println(result);
    }


    private static String oddOrEven(int n) {
        if ((n & 1) != 0) {
            return n + " is odd";
        }
        else {
            return n + " is Even";
        }
    }
}
