package GeeksForGeeksRecursion;

public class ReverseNum {
    public static void main(String[] args) {
        int num = 54321;
        int res=revNum(num);
        System.out.println(res);

        num = 2;
        res=revNum(num);
        System.out.println(res);

        num = 9849;
        res=revNum(num);
        System.out.println(res);

    }

    private static int revNum(int num) {
        if (num<=9) return num;

        return reverseHelper(num, 0);
    }

    private static int reverseHelper(int num, int reminder) {
        if (num<=9) return (reminder*10) + num;

        reminder = (reminder*10)+(num%10);

        return reverseHelper(num/10,reminder);
    }
}
