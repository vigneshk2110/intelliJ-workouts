package InterviewPrep;

import java.util.Stack;

public class Integer2Binary {
    public static void main(String[] args)
    {
        // Number to be converted into binary
        int num = 45;
        // Calling function
//        decimalToBinaryInbuiltMethod(num);
//        decimalToBinaryUsingStack(num);
        decimalToBinary(num);
    }

    static void decimalToBinaryInbuiltMethod(int num)
    {
        // Function to print integer to binary using
        // inbuilt toBinaryString method
        System.out.println(Integer.toBinaryString(num));
    }

    // Main driver function


    static void printBinary(int[] binary, int id)
    {
        // Iteration over array
        for (int i = id - 1; i >= 0; i--)
            System.out.print(binary[i] + "");
    }

    // Function converting decimal to binary
    public static void decimalToBinary(int num)
    {
        // Creating and assigning binary array size
        int[] binary = new int[35];
        int id = 0;

        // Number should be positive
        while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
        }

        // Print Binary
        printBinary(binary, id);
    }

    static void decimalToBinaryUsingStack(int num)
    {
        // Creating Stack Object Vector
        Stack<Integer> st = new Stack<>();

        // Number Should be positive
        while (num > 0) {

            // Pushing numbers inside stack that
            // are divisible by 2
            st.push(num % 2);
            // Dividing number by 2
            num = num / 2;
        }

        // Checking condition whether stack is empty
        while (!(st.isEmpty())) {
            // Printing binary number
            System.out.print(st.pop());
        }
    }

}
