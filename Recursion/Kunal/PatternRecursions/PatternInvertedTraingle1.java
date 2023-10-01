package PatternRecursions;


public class PatternInvertedTraingle1 {
    public static void main(String[] args) {
        patternInvertedTriangle(5);
    }

    private static void patternInvertedTriangle(int n) {
        printHelper(n,0);
    }

    private static void printHelper(int r, int c) {
        if (r<0) return;

        if (r>c){
            System.out.print("* ");
            printHelper(r,c+1);
        }
        else {
            System.out.println();
            printHelper(r-1, 0);
        }
    }
}
