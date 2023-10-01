package GeeksForGeeksRecursion;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        double res = avg(arr);
        System.out.println(res);
    }

    private static double avg(int[] arr) {
        return avgHelper(arr, 0,0);
    }

    private static double avgHelper(int[] arr, int index, int sum) {
        if (index == arr.length){
            return sum/index;
        }
        return avgHelper(arr,index+1, sum+arr[index]);
    }
}
