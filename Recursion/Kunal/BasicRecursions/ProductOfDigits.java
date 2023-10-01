package BasicRecursions;

public class ProductOfDigits {
    public static void main(String[] args) {
        int result = productDigits(154342);
        System.out.println(result);
    }
    private static int productDigits(int n) {
    if (n<=9){
        return n;
    }
        return n%10 * productDigits(n/10) ;
    }
}
