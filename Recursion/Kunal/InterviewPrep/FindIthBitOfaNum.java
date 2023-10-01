package InterviewPrep;

public class FindIthBitOfaNum {
    public static void main(String[] args) {
        int num = 21;
int result =         findIthBit(21, 3);
        System.out.println(result);
    }

    private static int findIthBit(int num, int ith) {
        int ithBit = (num & (1<<(ith-1)));
        return  ithBit;
    }
}
