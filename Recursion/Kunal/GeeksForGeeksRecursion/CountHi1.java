package GeeksForGeeksRecursion;

//Given a string, compute recursively the number of times lowercase "hi" appears in the string,
//however do not count "hi" that have an 'x' immedately before them.
public class CountHi1 {

    public static void main(String[] args) {
        int result = countHi2("ahixhi") ;
        System.out.println(result);
        result =countHi2("ahibhi")  ;
        System.out.println(result);
        result =countHi2("xhixhi") ;
        System.out.println(result);
    }

    private static int countHi2(String str) {
        if (str.length()<2) return 0;

        if (str.charAt(0) == 'x' & str.startsWith("hi", 1)){
            return countHi2(str.substring(3));
        }

        if (str.startsWith("hi")){
            return 1 + countHi2(str.substring(2));
        }

        return countHi2(str.substring(1));
    }
}
