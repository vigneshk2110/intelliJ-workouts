package GeeksForGeeksRecursion;

public class PrintStarInString {
    public static void main(String[] args) {
        String str = "Vignesh";
        String result = printStar(str, '*');
        System.out.println(result);
    }

    private static String printStar(String str, char c) {

        if (str.length()==1) return str.charAt(0)+"";

        return str.charAt(0) +""+ c + printStar(str.substring(1),c);
    }
}
