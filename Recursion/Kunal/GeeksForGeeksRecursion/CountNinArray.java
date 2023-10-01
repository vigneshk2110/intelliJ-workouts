package GeeksForGeeksRecursion;

public class CountNinArray {
    public static void main(String[] args) {
        int [] array = {1,2,6,3,6,5,6,7,8,6};
        int result = countN(array, 6, 0, 0);
        System.out.println(result);
    }

    private static int countN(int[] array, int target, int index, int count) {
        if (index == array.length) return count;

        if (array[index] == target) return countN(array, target, index+1, count+1);

        return countN(array, target, index+1, count);
    }
}
