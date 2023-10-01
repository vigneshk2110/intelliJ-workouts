package SortingRecursions;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {12, 11, 176, 19, 2,22, 6};

        bubblesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubblesort(int[] arr, int start, int end) {

        if (end == 0) return;

        if (start < end && arr[start] > arr[start+1]){
            swapElements(arr, start);
            bubblesort(arr, start+1, end);
        } else if (start < end &&  arr[start] <= arr[start+1]) {
            bubblesort(arr, start+1, end);
        }
        if (end>0){
            bubblesort(arr, 0, end-1);
        }
    }

    private static void swapElements(int[] arr, int start) {
        int temp = arr[start];
        arr[start] = arr[start+1];
        arr[start+1] = temp;
    }
}
