package PatternRecursions;

public class PatternInvertedTraingle {

    public static void main(String[] args) {
        patternInvertedTraingle(9);
    }

    private static void patternInvertedTraingle(int n) {
        if (n==0){
            return;
        }
        printHelper(n);
        patternInvertedTraingle(n-1);
    }
    private static void printHelper(int n) {
        while (n>0){
            System.out.print("* ");
            n--;
        }
        System.out.println();
    }
}
