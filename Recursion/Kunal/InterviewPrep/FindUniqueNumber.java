package InterviewPrep;

public class FindUniqueNumber {

    public static void main(String[] args) {
        int array[] = {1,2,2,1,3,4,5,5,9,4,3,7,6,6,7};

        System.out.println(uniqueNum(array));

    }

    private static int uniqueNum(int[] array) {
        int num=array[0];


        for (int i = 1;i<=array.length-1;i++) {
            num = num^array[i];
        }
        return  num;

    }


}
