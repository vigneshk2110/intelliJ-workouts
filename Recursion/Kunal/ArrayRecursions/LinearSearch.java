package ArrayRecursions;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr =  {90, 23, 5, 109, 12, 22, 67, 34};
//                {1,2,3,4,5,6};
        int result = linearSearch(arr,23,0);
        System.out.println(result);
    }
    private static int linearSearch(int[] arr, int target, int index) {
        if (index == arr.length){
            return  -1;
        } else if (arr[index] == target) {
            return index;
        }
        return linearSearch(arr,target,++index);
    }
}
