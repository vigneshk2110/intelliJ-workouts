package GeeksForGeeksRecursion;

public class StrongNumberIteration {

    public static void main(String[] args) {

        int num = 10;
        boolean result = isStrongNum(num);
        System.out.println(result);

         num = 145;
         result = isStrongNum(num);
        System.out.println(result);
    }

    private static boolean isStrongNum(int num) {
        int temp = num;
        int newNum = 0;

        while (temp>0){
            newNum += factorial(temp%10);
            temp /= 10;
        }

        return newNum == num;

    }

    private static int factorial(int i) {
        int digits = i+1;
        int answer = 1;
        while(digits>2){
            answer *= --digits;
        }

        return answer;
    }
}
