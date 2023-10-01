package GeeksForGeeksRecursion;

public class CountOfNinNum {
    public static void main(String[] args) {
        int num = 312345331;
        int result = countNfromNum(num,3);
        System.out.println(result);
    }

    private static int countNfromNum(int num, int toFind) {
        if (num<=0) return 0;

        return (num%10==toFind?1:0) + countNfromNum(num/10,toFind);
    }
}
