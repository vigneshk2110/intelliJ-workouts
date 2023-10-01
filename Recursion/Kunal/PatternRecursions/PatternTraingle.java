package PatternRecursions;

public class PatternTraingle {
    public static void main(String[] args) {
        patternTriangle(5);
    }

    private static void patternTriangle(int n) {
        if (n==0) return;

        patternTriangle(n-1);
        printHelper(n);
    }
    private static void printHelper(int n) {
        while (n>0){
            System.out.print("* ");
            n--;
        }
        System.out.println();
    }
}
