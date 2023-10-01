package PatternRecursions;

public class PatternTraingle2 {

    public static void main(String[] args) {
        triangle(5,0);
    }
    private static void triangle(int r, int c) {
        if (r==0) return;
        if (r==c){
            triangle(r-1,0);
            System.out.println();
        } else if (r>c) {
            triangle(r,c+1);
            System.out.print("* ");
        }
    }
}
