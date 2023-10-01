package GeeksForGeeksRecursion;

public class CountHi {
    public static void main(String[] args) {
        String str = "qwehifbnhi4rtyui";
        int result = countHi(str, "hi", 0);
        System.out.println(result);
    }


    private static int countHi(String str, String toFind, int count) {
        if (str.length() == 1) return count;

        if (str.substring(0,2).equals(toFind)){
            return countHi(str.substring(2), toFind, ++count);
        }
        return  countHi(str.substring(1), toFind, count);
    }
}
