package BasicRecursions;

public class Sum1toN {
    public static void main(String[] args) {
       int result = sum1toN(10);
        System.out.println(result);
    }
    private static int sum1toN(int n) {
        if (n==0){
            return  n;
        }
        return  n + sum1toN(n-1);
    }
}
