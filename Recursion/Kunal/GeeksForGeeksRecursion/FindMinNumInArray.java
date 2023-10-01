package GeeksForGeeksRecursion;

public class FindMinNumInArray {

    public static void main(String[] args) {

        int[] array = {111, 34, 67, 40, 23, 77, 100};
        int res = findMininArray(array, 0);
        System.out.println(res);
    }

    private static int findMininArray(int[] array, int index) {
        if (index == array.length-1) return array[index];

        return  Math.min(findMininArray(array, index+1), array[index]);
    }
}

