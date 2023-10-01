package InterviewPrep;

import java.util.Stack;

public class ToBinaryConversion {
    public static void main(String[] args) {
        int num = 34;
//        covert2BinaryUsingArray(num);
//        convert2BinaryUsingStack(num);
        convert2BinaryUsingInBuiltMethod(num);
    }

    private static void convert2BinaryUsingInBuiltMethod(int num) {
        System.out.println(Integer.toBinaryString(num));
    }

    private static void covert2BinaryUsingArray(int num) {
        int array[] = new int[50];
        int index = 0;

        while (num>0){
            array[index++] = num%2;
            num = num/2;
        }

        for (int i = index-1; i >=0 ; i--) {
            System.out.print(array[i]);
        }
    }

    private static void convert2BinaryUsingStack(int num) {

        Stack<Integer> stack = new Stack<>();

        while (num>0){
            stack.push(num%2);
            num = num/2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
