package BasicRecursions;

public class BinarySearchRecursive {

    public static void main(String[] args) {

        int[] arr = {12, 14, 15, 17, 34, 45, 56, 78};
        int start = 0, end = arr.length - 1;
        int target = 56;

        int result = binsearch(arr, start, end, target);
        System.out.println(result);
    }

    private static int binsearch(int[] arr, int startIndex, int endIndex, int target) {
        if (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex-startIndex)  / 2;

            if (arr[midIndex] == target) {
                return midIndex;
            } else if (arr[midIndex] > target) {
                return binsearch(arr, startIndex, midIndex - 1, target);
            } else if (arr[midIndex] < target) {
                return binsearch(arr, midIndex + 1, endIndex, target);
            }
        }
        return -1;
    }
}
