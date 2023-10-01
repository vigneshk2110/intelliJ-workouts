package BitwiseProblems;

public class SwapNumbers {
    public static void main(String[] args) {

        int x = 5, y = 10;
//        swapUsingBitwiseOperator(x,y);
//        swapwithAdditionAndSubraction(x,y);
        swapUsingMultiplicationAndDivision(x,y);
    }

    private static void swapUsingMultiplicationAndDivision(int x, int y) {
        x = (x * y) / (y = x);
        System.out.println("Values of x and y after swapping are "
                + x + " and " + y);
    }

    private static void swapwithAdditionAndSubraction(int x, int y) {
        x = x + y - (y = x);
        System.out.println("Values of x and y after swapping are "
                + x + " and " + y);
    }

    private static void swapUsingBitwiseOperator(int x, int y) {
        x = x ^ y ^ (y = x);
        System.out.println("Values of x and y after swapping are "
                + x + " and " + y);
    }
}
