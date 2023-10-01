package BasicRecursions;

public class CountSteps {
//    static int count;
    public static void main(String[] args) {
        int res = countSteps(1234);
        System.out.println(res);
    }

    private static int countSteps(int n) {
        return helper(n,0);
    }

    private static int helper(int n, int i) {
        if (n==0){
            return i;
        } else if (n%2 ==0) {
            return helper(n/2, ++i);
        }
        else {
            return helper(n-1, ++i);
        }
    }

//    private static int countSteps(int n) {
//        if(n==0){
//            return  count;
//        }
//        if (n%2 == 1){
//            ++count;
////            System.out.println(n);
//           return countSteps(n-1);
//        }
//        else {
//            ++count;
////            System.out.println(n);
//            return countSteps(n/2);
//        }
//
//    }
}
