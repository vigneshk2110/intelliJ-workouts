package GeeksForGeeksRecursion;

public class IsSorted {

    public static void main(String[] args) {
        int[] arr = { 20, 23, 23, 45, 78, 88 };
        System.out.println(isSorted(arr,0));

        int[] arr1 = { 20, 23, 23, 45, 78, 18 };
        System.out.println(isSorted(arr1,0));
    }

    private static boolean isSorted(int[] arr, int index) {
        if (index == arr.length-1) return arr[index-1]<=arr[index];

        return isSorted(arr, index+1) && arr[index]<=arr[index+1];
    }
}
