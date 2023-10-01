package BasicRecursions;

public class ReverseNum {

    static int digit;
    public static void main(String[] args) {
       int result = reverse(12345);
        System.out.println(result);
    }

    private static int reverse(int n) {

   if (n<=0){
       return 0;
   }
   digit =(digit * 10) + n%10 ;
   reverse(n/10);
    return digit;
    }
}
