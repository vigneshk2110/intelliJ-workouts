package GeeksForGeeksRecursion;

public class EndStringWithX {

    public static void main(String[] args) {

       String result =  endX("xxre");
        System.out.println(result);

        result =  endX("xxhixx");
        System.out.println(result);

        result =  endX("xhixhix");
        System.out.println(result);

        result =  endX("aaaa");
        System.out.println(result);
    }

    private static String endX(String str) {

        if (str.length()==1) return ""+str.charAt(0);

        if (str.charAt(0) == 'x'){
            return endX(str.substring(1)) + str.charAt(0);
        }

        return str.charAt(0) + endX(str.substring(1));
    }

}
