package ArrayRecursions;

public class LinearSearchFromLast {
    public static void main(String[] args) {
        int [] arr =  {90, 23, 5, 109, 12, 22, 67, 34};
//                {1,2,3,4,5,6};
        int result = linearSearchFromLast(arr,22,arr.length-1);
        System.out.println(result);
    }

    private static int linearSearchFromLast(int[] arr, int target, int index) {
        if (index == -1){
            return -1;
        } else if (arr[index] == target) {
            return index;
        }

        return linearSearchFromLast(arr,target,--index);
    }
}
