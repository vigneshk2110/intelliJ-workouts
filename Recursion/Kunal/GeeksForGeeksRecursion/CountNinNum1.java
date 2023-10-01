package GeeksForGeeksRecursion;

//Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
//ept that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.

public class CountNinNum1 {
    public static void main(String[] args) {
        int num = 1233335333;
        int result = countNfromNum(num,3, 0);
        System.out.println(result);
    }

    private static int countNfromNum(int num, int toFind, int count) {
        if (num<=0) return count;

        if (num%10 == toFind){
            num /= 10;
            if (num%10 == toFind) {
                count += 2;
            }
            else {
                count += 1;
            }
            num*=10;
        }

        return  countNfromNum(num/10,toFind,count);
    }
}
