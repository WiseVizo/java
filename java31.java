
// Hashset -> stores values in randmon format , has no index, and don't allow duplicate values

import java.util.Collection;
import java.util.HashSet;

public class java31 {
    public static void main(String[] args) {
        Collection <Integer> ar = new HashSet<Integer>();
        ar.add(1);
        ar.add(200);
        ar.add(30);
        ar.add(4);
        ar.add(5);

        System.out.println(ar);
    }
}
