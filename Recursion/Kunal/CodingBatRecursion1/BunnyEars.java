package CodingBatRecursion1;

public class BunnyEars {

    public static void main(String[] args) {
        int result = countBunnyEars(25);
        System.out.println(result);
    }

    private static int countBunnyEars(int n) {
        if (n <= 0) return 0;

        return  2 + countBunnyEars(n-1);
    }
}
