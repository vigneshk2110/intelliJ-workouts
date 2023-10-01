package BasicRecursions;

public class PrintNto1toN {
    public static void main(String[] args) {
        printNto1toN(5);
    }

    private static void printNto1toN(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNto1toN(n-1);
        if(n!=1){
            System.out.println(n);
        }
    }
}
