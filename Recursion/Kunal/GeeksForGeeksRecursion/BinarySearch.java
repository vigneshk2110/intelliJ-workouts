package GeeksForGeeksRecursion;

public class BinarySearch {

    public static void main(String[] args) {
        int [] array = {10,12,14,16,18,21};
        int res = binarySearch(array,20);
        System.out.println(res);
    }

    private static int binarySearch(int[] array, int target) {

        return searchHelper(array,0, array.length-1, target);
    }

    private static int searchHelper(int[] array, int start, int end, int target) {
        if (target>array[array.length-1] || target<array[array.length-1] ){
            return -1;
        }

        int mid = start+ (end-start)/2;

        if (array[mid] == target) return mid+1;

        if (target<=array[mid]){
            return searchHelper(array, start, mid, target);
        }
        return searchHelper(array, mid+1, end, target);

    }
}
