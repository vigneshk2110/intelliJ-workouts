package GeeksForGeeksRecursion;

public class PrintNto0toN {
    public static void main(String[] args) {
        printNto0toN(3);
    }

    private static void printNto0toN(int n) {
        System.out.println(n);
        if (n>0){
            printNto0toN(n-1);
        }
        System.out.println(n);
    }
}
