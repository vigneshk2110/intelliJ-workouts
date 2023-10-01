package GeeksForGeeksRecursion;

import java.util.Stack;

public class Decimal2BinaryIteration {

    public static void main(String[] args) {

        int num = 100;
        int result = decimal2Binary(num);
        System.out.println(result);
    }

    private static int decimal2Binary(int num) {

        Stack<Integer> binaryStack = new Stack<>();

        while (num > 0) {
            int remainder = num%2;
            binaryStack.push(remainder);
            num = num/2;
        }

        String binaryNum = "";

        while (!binaryStack.isEmpty()){
            binaryNum += binaryStack.pop();
        }
        return Integer.valueOf(binaryNum);
    }
}
