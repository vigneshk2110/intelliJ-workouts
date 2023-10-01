package ArrayRecursions;

public class IsSortedArray1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
//        int [] arr =
//                {1, 2, 5, 7, 8};
//                {90, 23, 5, 109, 12, 22, 67, 34};
//                {1,12,36,4,15,6};

        boolean res =   isSorted(arr, 0);
        System.out.println(res);

    }

    private static boolean isSorted(int[] arr, int index1) {
        if (index1==arr.length-1){
            return true;
        }
            return  arr[index1]<= arr[index1+1] && isSorted(arr, ++index1);
    }
}
