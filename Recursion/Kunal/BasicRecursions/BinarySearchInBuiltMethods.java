package BasicRecursions;

import java.util.Arrays;

public class BinarySearchInBuiltMethods {
    public static void main(String[] args) {
        int[]arr = {10,12,14,16,18,20};
        System.out.println(Arrays.binarySearch(arr, 16));
        System.out.println(Arrays.binarySearch(arr, 18));
    }
}
