package GeeksForGeeksRecursion;

public class PowerOfNum {
    public static void main(String[] args) {
        int num = 12;
        int pow = 4;

        int res = powerNum(num,pow);
        System.out.println(res);

    }

    private static int powerNum(int num, int pow) {
        if (pow == 1) return num;

        return  num * powerNum(num, pow-1);
    }
}
