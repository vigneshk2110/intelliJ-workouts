package ArrayRecursions;

public class IsSortedArray {
    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5,6};
        int [] arr = {1, 2, 5, 7, 8};
//                {90, 23, 5, 109, 12, 22, 67, 34};
//                {1,12,36,4,15,6};

        boolean res =   isSorted(arr, 0,1);
        System.out.println(res);
    }

    private static boolean isSorted(int[] arr, int index1, int index2) {
        if (index2==arr.length){
            return true;
        }
        if (arr[index1]<= arr[index2]){
            return isSorted(arr, ++index1, ++index2);
        }
            return  false;
    }
}