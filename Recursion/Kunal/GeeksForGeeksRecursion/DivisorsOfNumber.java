package GeeksForGeeksRecursion;

import java.util.ArrayList;

public class DivisorsOfNumber {

    public static void main(String[] args) {
        int x = 100;
//        findDivisors(x, x/2);

        ArrayList<Integer> result = findDivisorsList(x,1);
        System.out.println(result.toString());

    }

    private static ArrayList<Integer> findDivisorsList(int x, int divisors) {

        ArrayList<Integer> list = new ArrayList<>();

        if (divisors >= x) return list;

        if (x%divisors == 0 ) {
            list.add(divisors);
        }

        ArrayList<Integer> resFromOthers = findDivisorsList(x,++divisors);

        list.addAll(resFromOthers);

        return  list;

    }

    private static void findDivisors(int x, int divisor) {
        if (divisor<=1) {
            System.out.println(x);
            return;
        }
        if (x%divisor == 0) System.out.println(divisor);
        findDivisors(x,divisor-1);
    }
}
