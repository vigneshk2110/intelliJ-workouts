package GeeksForGeeksRecursion;

public class FindNinArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,5,6,7,8};
        int result = findN(array, 4, 0);
        System.out.println(result);
    }

    private static int findN(int[] array,int target, int index) {
        if (index==array.length) return -1;

        if (array[index] == target) return index;

        return findN(array, target, index+1);

    }
}
