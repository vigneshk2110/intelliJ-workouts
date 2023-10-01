package GeeksForGeeksRecursion;

public class ChangeXY {

    public static void main(String[] args) {
        System.out.println(changeXY("codex",""));
        System.out.println(changeXY("xxhixx",""));
        System.out.println(changeXY("xhixhix",""));
    }

    private static String changeXY(String codex, String result) {
        if (codex.isEmpty()) return "";

        if (codex.charAt(0) == 'x'){
            result = "y";
        }
        else {
            result = ""+codex.charAt(0);
        }

        return result + changeXY(codex.substring(1),result);
    }
}
