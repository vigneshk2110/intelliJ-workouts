package InterviewPrep;

public class IsOddOrEven {

    public static void main(String[] args) {
        int num = 21;

        isOddOrEven(num);
    }

    private static void isOddOrEven(int num) {
        if ((num&1) == 1){
            System.out.println("Odd Num");
        }
        else {
            System.out.println("Even Num");
        }
    }
}
