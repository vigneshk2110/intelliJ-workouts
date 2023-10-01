package GeeksForGeeksRecursion;

public class StrongNumRecursion {

    public static void main(String[] args) {
        int num = 10;
       int result = isStrongNum(num,1);
//        int result = isStrongNum(num);
        System.out.println(result);
        System.out.println(result == num);

        num = 145;
        result = isStrongNum(num,1);
//        result = isStrongNum(num);
        System.out.println(result);
        System.out.println(result == num);

    }

    private static int isStrongNum(int num, int answer) {
        if (num<=9) return factorial(num);

        answer = factorial(num%10);

        return answer + isStrongNum(num/10, answer);
    }

    private static int isStrongNum(int num) {
        if (num<=9) return factorial(num);

        return factorial(num%10) + isStrongNum(num/10);
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
