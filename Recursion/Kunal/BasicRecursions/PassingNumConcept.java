package BasicRecursions;

public class PassingNumConcept {
    public static void main(String[] args) {
        pass(5);
    }

    private static void pass(int n) {
        if (n==0){
            return;
        }
        System.out.println(n);
//        pass(n--);
        pass(--n);

    }
}
