package GeeksForGeeksRecursion;

public class PerfectNumberIteration {

    public static void main(String[] args) {
        int num = 6;
        System.out.println( num == isProperNum(num));
        num = 28;
        System.out.println( num == isProperNum(num));
        num = 26;
        System.out.println( num == isProperNum(num));

    }

    private static int isProperNum(int num) {
        int sum = 0;
        int temp = num/2;

        while (temp>0){
            if (num%temp == 0) sum += temp;
            temp--;
        }
        return sum;
    }

}
