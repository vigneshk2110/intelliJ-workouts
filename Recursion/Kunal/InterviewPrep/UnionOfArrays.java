package InterviewPrep;

import java.util.HashSet;

public class UnionOfArrays {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int b[] = {1,2,3};
        System.out.println(doUnion(a,a.length,b,b.length));

    }
    public static int doUnion(int a[], int n, int b[], int m)
    {
        HashSet<Integer> hs = new HashSet<>();

        for (int i: a
             ) {
            hs.add(i);
        }

        for (int j: b
        ) {
            hs.add(j);
        }

        return hs.size();
    }
}
