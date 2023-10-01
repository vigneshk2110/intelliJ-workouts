package GeeksForGeeksRecursion;

public class ArmStrongNumIteration {

    public static void main(String[] args) {
        int num = 1634;
        boolean result = isArmstrong(num);
        System.out.println(result);

        num = 169;
        result = isArmstrong(num);
        System.out.println(result);

    }

    private static boolean isArmstrong(int num) {
        int digits = (int) (Math.log10(num) +1);
        int sum = 0;
        int temp = num;

        while (temp>0){
            sum += Math.pow(temp%10, digits);
            temp /= 10;
        }

        return (sum == num);
    }
}
