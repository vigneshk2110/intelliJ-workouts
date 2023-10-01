package CodingBatRecursion1;

public class TriangleBlockCount {
    public static void main(String[] args) {
        int row = 15;
        int result = countBlocks(row);
        System.out.println(result);
    }

    private static int countBlocks(int row) {
        if (row == 1) return 1;

        return row + countBlocks(row-1);
    }
}
