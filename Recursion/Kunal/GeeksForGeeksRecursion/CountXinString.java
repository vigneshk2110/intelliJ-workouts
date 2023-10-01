package GeeksForGeeksRecursion;

public class CountXinString {
    public static void main(String[] args) {
         String str = "XXXccnnhhiikkssSDflloorrXxxtyuiFxxrtshjx";
         int result = countX(str,0, 'r');
        System.out.println(result);
    }

    private static int countX(String str, int count , char toFind) {
        if (str.isEmpty()) return count;

        count +=  str.charAt(0) == toFind? 1:0;

        return  countX(str.substring(1), count,toFind);
    }
}
