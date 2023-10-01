package ArrayRecursions;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int []arr = { 4,5,6,7,8,1,2,3,4} ;
        int result = rotatedBinarySearch(arr,3,0,arr.length-1);
        System.out.println(result);
    }

    private static int rotatedBinarySearch(int[] arr, int target, int start, int end) {

        if (start>end){
            return -1;
        }
        int mid = start + (end-start)/2;

        if (arr[mid] == target){
            return  mid;
        }

        if (arr[start]<=arr[mid] && target>=arr[start] && target<=arr[mid]){
            return rotatedBinarySearch(arr, target, start, mid);
        }
        else if (arr[start]<=arr[mid] && target>arr[start] && target>arr[mid]) {
            return rotatedBinarySearch(arr, target, mid+1, end);
        }
        else if (arr[start]>arr[mid] && target>arr[start] && target<=arr[mid]){
            return rotatedBinarySearch(arr, target, start, mid);
        }
            return rotatedBinarySearch(arr, target, mid+1, end);
    }
}
