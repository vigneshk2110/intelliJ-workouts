package GeeksForGeeksRecursion;

public class CountDigits {
    public static void main(String[] args) {
        int num = 342391;
        int digits = countDigits(num,0);
        System.out.println(digits);
    }

    private static int countDigits(int num, int count) {
        if (num<=9) return ++count;

        return countDigits(num/10, ++count);
    }

//    private static int countDigits(int num, int count) {
//        if (num<=9)
//            return ++count;
//
//        return countDigits(num/10, count)
//                +
//                ++count;
//    }

//    private static int countDigits(int num, int count) {
//        while (num>0){
//            count++;
//            num = num/10;
//        }
//        return  count;
//    }


}
