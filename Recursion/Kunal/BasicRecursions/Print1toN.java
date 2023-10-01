package BasicRecursions;

public class Print1toN {
    public static void main(String[] args) {
        print1toN(5);
    }

    private static void print1toN(int n) {
        if (n == 0){
            return;
        }
        print1toN(n-1);
        System.out.println(n);

    }
}
