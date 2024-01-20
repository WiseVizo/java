
// TreeSet -> same as HashSet but everything is sorted 

import java.util.Collection;
import java.util.TreeSet;

public class java32 {
    public static void main(String[] args) {
        Collection <Integer> ar = new TreeSet<Integer>();
        ar.add(1);
        ar.add(200);
        ar.add(30);
        ar.add(4);
        ar.add(5);

        System.out.println(ar);
    }
}
