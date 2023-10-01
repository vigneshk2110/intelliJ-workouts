package SortingRecursions;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {12, 11, 176, 19, 2,22, 6};

        selectionSort(arr,0, 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr, int start,int max, int end) {

        if (end == 0) return;

        if (start < end ){
            if (arr[start]>arr[start+1]){
                max = start;

            }


        }
        else {
            selectionSort(arr,start,0,end-1);
        }



    }


    private static void swapElements(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
