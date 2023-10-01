package BasicRecursions;

public class Count0sinNum {
    static  int count;
    public static void main(String[] args) {
        int nums = count0s(120200904);
        System.out.println(nums);
    }

    private static int count0s(int n) {
        if (n<=9){
            return count;
        }
        if (n%10 == 0){
            ++count;
        }

        return  count0s(n/10);
    }
}
