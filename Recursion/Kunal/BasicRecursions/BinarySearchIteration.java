package BasicRecursions;

public class BinarySearchIteration {
    public static void main(String[] args) {
        int [] arr = {10, 12, 13, 15, 16, 17};
        int start = 0;
        int end = arr.length-1;
        int target = 16;

        int result = binSearchIteration(arr, start,end,target);
        System.out.println(result);
    }

    private static int binSearchIteration(int[] arr, int start, int end, int target) {

        int index = -1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid] == target){
                index = mid;
                break;
            }
            else if (arr[mid]>target) {
                end = mid-1;
            }
            else if (arr[mid]<target) {
                start = mid+1;
            }
        }
        return index;
    }
}
